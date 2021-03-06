#
# Poky configuration to use its Original (Old) Softfloat ABI
#
TARGET_VENDOR = "-poky"

PREFERRED_PROVIDER_virtual/${TARGET_PREFIX}libc-for-gcc = "glibc"
PREFERRED_PROVIDER_virtual/${TARGET_PREFIX}binutils = "binutils-cross"
PREFERRED_PROVIDER_virtual/${TARGET_PREFIX}gcc-initial = "gcc-cross-initial"
PREFERRED_PROVIDER_virtual/${TARGET_PREFIX}gcc = "gcc-cross"
PREFERRED_PROVIDER_virtual/${TARGET_PREFIX}g++ = "gcc-cross"

PREFERRED_VERSION_binutils ?= "2.16"
PREFERRED_VERSION_binutils-cross ?= "2.15.94.0.1"
PREFERRED_VERSION_binutils-cross-sdk ?= "2.15.94.0.1"
PREFERRED_VERSION_gcc ?= "3.4.4"
PREFERRED_VERSION_gcc-cross ?= "3.4.4"
PREFERRED_VERSION_gcc-cross-initial ?= "3.4.4"
PREFERRED_VERSION_gcc-cross-sdk ?= "3.4.4"
PREFERRED_VERSION_linux-libc-headers ?= "2.6.11.1"
PREFERRED_VERSION_glibc ?= "2.3.5+cvs20050627"
PREFERRED_VERSION_elfutils ?= "0.89"

GLIBCTARGETOS = "linux"
UCLIBCTARGETOS = "linux-uclibc"

# gcc 3.x needs a different arm926ejs option
TARGET_CC_ARCH_qemuarm = "-march=armv5te -mtune=arm926ejs"
