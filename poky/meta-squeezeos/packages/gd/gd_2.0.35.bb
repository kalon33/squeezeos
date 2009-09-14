SECTION = "libs"
LICENSE = "GD"
DESCRIPTION = "gd is a library used to create PNG, JPEG, or WBMP images."
DEPENDS = "libpng jpeg zlib freetype"
PR = "r3"

SRC_URI = "http://www.libgd.org/releases/gd-${PV}.tar.gz"
S = "${WORKDIR}/gd-${PV}"

inherit autotools binconfig gettext

EXTRA_OECONF += " --with-zlib=${STAGING_LIBDIR}/.. \
                  --with-png=${STAGING_LIBDIR}/.. \
                  --with-jpeg=${STAGING_LIBDIR}/.. \
                  --with-freetype=${STAGING_LIBDIR}/.. \
                  --without-fontconfig \
                  --without-xpm \
                  --without-x"

EXTRA_OEMAKE = "LDFLAGS=-L${STAGING_LIBDIR}"

headers = "gd.h gdcache.h gd_io.h gdfx.h gdfontmb.h \
	   gdfontg.h gdfontl.h gdfonts.h gdfontt.h"

do_stage () {
	oe_libinstall -so -a libgd ${STAGING_LIBDIR}/
	for i in ${headers}; do
		install -m 0644 $i ${STAGING_INCDIR}/
	done
}