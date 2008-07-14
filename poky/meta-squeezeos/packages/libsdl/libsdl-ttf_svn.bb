DESCRIPTION = "SDL TTF library"
SECTION = "libs"
LICENSE = "LGPL"

BV = "2.0.8"

PV = "${BV}+svnr${SRCREV}"
PR = "r1"

DEPENDS = "libsdl freetype"
RDEPENDS = "libsdl freetype"

SRC_URI="${SQUEEZEPLAY_SCM};module=SDL_ttf-${BV} \
	file://SDL_ttf-no-internals.patch;patch=1"

S = "${WORKDIR}/SDL_ttf-${BV}"

inherit autotools

autotools_do_configure() {
	${S}/autogen.sh
	oe_runconf
}

do_stage() {
	autotools_stage_all
}
