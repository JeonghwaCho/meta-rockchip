# Copyright (C) 2017 Fuzhou Rockchip Electronics Co., Ltd
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-kernel/linux/linux-yocto.inc

SRC_URI = " \
	git://github.com/rockchip-linux/kernel.git;branch=release-4.4; \
	file://0001-arm-dts-rk3288-evb-back-to-linux.patch \
"

SRCREV = "dd19ce4b833e1725d6dcb3986af31099a1ba7beb"
LINUX_VERSION = "4.4.70"

# Override local version in order to use the one generated by linux build system
# And not "yocto-standard"
LINUX_VERSION_EXTENSION = ""
PR = "r1"
PV = "${LINUX_VERSION}"

# Include only supported boards for now
COMPATIBLE_MACHINE = "(rk3036|rk3288|rk3328|rk3399)"
deltask kernel_configme

KBUILD_DEFCONFIG = "rockchip_linux_defconfig"
