DESCRIPTION = "GIF Library"
HOMEPAGE = "http://sourceforge.net/projects/giflib/"
LICENSE = "giflib"
SECTION = "libs"
PR = "r2"

SRC_URI = "${SOURCEFORGE_MIRROR}/giflib/giflib-${PV}.tar.bz2"

ARM_INSTRUCTION_SET = "arm"

inherit autotools

do_stage () {
	install -m 0644 lib/gif_lib.h ${STAGING_INCDIR}/gif_lib.h
	oe_libinstall -a -so libgif ${STAGING_LIBDIR}
}

do_rm_work () {
	echo "** DID NOT REMOVE GIF LIBRARY FILES **"
}

PACKAGES += "giflib-bin"
FILES_${PN} = "${libdir}/libgif.so.*"
FILES_giflib-bin = "${bindir}/*"

