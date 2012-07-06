GCC=gcc
TOOL=$(THINJ_HOME)
TOOLINC=$(TOOL)/inc
TOOLLIB=$(TOOL)/lib

OBJ = main.o alltests.o

.c.o:
	$(GCC) -I$(TOOLINC) $< -c


all: $(OBJ)
	$(GCC) $(OBJ) -o alltests -L$(TOOLLIB)  -l thinjvm
 
.PHONY: clean

clean:
	@rm -f $(OBJ) alltests 
