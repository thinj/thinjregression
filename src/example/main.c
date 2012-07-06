/*
 * main.c
 *
 *  Created on: Jun 22, 2012
 *      Author: hammer
 */

#include "thinjvm.h"


unsigned char heap[9000];
int main() {
	// Start the VM:
	thinjvm_run(heap, sizeof(heap));

	// Unreachable:
	return 0;
}

void thinj_putchar(char ch) {
	putchar(ch);
}

void thinjvm_exit(int exit_code) {
	exit(exit_code);
}
