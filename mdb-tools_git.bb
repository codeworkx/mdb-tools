SUMMARY = "MDB Tools is a set of programs to help you use Microsoft Access file in various settings."
HOMEPAGE = "https://github.com/brianb/mdbtools"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${WORKDIR}/LICENSE.txt;md5=75859989545e37968a99b631ef42722e"
PV = "0.7.1+git${SRCPV}"

DEPENDS = "glib-2.0"

inherit autotools-brokensep pkgconfig

SRCREV = "d6f5745d949f37db969d5f424e69b54f0da60b9b"
SRC_URI = "git://github.com/brianb/mdbtools.git \
	   file://LICENSE.txt \
"

S = "${WORKDIR}/git"

EXTRA_OECONF = "--disable-man"