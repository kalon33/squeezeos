/* $Id: current.h 1763 2006-09-22 01:22:23Z dean $
 *
 * This file is subject to the terms and conditions of the GNU General Public
 * License.  See the file "COPYING" in the main directory of this archive
 * for more details.
 *
 * Copyright (C) 1998, 1999 Ralf Baechle
 */
#ifndef _ASM_CURRENT_H
#define _ASM_CURRENT_H

#ifdef _LANGUAGE_C

/* MIPS rules... */
register struct task_struct *current asm("$28");

#endif /* _LANGUAGE_C */
#endif /* _ASM_CURRENT_H */