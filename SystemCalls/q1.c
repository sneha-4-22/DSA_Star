#include <stdio.h>
#include <stdlib.h>
#include <dirent.h>
int main() {
    DIR *directory;
    struct dirent *entry;
    directory = opendir(".");
    if (directory == NULL) {
        perror("Error opening directory");
        exit(EXIT_FAILURE);
    }
    while ((entry = readdir(directory)) != NULL) {
        printf("%s\n", entry->d_name);
    }
    closedir(directory);
    return 0;
}
