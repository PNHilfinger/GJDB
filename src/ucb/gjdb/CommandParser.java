/* A Bison parser, made by GNU Bison 2.3j6.  */

/* Skeleton parser for Yacc-like parsing with Bison, Java version

   Copyright (C) 1984, 1989, 1990, 2000, 2001, 2002, 2003, 2004, 2005 Free
   Software Foundation, Inc.

   This program is free software; you can redistribute it and/or modify
   it under the terms of the GNU General Public License as published by
   the Free Software Foundation; either version 2, or (at your option)
   any later version.

   This program is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
   GNU General Public License for more details.

   You should have received a copy of the GNU General Public License
   along with this program; if not, write to the Free Software
   Foundation, Inc., 51 Franklin Street, Fifth Floor,
   Boston, MA 02110-1301, USA.  */

/* As a special exception, you may create a larger work that contains
   part or all of the Bison parser skeleton and distribute that work
   under terms of your choice, so long as that work isn't itself a
   parser generator using the skeleton or a modified version thereof
   as a parser skeleton.  Alternatively, if you modify or redistribute
   the parser skeleton itself, you may (at your option) remove this
   special exception, which will cause the skeleton and the resulting
   Bison output files to be licensed under the GNU General Public
   License without this special exception.

   This special exception was added by the Free Software Foundation in
   version 2.2 of Bison.  */

/* As a special exception, when this file is copied by Bison into a
   Bison output file, you may use that output file without restriction.
   This special exception was added by the Free Software Foundation
   in version 1.24 of Bison.  */

/* Written by Richard Stallman by simplifying the original so called
   ``semantic'' parser.  Adopted for Java by P. N. Hilfinger */

/* All symbols defined below should begin with yy or YY, to avoid
   infringing on user name space.  This should be done even for local
   variables, as they might otherwise be expanded by user macros.
   There are some unavoidable exceptions within include files to
   define necessary library symbols; they are noted "INFRINGES ON
   USER NAME SPACE" below.  */

/* Identify Bison output.  */


/* Bison version.  */


/* Skeleton name.  */


/* Pure parsers.  */


/* Using locations.  */





   package ucb.gjdb;

   import com.sun.jdi.*;
   import com.sun.jdi.request.*;

   import java.io.BufferedReader;
   import java.io.IOException;

   import java.util.Stack;
   import java.util.Collections;
   import java.util.Stack;
   import java.util.List;
   import java.util.ArrayList;
   import java.util.HashMap;
   import java.util.regex.Pattern;
   import java.util.regex.Matcher;
   import java.util.Formatter;

   import static ucb.gjdb.CommandException.ERROR;

   class CommandParser
{

/* Tokens.  */
   public static final int
     WORD = 258,
     TEXT = 259,
     INTLIT = 260,
     CHARLIT = 261,
     STRINGLIT = 262,
     IDENT = 263;

/* Copy the first part of user declarations.  */

/* End first part of user declarations.  */





/* TEMPORARY CHANGE: FIXME */





static int YYLTYPE_INIT;

/* Enabling traces.  */




/* Enabling verbose error messages.  */







/* Copy the second part of user declarations.  */


/* Line 221 of yacc.java.  */
// _line_ 115 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.java"



/* YYFINAL -- State number of the termination state. */

/* YYLAST -- Last index in YYTABLE.  */


/* YYNTOKENS -- Number of terminals. */

/* YYNNTS -- Number of nonterminals. */

/* YYNRULES -- Number of rules. */

/* YYNRULES -- Number of states. */


/* YYTRANSLATE(YYLEX) -- Bison symbol number corresponding to YYLEX.  */






/* YYTRANSLATE[YYLEX] -- Bison symbol number corresponding to YYLEX.  */
static final short yytranslate[] =
{
       0, 2, 2, 2, 2, 2, 2, 2, 2, 2,
       2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
       2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
       2, 2, 2, 2, 2, 2, 2, 2, 98, 2,
      51, 52, 101, 70, 99, 2, 92, 16, 2, 2,
       2, 2, 2, 2, 2, 2, 2, 2, 12, 103,
      96, 2, 97, 2, 2, 2, 2, 2, 2, 2,
       2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
       2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
       2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
       2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
       2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
       2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
       2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
       2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
       2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
       2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
       2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
       2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
       2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
       2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
       2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
       2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
       2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
       2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
       2, 2, 2, 2, 2, 2, 1, 2, 3, 4,
       5, 6, 7, 8, 9, 10, 11, 13, 14, 15,
      17, 18, 19, 20, 21, 22, 23, 24, 25, 26,
      27, 28, 29, 30, 31, 32, 33, 34, 35, 36,
      37, 38, 39, 40, 41, 42, 43, 44, 45, 46,
      47, 48, 49, 50, 53, 54, 55, 56, 57, 58,
      59, 60, 61, 62, 63, 64, 65, 66, 67, 68,
      69, 71, 72, 73, 74, 75, 76, 77, 78, 79,
      80, 81, 82, 83, 84, 85, 86, 87, 88, 89,
      90, 91, 93, 94, 95, 100, 102, 104, 105, 106
};


/* YYPRHS[YYN] -- Index of the first RHS symbol of rule number YYN in
   YYRHS.  */
static final char yyprhs[] =
{
       0, 0, 3, 5, 8, 9, 14, 17, 22, 25,
      27, 31, 37, 43, 46, 48, 51, 54, 55, 60,
      64, 67, 71, 75, 78, 82, 86, 90, 94, 97,
     102, 105, 109, 115, 121, 125, 129, 134, 139, 144,
     149, 153, 157, 161, 165, 170, 174, 178, 181, 185,
     188, 192, 195, 199, 203, 206, 210, 213, 217, 221,
     223, 226, 232, 237, 240, 244, 247, 251, 254, 257,
     260, 262, 265, 269, 274, 280, 284, 288, 292, 295,
     299, 303, 306, 308, 312, 316, 321, 325, 329, 333,
     337, 341, 344, 351, 359, 364, 369, 373, 378, 382,
     386, 390, 395, 400, 403, 406, 409, 412, 417, 421,
     426, 431, 434, 438, 441, 445, 448, 452, 455, 459,
     462, 465, 468, 472, 477, 483, 490, 492, 494, 496,
     499, 503, 505, 506, 508, 509, 511, 513, 516, 518,
     520, 522, 525, 527, 529, 531, 533, 537, 539, 542,
     545, 548, 552, 553, 555, 556, 560, 563, 565, 569,
     571, 574, 576, 580, 586, 591, 593, 596, 598, 603,
     607, 611, 613, 617, 620, 622, 626, 627, 629, 631,
     633, 635, 639, 643, 647, 649, 650, 654, 661, 671,
     672, 674, 676, 677, 679, 681, 684, 685, 686, 687,
     688, 689, 690, 691
};

/* YYRHS -- A `-1'-separated list of the rules' RHS. */
static final short yyrhs[] =
{
     108, 0, -1, 109, -1, 9, 148, -1, -1, 9,
     148, 110, 120, -1, 10, 118, -1, 11, 3, 12,
     123, -1, 13, 119, -1, 14, -1, 15, 144, 140,
      -1, 15, 144, 16, 3, 140, -1, 15, 144, 16,
     112, 140, -1, 17, 140, -1, 18, -1, 18, 3,
      -1, 19, 148, -1, -1, 19, 148, 111, 120, -1,
      20, 3, 145, -1, 20, 145, -1, 20, 21, 145,
      -1, 22, 5, 145, -1, 22, 145, -1, 22, 21,
     145, -1, 23, 113, 145, -1, 24, 113, 145, -1,
      25, 112, 145, -1, 26, 145, -1, 26, 145, 3,
     140, -1, 27, 140, -1, 28, 144, 140, -1, 28,
     144, 16, 3, 140, -1, 28, 144, 16, 112, 140,
      -1, 29, 15, 30, -1, 29, 15, 31, -1, 29,
      15, 32, 112, -1, 29, 15, 33, 112, -1, 29,
      15, 34, 35, -1, 29, 15, 34, 36, -1, 29,
      37, 35, -1, 29, 37, 36, -1, 29, 38, 140,
      -1, 29, 39, 112, -1, 29, 3, 147, 4, -1,
      40, 116, 145, -1, 41, 3, 145, -1, 42, 147,
      -1, 42, 147, 4, -1, 43, 145, -1, 43, 117,
     145, -1, 44, 145, -1, 44, 117, 145, -1, 45,
     116, 140, -1, 46, 145, -1, 46, 116, 145, -1,
      47, 143, -1, 47, 143, 128, -1, 48, 143, 129,
      -1, 49, -1, 49, 112, -1, 50, 51, 146, 4,
      52, -1, 50, 112, 146, 4, -1, 53, 143, -1,
      53, 143, 135, -1, 54, 143, -1, 54, 143, 135,
      -1, 55, 137, -1, 56, 143, -1, 56, 137, -1,
      57, -1, 57, 115, -1, 58, 112, 112, -1, 59,
     145, 139, 60, -1, 59, 145, 139, 60, 116, -1,
      61, 145, 60, -1, 62, 145, 23, -1, 62, 145,
     113, -1, 63, 145, -1, 64, 145, 113, -1, 65,
     145, 113, -1, 66, 145, -1, 67, -1, 67, 143,
      68, -1, 67, 143, 69, -1, 67, 143, 70, 132,
      -1, 67, 143, 132, -1, 71, 145, 140, -1, 72,
     145, 140, -1, 73, 145, 140, -1, 74, 75, 145,
      -1, 74, 76, -1, 74, 77, 143, 145, 127, 142,
      -1, 74, 77, 143, 145, 127, 142, 21, -1, 74,
      60, 143, 127, -1, 74, 78, 143, 127, -1, 74,
      79, 145, -1, 74, 79, 145, 3, -1, 74, 80,
     145, -1, 74, 81, 145, -1, 74, 82, 145, -1,
      74, 82, 145, 21, -1, 74, 82, 145, 116, -1,
      74, 9, -1, 74, 47, -1, 74, 55, -1, 74,
      53, -1, 74, 83, 3, 145, -1, 74, 83, 145,
      -1, 74, 83, 21, 145, -1, 84, 143, 145, 127,
      -1, 81, 148, -1, 81, 148, 3, -1, 85, 148,
      -1, 85, 148, 3, -1, 86, 146, -1, 86, 146,
       4, -1, 87, 112, -1, 88, 148, 3, -1, 89,
     143, -1, 89, 112, -1, 89, 3, -1, 90, 143,
     127, -1, 90, 143, 127, 8, -1, 91, 143, 145,
     127, 8, -1, 91, 143, 145, 127, 92, 8, -1,
      93, -1, 94, -1, 95, -1, 95, 3, -1, 112,
     147, 4, -1, 5, -1, -1, 5, -1, -1, 5,
      -1, 112, -1, 115, 112, -1, 8, -1, 5, -1,
     116, -1, 117, 116, -1, 112, -1, 114, -1, 121,
      -1, 3, -1, 3, 141, 120, -1, 122, -1, 121,
     122, -1, 96, 3, -1, 97, 3, -1, 97, 98,
       3, -1, -1, 3, -1, -1, 51, 125, 52, -1,
      51, 52, -1, 126, -1, 125, 99, 126, -1, 127,
      -1, 126, 100, -1, 8, -1, 127, 92, 8, -1,
     131, 92, 8, 124, 136, -1, 131, 12, 112, 136,
      -1, 130, -1, 129, 130, -1, 112, -1, 131, 92,
       8, 124, -1, 131, 12, 112, -1, 101, 92, 8,
      -1, 8, -1, 131, 92, 8, -1, 131, 102, -1,
     134, -1, 132, 133, 134, -1, -1, 99, -1, 103,
      -1, 8, -1, 101, -1, 134, 92, 8, -1, 134,
      92, 101, -1, 101, 92, 127, -1, 127, -1, -1,
     104, 146, 4, -1, 143, 139, 138, 127, 92, 8,
      -1, 143, 139, 138, 51, 140, 52, 143, 92, 8,
      -1, -1, 21, -1, 105, -1, -1, 106, -1, 40,
      -1, 146, 4, -1, -1, -1, -1, -1, -1, -1,
      -1, -1
};

/* YYRLINE[YYN] -- source line where rule number YYN was defined.  */
static final char yyrline[] =
{
       0, 52, 52, 56, 59, 59, 62, 65, 68, 71,
      73, 76, 80, 83, 86, 88, 90, 92, 92, 94,
      96, 98, 100, 102, 104, 106, 108, 110, 112, 115,
     118, 120, 123, 127, 130, 132, 134, 136, 138, 140,
     142, 144, 146, 148, 150, 153, 155, 157, 159, 161,
     163, 165, 167, 169, 171, 173, 175, 177, 179, 181,
     183, 185, 187, 189, 191, 193, 195, 197, 199, 201,
     203, 205, 207, 209, 211, 213, 215, 218, 221, 224,
     227, 230, 232, 234, 236, 238, 240, 242, 245, 248,
     251, 253, 255, 257, 259, 261, 263, 265, 267, 269,
     271, 273, 275, 277, 279, 281, 283, 285, 287, 289,
     291, 293, 295, 297, 299, 301, 303, 305, 307, 309,
     311, 313, 315, 317, 319, 321, 323, 325, 327, 329,
     331, 336, 339, 340, 344, 345, 349, 351, 356, 357,
     361, 364, 368, 372, 377, 378, 382, 391, 392, 397,
     403, 409, 418, 419, 423, 424, 426, 430, 433, 438,
     439, 443, 444, 448, 450, 455, 459, 464, 465, 467,
     472, 473, 474, 478, 485, 490, 494, 496, 497, 501,
     502, 503, 504, 508, 509, 513, 514, 519, 521, 527,
     528, 529, 533, 534, 535, 539, 544, 549, 552, 556,
     560, 564, 568, 572
};


static final int YY_NUM_TERMINALS = 107;

static String yytname (int i) {
   if (i == yytname.length-1)
     return null;
   else
     return (String) yytname[i];
}

/* YYTNAME[SYMBOL-NUM] -- String name of the symbol SYMBOL-NUM.
   First, the terminals, then, starting at YYNTOKENS, nonterminals. */
static final Object yytname[] =
{
  "$end", "error", "$undefined", "WORD", "TEXT", "INTLIT", "CHARLIT",
  "STRINGLIT", "IDENT", "\"run\"", "\"attach\"", "\"connect\"", "':'",
  "\"listen\"", "\"detach\"", "\"print\"", "'/'", "\"call\"",
  "\"exec-class\"", "\"exec-args\"", "\"backtrace\"", "\"all\"",
  "\"wherei\"", "\"up\"", "\"down\"", "\"frame\"", "\"save\"", "\"ptype\"",
  "\"dumpall\"", "\"set\"", "\"compressed\"", "\"pretty\"", "\"elements\"",
  "\"max-frames\"", "\"return\"", "\"on\"", "\"off\"", "\"stdin\"",
  "\"variable\"", "\"history\"", "\"thread\"", "\"threadgroup\"", "\"^F\"",
  "\"suspend\"", "\"resume\"", "\"kill\"", "\"interrupt\"", "\"break\"",
  "\"clear\"", "\"command\"", "\"condition\"", "'('", "')'", "\"catch\"",
  "\"pass\"", "\"watch\"", "\"unwatch\"", "\"delete\"", "\"ignore\"",
  "\"trace\"", "\"methods\"", "\"untrace\"", "\"step\"", "\"finish\"",
  "\"next\"", "\"stepi\"", "\"continue\"", "\"exclude\"", "\"none\"",
  "\"reset\"", "'+'", "\"lock\"", "\"disablegc\"", "\"enablegc\"",
  "\"info\"", "\"locals\"", "\"classes\"", "\"class\"", "\"fields\"",
  "\"threads\"", "\"threadgroups\"", "\"classpath\"", "\"threadlocks\"",
  "\"stack\"", "\"loadclass\"", "\"sourcepath\"", "\"monitor\"",
  "\"unmonitor\"", "\"source\"", "\"list\"", "\"lines\"", "\"bytecodes\"",
  "'.'", "\"version\"", "\"quit\"", "\"help\"", "'<'", "'>'", "'&'", "','",
  "\"[]\"", "'*'", "\".0\"", "';'", "\"if\"", "\"access\"", "\"go\"",
  "$accept", "start", "command", "@1", "@2", "intlit", "intlit_dflt1",
  "intlit_dflt_m1", "int_list", "thread_id", "thread_id_list", "address",
  "address_opt", "run_args", "file_specs", "file_spec", "connector_args",
  "formal_types_opt", "formal_types", "formal_type", "class_id",
  "breakpoint_spec", "delete_breakpoint_spec_list",
  "delete_breakpoint_spec", "break_class_id", "exclude_class_id_list",
  "opt_sep", "id_pattern", "exception_spec", "if_clause_opt",
  "watchpoint_spec", "watch_type", "suspend_policy", "expr",
  "_copy_two_back", "_default_mode", "_break_mode", "_print_mode",
  "_check_connect", "_balanced_collect_mode", "_collect_all_mode",
  "_run_args_mode", 0
};

/* YYTOKNUM[YYLEX-NUM] -- Internal token number corresponding to
   token YYLEX-NUM.  */
static final int[] yytoknum =
{
       0, 256, 257, 258, 259, 260, 261, 262, 263, 264,
     265, 266, 58, 267, 268, 269, 47, 270, 271, 272,
     273, 274, 275, 276, 277, 278, 279, 280, 281, 282,
     283, 284, 285, 286, 287, 288, 289, 290, 291, 292,
     293, 294, 295, 296, 297, 298, 299, 300, 301, 302,
     303, 40, 41, 304, 305, 306, 307, 308, 309, 310,
     311, 312, 313, 314, 315, 316, 317, 318, 319, 320,
      43, 321, 322, 323, 324, 325, 326, 327, 328, 329,
     330, 331, 332, 333, 334, 335, 336, 337, 338, 339,
     340, 341, 46, 342, 343, 344, 60, 62, 38, 44,
     345, 42, 346, 59, 347, 348, 349
};

/* YYR1[YYN] -- Symbol number of symbol that rule YYN derives.  */
static final short yyr1[] =
{
       0, 107, 108, 109, 110, 109, 109, 109, 109, 109,
     109, 109, 109, 109, 109, 109, 109, 111, 109, 109,
     109, 109, 109, 109, 109, 109, 109, 109, 109, 109,
     109, 109, 109, 109, 109, 109, 109, 109, 109, 109,
     109, 109, 109, 109, 109, 109, 109, 109, 109, 109,
     109, 109, 109, 109, 109, 109, 109, 109, 109, 109,
     109, 109, 109, 109, 109, 109, 109, 109, 109, 109,
     109, 109, 109, 109, 109, 109, 109, 109, 109, 109,
     109, 109, 109, 109, 109, 109, 109, 109, 109, 109,
     109, 109, 109, 109, 109, 109, 109, 109, 109, 109,
     109, 109, 109, 109, 109, 109, 109, 109, 109, 109,
     109, 109, 109, 109, 109, 109, 109, 109, 109, 109,
     109, 109, 109, 109, 109, 109, 109, 109, 109, 109,
     109, 112, 113, 113, 114, 114, 115, 115, 116, 116,
     117, 117, 118, 119, 120, 120, 120, 121, 121, 122,
     122, 122, 123, 123, 124, 124, 124, 125, 125, 126,
     126, 127, 127, 128, 128, 129, 129, 130, 130, 130,
     131, 131, 131, 131, 132, 132, 133, 133, 133, 134,
     134, 134, 134, 135, 135, 136, 136, 137, 137, 138,
     138, 138, 139, 139, 139, 140, 141, 142, 143, 144,
     145, 146, 147, 148
};

/* YYR2[YYN] -- Number of symbols composing right hand side of rule YYN.  */
static final short yyr2[] =
{
       0, 2, 1, 2, 0, 4, 2, 4, 2, 1,
       3, 5, 5, 2, 1, 2, 2, 0, 4, 3,
       2, 3, 3, 2, 3, 3, 3, 3, 2, 4,
       2, 3, 5, 5, 3, 3, 4, 4, 4, 4,
       3, 3, 3, 3, 4, 3, 3, 2, 3, 2,
       3, 2, 3, 3, 2, 3, 2, 3, 3, 1,
       2, 5, 4, 2, 3, 2, 3, 2, 2, 2,
       1, 2, 3, 4, 5, 3, 3, 3, 2, 3,
       3, 2, 1, 3, 3, 4, 3, 3, 3, 3,
       3, 2, 6, 7, 4, 4, 3, 4, 3, 3,
       3, 4, 4, 2, 2, 2, 2, 4, 3, 4,
       4, 2, 3, 2, 3, 2, 3, 2, 3, 2,
       2, 2, 3, 4, 5, 6, 1, 1, 1, 2,
       3, 1, 0, 1, 0, 1, 1, 2, 1, 1,
       1, 2, 1, 1, 1, 1, 3, 1, 2, 2,
       2, 3, 0, 1, 0, 3, 2, 1, 3, 1,
       2, 1, 3, 5, 4, 1, 2, 1, 4, 3,
       3, 1, 3, 2, 1, 3, 0, 1, 1, 1,
       1, 3, 3, 3, 1, 0, 3, 6, 9, 0,
       1, 1, 0, 1, 1, 2, 0, 0, 0, 0,
       0, 0, 0, 0
};

/* YYDEFACT[STATE-NAME] -- Default rule to reduce with in state
   STATE-NUM when YYTABLE doesn't specify something else to do.  Zero
   means the default is an error.  */
static final short yydefact[] =
{
       0, 131, 203, 0, 0, 134, 9, 199, 201, 14,
     203, 200, 200, 132, 132, 0, 200, 201, 199, 0,
       0, 0, 202, 200, 200, 0, 200, 198, 198, 59,
       0, 198, 198, 198, 198, 70, 0, 200, 200, 200,
     200, 200, 200, 200, 198, 200, 200, 200, 0, 203,
     198, 203, 201, 0, 203, 198, 198, 198, 126, 127,
     128, 0, 2, 202, 4, 142, 6, 0, 135, 143,
       8, 201, 13, 0, 15, 17, 200, 200, 20, 200,
     200, 23, 133, 200, 200, 200, 28, 30, 201, 202,
       0, 0, 201, 0, 139, 138, 200, 200, 47, 140,
     200, 49, 200, 51, 201, 200, 54, 56, 0, 60,
     201, 201, 63, 65, 67, 192, 69, 192, 136, 71,
       0, 192, 0, 132, 78, 132, 132, 81, 0, 201,
     201, 201, 103, 104, 106, 105, 198, 200, 91, 198,
     198, 200, 200, 200, 200, 200, 111, 200, 113, 115,
     117, 0, 121, 120, 119, 0, 200, 129, 1, 0,
       0, 152, 0, 10, 195, 0, 19, 21, 22, 24,
      25, 26, 27, 201, 0, 31, 0, 34, 35, 0,
       0, 0, 40, 41, 42, 43, 45, 46, 48, 141,
      50, 52, 53, 55, 171, 0, 57, 0, 167, 58,
     165, 0, 0, 0, 161, 0, 184, 64, 66, 194,
     193, 189, 137, 72, 0, 75, 76, 77, 79, 80,
     179, 83, 84, 0, 180, 176, 174, 87, 88, 89,
       0, 90, 200, 0, 96, 98, 99, 100, 200, 200,
     108, 112, 0, 114, 116, 118, 122, 0, 130, 196,
       0, 0, 5, 144, 147, 153, 7, 201, 201, 18,
      29, 201, 201, 44, 36, 37, 38, 39, 0, 0,
       0, 173, 166, 0, 0, 0, 62, 0, 0, 190,
     191, 0, 73, 176, 177, 178, 0, 0, 94, 0,
      95, 97, 101, 102, 107, 109, 110, 123, 0, 0,
     149, 150, 0, 148, 11, 12, 32, 33, 170, 185,
     172, 169, 154, 61, 183, 162, 201, 0, 74, 175,
     181, 182, 197, 124, 0, 146, 151, 201, 164, 0,
     185, 168, 0, 0, 92, 162, 0, 156, 0, 157,
     159, 163, 198, 162, 93, 186, 155, 0, 160, 0,
     158, 0, 188
};

/* YYDEFGOTO[NTERM-NUM]. */
static final short yydefgoto[] =
{
      -1, 61, 62, 160, 165, 198, 83, 69, 119, 99,
     100, 66, 70, 252, 253, 254, 256, 330, 338, 339,
     206, 196, 199, 200, 201, 225, 286, 226, 207, 328,
     114, 281, 211, 72, 299, 334, 107, 71, 78, 73,
      98, 64
};

/* YYPACT[STATE-NUM] -- Index in YYTABLE of the portion describing
   STATE-NUM.  */

static final short yypact[] =
{
     279, -159, -159, 30, 34, 58, -159, -159, -159, 68,
    -159, 33, 64, 62, 62, 30, -159, -159, -159, 140,
      93, 86, -159, 93, 93, 93, 93, -159, -159, 30,
      28, -159, -159, -159, -159, 30, 30, -159, -159, -159,
    -159, -159, -159, -159, 48, -159, -159, -159, 330, -159,
    -159, -159, -159, 30, -159, 75, -159, -159, -159, -159,
      91, 59, -159, -159, 100, -159, -159, 120, -159, -159,
    -159, 87, -159, 147, -159, 156, -159, -159, -159, -159,
    -159, -159, -159, -159, -159, -159, 164, -159, 143, -159,
     142, 74, -159, 30, -159, -159, -159, -159, 182, -159,
      93, -159, 93, -159, -159, -159, -159, 24, 41, -159,
    -159, -159, 26, 26, -159, -15, -159, 10, -159, 30,
      30, -15, 127, 47, -159, 62, 62, -159, 84, -159,
    -159, -159, -159, -159, -159, -159, -159, -159, -159, -159,
    -159, -159, -159, -159, -159, 54, 187, -159, 191, 192,
    -159, 194, -159, -159, -159, 190, -159, -159, -159, 197,
      27, 201, 79, -159, -159, 27, -159, -159, -159, -159,
    -159, -159, -159, -159, 188, -159, 205, -159, -159, 30,
      30, 102, -159, -159, -159, -159, -159, -159, -159, -159,
    -159, -159, -159, -159, -159, 103, -159, 29, -159, 41,
    -159, 56, 206, 207, -159, 113, 121, -159, -159, -159,
    -159, -1, -159, -159, 152, -159, -159, -159, -159, -159,
    -159, -159, -159, 39, -159, 23, 122, -159, -159, -159,
     190, -159, -159, 190, 212, -159, -159, 69, -159, -159,
    -159, -159, 190, -159, -159, -159, 7, 190, -159, 216,
     214, 8, -159, 85, -159, -159, -159, -159, -159, -159,
    -159, -159, -159, -159, -159, -159, -159, -159, 210, 30,
     213, -159, -159, 30, 218, 170, -159, 190, 219, -159,
    -159, 45, 93, 31, -159, -159, 39, 43, 121, 190,
     121, -159, -159, -159, -159, -159, 121, -159, 13, 27,
    -159, -159, 221, -159, -159, -159, -159, -159, -159, 125,
      14, -159, 5, -159, 121, -159, -159, 139, -159, 122,
    -159, -159, 121, -159, 225, -159, -159, -159, -159, 35,
     125, -159, 183, 226, 215, 237, 234, -159, -26, 144,
     121, -159, -159, 239, -159, -159, -159, 190, -159, 148,
     144, 235, -159
};

/* YYPGOTO[NTERM-NUM].  */
static final short yypgoto[] =
{
    -159, -159, -159, -159, -159, 9, -6, -159, -159, -7,
     223, -159, -159, -158, -159, -5, -159, -63, -159, -96,
     -97, -159, -159, 53, 146, 36, -159, -32, 145, -75,
     222, -159, 136, -16, -159, -159, -28, 243, 123, -50,
     -23, 32
};

/* YYTABLE[YYPACT[STATE-NUM]].  What to do in state STATE-NUM.  If
   positive, shift that token.  If negative, reduce the rule which
   number is the opposite.  If zero, do what YYDEFACT says.
   If YYTABLE_NINF, syntax error.  */

static final short yytable[] =
{
     108, 87, 149, 112, 113, 115, 117, 259, 84, 63,
     -68, 301, 65, 96, -154, 297, 128, -172, 104, 105,
     279, 323, 147, -86, 85, 209, 346, 154, 155, 156,
     249, -85, 194, 1, 204, 1, 76, 67, 109, 111,
     159, 269, 75, 204, 118, 120, 1, 220, -82, 194,
     209, 320, 82, 204, 77, 163, 329, 238, 246, 158,
     202, 203, 150, 68, 153, 329, 176, 82, 273, 79,
     216, 74, 175, 347, 94, 239, 184, 95, 152, 110,
       1, 146, 257, 148, 1, 80, 151, 337, 192, 97,
     292, 210, 220, 189, 157, 189, 316, -172, 94, 278,
      -3, 95, 185, 162, 280, 324, 302, -172, 230, 182,
     183, 232, 233, 227, 228, 229, 210, 217, -154, 218,
     219, 270, 284, 250, 251, 195, 285, 205, 212, 213,
     284, 271, 161, 288, 285, 81, 290, 266, 267, 86,
     224, 325, 195, 89, 321, 296, 101, 103, 274, 106,
     298, 164, 221, 222, 223, 90, -16, 260, 271, 174,
     121, 122, 123, 124, 125, 126, 127, 173, 129, 130,
     131, 258, 177, 178, 179, 180, 181, 91, 92, 93,
     314, 250, 251, 262, 317, 224, 188, 215, 264, 265,
     241, 261, 322, 1, 243, 268, 244, 245, 204, 166,
     167, 248, 168, 169, 255, 277, 170, 171, 172, 263,
     275, 276, 282, 278, 287, 291, -145, 300, 308, 186,
     187, 310, 313, 190, 326, 191, 312, 315, 193, 327,
     293, 333, 340, 335, 343, 342, 344, -125, 345, -187,
     351, 304, 305, 352, 348, 306, 307, 102, 303, 331,
     340, 350, 272, 197, 319, 341, 116, 214, 208, 283,
     231, 88, 0, 0, 234, 235, 236, 237, 240, 0,
     242, 0, 0, 0, 0, 318, 0, 336, 309, 247,
       0, 0, 311, 0, 1, 0, 0, 0, 2, 3,
       4, 0, 5, 6, 7, 0, 8, 9, 10, 11,
     332, 12, 13, 14, 15, 16, 17, 18, 19, 0,
       0, 0, 0, 0, 349, 0, 0, 0, 0, 20,
      21, 22, 23, 24, 25, 26, 27, 28, 29, 30,
       0, 0, 31, 32, 33, 34, 35, 36, 37, 132,
      38, 39, 40, 41, 42, 43, 44, 0, 0, 0,
      45, 46, 47, 48, 0, 289, 0, 0, 0, 0,
      49, 294, 295, 50, 51, 52, 53, 54, 55, 56,
      57, 0, 58, 59, 60, 0, 0, 133, 0, 0,
       0, 0, 0, 134, 0, 135, 0, 0, 0, 0,
     136, 0, 0, 0, 0, 0, 0, 0, 0, 0,
       0, 0, 0, 0, 0, 137, 138, 139, 140, 141,
     142, 143, 144, 145
};

static final short yycheck[] =
{
      28, 17, 52, 31, 32, 33, 34, 165, 14, 0,
       0, 3, 3, 20, 0, 8, 44, 12, 25, 26,
      21, 8, 50, 0, 15, 40, 52, 55, 56, 57,
       3, 0, 8, 5, 8, 5, 3, 3, 29, 30,
      63, 12, 10, 8, 35, 36, 5, 8, 0, 8,
      40, 8, 5, 8, 21, 71, 51, 3, 155, 0,
     110, 111, 53, 5, 55, 51, 89, 5, 12, 5,
      23, 3, 88, 99, 5, 21, 92, 8, 3, 51,
       5, 49, 3, 51, 5, 21, 54, 52, 104, 3,
      21, 106, 8, 100, 3, 102, 51, 92, 5, 92,
       0, 8, 93, 16, 105, 92, 98, 102, 136, 35,
      36, 139, 140, 129, 130, 131, 106, 123, 104, 125,
     126, 92, 99, 96, 97, 101, 103, 101, 119, 120,
      99, 102, 12, 230, 103, 12, 233, 35, 36, 16,
     101, 299, 101, 3, 101, 242, 23, 24, 92, 26,
     247, 4, 68, 69, 70, 15, 0, 173, 102, 16,
      37, 38, 39, 40, 41, 42, 43, 3, 45, 46,
      47, 162, 30, 31, 32, 33, 34, 37, 38, 39,
     277, 96, 97, 174, 281, 101, 4, 60, 179, 180,
       3, 3, 289, 5, 3, 92, 4, 3, 8, 76,
      77, 4, 79, 80, 3, 92, 83, 84, 85, 4,
       4, 4, 60, 92, 92, 3, 0, 3, 8, 96,
      97, 8, 52, 100, 3, 102, 8, 8, 105, 104,
     237, 92, 329, 8, 8, 52, 21, 0, 4, 0,
      92, 257, 258, 8, 100, 261, 262, 24, 253, 312,
     347, 347, 199, 107, 286, 330, 34, 121, 113, 223,
     137, 18, -1, -1, 141, 142, 143, 144, 145, -1,
     147, -1, -1, -1, -1, 282, -1, 327, 269, 156,
      -1, -1, 273, -1, 5, -1, -1, -1, 9, 10,
      11, -1, 13, 14, 15, -1, 17, 18, 19, 20,
     316, 22, 23, 24, 25, 26, 27, 28, 29, -1,
      -1, -1, -1, -1, 342, -1, -1, -1, -1, 40,
      41, 42, 43, 44, 45, 46, 47, 48, 49, 50,
      -1, -1, 53, 54, 55, 56, 57, 58, 59, 9,
      61, 62, 63, 64, 65, 66, 67, -1, -1, -1,
      71, 72, 73, 74, -1, 232, -1, -1, -1, -1,
      81, 238, 239, 84, 85, 86, 87, 88, 89, 90,
      91, -1, 93, 94, 95, -1, -1, 47, -1, -1,
      -1, -1, -1, 53, -1, 55, -1, -1, -1, -1,
      60, -1, -1, -1, -1, -1, -1, -1, -1, -1,
      -1, -1, -1, -1, -1, 75, 76, 77, 78, 79,
      80, 81, 82, 83
};

/* YYSTOS[STATE-NUM] -- The (internal number of the) accessing
   symbol of state STATE-NUM.  */
static final short yystos[] =
{
       0, 5, 9, 10, 11, 13, 14, 15, 17, 18,
      19, 20, 22, 23, 24, 25, 26, 27, 28, 29,
      40, 41, 42, 43, 44, 45, 46, 47, 48, 49,
      50, 53, 54, 55, 56, 57, 58, 59, 61, 62,
      63, 64, 65, 66, 67, 71, 72, 73, 74, 81,
      84, 85, 86, 87, 88, 89, 90, 91, 93, 94,
      95, 108, 109, 112, 148, 112, 118, 3, 5, 114,
     119, 144, 140, 146, 3, 148, 3, 21, 145, 5,
      21, 145, 5, 113, 113, 112, 145, 140, 144, 3,
      15, 37, 38, 39, 5, 8, 116, 3, 147, 116,
     117, 145, 117, 145, 116, 116, 145, 143, 143, 112,
      51, 112, 143, 143, 137, 143, 137, 143, 112, 115,
     112, 145, 145, 145, 145, 145, 145, 145, 143, 145,
     145, 145, 9, 47, 53, 55, 60, 75, 76, 77,
      78, 79, 80, 81, 82, 83, 148, 143, 148, 146,
     112, 148, 3, 112, 143, 143, 143, 3, 0, 147,
     110, 12, 16, 140, 4, 111, 145, 145, 145, 145,
     145, 145, 145, 3, 16, 140, 147, 30, 31, 32,
      33, 34, 35, 36, 140, 112, 145, 145, 4, 116,
     145, 145, 140, 145, 8, 101, 128, 131, 112, 129,
     130, 131, 146, 146, 8, 101, 127, 135, 135, 40,
     106, 139, 112, 112, 139, 60, 23, 113, 113, 113,
       8, 68, 69, 70, 101, 132, 134, 140, 140, 140,
     143, 145, 143, 143, 145, 145, 145, 145, 3, 21,
     145, 3, 145, 3, 4, 3, 127, 145, 4, 3,
      96, 97, 120, 121, 122, 3, 123, 3, 112, 120,
     140, 3, 112, 4, 112, 112, 35, 36, 92, 12,
      92, 102, 130, 12, 92, 4, 4, 92, 92, 21,
     105, 138, 60, 132, 99, 103, 133, 92, 127, 145,
     127, 3, 21, 116, 145, 145, 127, 8, 127, 141,
       3, 3, 98, 122, 140, 140, 140, 140, 8, 112,
       8, 112, 8, 52, 127, 8, 51, 127, 116, 134,
       8, 101, 127, 8, 92, 120, 3, 104, 136, 51,
     124, 124, 140, 92, 142, 8, 146, 52, 125, 126,
     127, 136, 52, 8, 21, 4, 52, 99, 100, 143,
     126, 92, 8
};
/* Like YYERROR except do call yyerror.  This remains here temporarily
   to ease the transition to the new meaning of YYERROR, for GCC.
   Once GCC version 2 has supplanted version 1, this can go.  */
/* Enable debugging if requested.  */
static private final String yyendl
    = System.getProperty ("line.separator", "\n");
/*------------------------------------------------------------------.
| yy_stack_print -- Print the state stack from its BOTTOM up to its |
| TOP (included).                                                   |
`------------------------------------------------------------------*/
private void yy_stack_print (int[] stack, int bottom, int top)
{
  System.err.print ("Stack now");
  for (/* Nothing. */; bottom <= top; bottom += 1)
    System.err.print (" " + stack[bottom]);
  System.err.print (yyendl);
}
/*------------------------------------------------.
| Report that the YYRULE is going to be reduced.  |
`------------------------------------------------*/
private void yy_reduce_print (int yyrule)
{
  int yyi;
  int yylno = yyrline[yyrule];
  System.err.print ("Reducing stack by rule " + (yyrule - 1)
      + " (line " + yylno + "), ");
  /* Print the symbols being reduced, and their result.  */
  for (yyi = yyprhs[yyrule]; 0 <= yyrhs[yyi]; yyi += 1)
    System.err.print (yytname [yyrhs[yyi]] + " ");
  System.err.print ("-> " + yytname [yyr1[yyrule]] + yyendl);
}
/* Nonzero means print parse trace.  It is left uninitialized so that
   multiple parsers can coexist.  */
int yydebug;
/* YYINITDEPTH -- initial size of the parser's stacks.  */
/* YYMAXDEPTH -- maximum size the stacks can grow to (effective only
   if the built-in stack extension method is used).

   Do not make this value too large; the results are undefined if
   SIZE_MAX < YYSTACK_BYTES (YYMAXDEPTH)
   evaluated with infinite-precision integer arithmetic.  */
/*--------------------------------.
| Print this symbol on YYOUTPUT.  |
`--------------------------------*/
private void yysymprint (int yytype, Object yyvaluep, int yylocationp)
{
  if (yytype < 107)
    System.err.print ("token " + yytname[yytype]);
  else
    System.err.print ("nterm " + yytname[yytype]);
}
/*----------.
| parse.  |
`----------*/
  private static final int
    yyabortlab = 1,
    yyacceptlab = 2,
    yybackup = 3,
    yydefault = 4,
    yyerrlab = 5,
    yyerrlab1 = 6,
    yyerrorlab = 7,
    yynewstate = 8,
    yyoverflowlab = 9,
    yyreduce = 10,
    yyreturn = 11,
    yysetstate = 12;
  /* The semantic value of the look-ahead symbol.  */
  public Object yylval;
  /* Location data for the look-ahead symbol.  */
  public int yylloc;
public int parse ()
{
  /* The look-ahead symbol.  */
  int yychar;
  /* Number of syntax errors so far.  */
  int yynerrs;
  int yystate;
  int yyn;
  int yyresult;
  /* Number of tokens to shift before error messages enabled.  */
  int yyerrstatus;
  /* Look-ahead token as an internal (translated) token number.  */
  int yytoken = 0;
  /* Three stacks and their tools:
     `yyss': related to states,
     `yyvs': related to semantic values,
     `yyls': related to locations.

     Refer to the stacks thru separate pointers, to allow yyoverflow
     to reallocate them elsewhere.  */
  /* The state stack.  */
  int yyssa[] = new int [200];
  int yyss = 0;
  int yyssp;
  /* The semantic value stack.  */
  Object yyvsa[] = new Object[200];
  int yyvs = 0;
  int yyvsp;
  /* The location stack.  */
  int yylsa[] = new int[200];
  int yyls = 0;
  int yylsp;
  /* The locations where the error started and ended. */
  int yyerror_range[] = new int[2];
  int yystacksize = 200;
  /* The variables used to return semantic value and location from the
     action routines.  */
  Object yyval;
  int yyloc;
  /* When reducing, the number of symbols on the RHS of the reduced
     rule.  */
  int yylen;
  do { if (yydebug != 0) System.err.print ( "Starting parse" + yyendl); } while (false);
  yystate = 0;
  yyerrstatus = 0;
  yynerrs = 0;
  yychar = (-2); /* Cause a token to be read.  */
  /* Initialize stack pointers.
     Waste one element of value and location stack
     so that they stay on the same level as the state stack.
     The wasted elements are never initialized.  */
  yyssp = yyss;
  yyvsp = yyvs;
  yylsp = yyls;
  yyloc = YYLTYPE_INIT;
  yylsa[yylsp] = yyloc;
  /* Artificial initializations to keep Java happy */
  yyn = 0;
  yylen = 0;
  yyresult = 0;
  /* pc is used to hold a goto label (or FSA state, if you prefer). */
  int pc;
  pc = yysetstate;
Loop:
  while (true) {
    switch (pc) {
/*------------------------------------------------------------.
| yynewstate -- Push a new state, which is found in yystate.  |
`------------------------------------------------------------*/
 case yynewstate:
  /* In all cases, when you get here, the value and location stacks
     have just been pushed. so pushing a state here evens the stacks.
     */
  yyssp++;
 case yysetstate:
  yyssa[yyssp] = yystate;
  if (yyss + yystacksize - 1 <= yyssp)
    {
      /* Get the current used size of the three stacks, in elements.  */
      int yysize = yyssp - yyss + 1;
      /* Extend the stack our own way.  */
      if (10000 <= yystacksize)
 do { pc = yyoverflowlab; continue Loop; } while (false);
      yystacksize *= 2;
      if (10000 < yystacksize)
 yystacksize = 10000;
      { int[] newStack = new int[yystacksize]; System.arraycopy (yyssa, 0, newStack, 0, yyssa.length); yyssa = newStack; };
      { Object[] newStack = new Object[yystacksize]; System.arraycopy (yyvsa, 0, newStack, 0, yyvsa.length); yyvsa = newStack; };
      { int[] newStack = new int[yystacksize]; System.arraycopy (yylsa, 0, newStack, 0, yylsa.length); yylsa = newStack; };
      do { if (yydebug != 0) System.err.print ( "Stack size increased to " + yystacksize + yyendl); } while (false);
    }
  do { if (yydebug != 0) System.err.print ( "Entering state " + yystate + yyendl); } while (false);
  do { pc = yybackup; continue Loop; } while (false);
/*-----------.
| yybackup.  |
`-----------*/
case yybackup:
/* Do appropriate processing given the current state.  */
/* Read a look-ahead token if we need one and don't already have one.  */
/* yyresume: */
  /* First try to decide what to do without reference to look-ahead token.  */
  yyn = yypact[yystate];
  if (yyn == -159)
    do { pc = yydefault; continue Loop; } while (false);
  /* Not known => get a look-ahead token if don't already have one.  */
  /* YYCHAR is either YYEMPTY or YYEOF or a valid look-ahead symbol.  */
  if (yychar == (-2))
    {
      do { if (yydebug != 0) System.err.print ( "Reading a token: "); } while (false);
      yychar = yylex ();
    }
  if (yychar <= 0)
    {
      yychar = yytoken = 0;
      do { if (yydebug != 0) System.err.print ( "Now at end of input." + yyendl); } while (false);
    }
  else
    {
      yytoken = ((yychar) >= 0 && (yychar) <= 349 ? yytranslate[yychar] : 2);
      do { if (yydebug != 0) { System.err.print ("Next token is" + " "); yysymprint (yytoken, yylval, yylloc); System.err.print (yyendl); } } while (false);
    }
  /* If the proper action on seeing token YYTOKEN is to reduce or to
     detect an error, take that action.  */
  yyn += yytoken;
  if (yyn < 0 || 413 < yyn || yycheck[yyn] != yytoken)
    do { pc = yydefault; continue Loop; } while (false);
  yyn = yytable[yyn];
  if (yyn <= 0)
    {
      if (yyn == 0 || yyn == -188)
 do { pc = yyerrlab; continue Loop; } while (false);
      yyn = -yyn;
      do { pc = yyreduce; continue Loop; } while (false);
    }
  if (yyn == 158)
    do { pc = yyacceptlab; continue Loop; } while (false);
  /* Shift the look-ahead token.  */
  do { if (yydebug != 0) { System.err.print ("Shifting" + " "); yysymprint (yytoken, yylval, yylloc); System.err.print (yyendl); } } while (false);
  /* Discard the token being shifted unless it is eof.  */
  if (yychar != 0)
    yychar = (-2);
  yyvsa[++yyvsp] = yylval;
  yylsa[++yylsp] = yylloc;
  /* Count tokens shifted since error; after three, turn off error
     status.  */
  if (yyerrstatus != 0)
    yyerrstatus--;
  yystate = yyn;
  do { pc = yynewstate; continue Loop; } while (false);
/*-----------------------------------------------------------.
| yydefault -- do the default action for the current state.  |
`-----------------------------------------------------------*/
case yydefault:
  yyn = yydefact[yystate];
  if (yyn == 0)
    do { pc = yyerrlab; continue Loop; } while (false);
  do { pc = yyreduce; continue Loop; } while (false);
/*-----------------------------.
| yyreduce -- Do a reduction.  |
`-----------------------------*/
case yyreduce:
  /* yyn is the number of a rule to reduce with.  */
  yylen = yyr2[yyn];
  /* If YYLEN is nonzero, implement the default value of the action:
     `$$ = $1'.

     Otherwise, the following line sets YYVAL to garbage.
     This behavior is undocumented and Bison
     users should not rely upon it.  Assigning to YYVAL
     unconditionally makes the parser a bit smaller, and it avoids a
     GCC warning that YYVAL may be used uninitialized.  */
  yyval = yyvsa[yyvsp+1-yylen];
  /* Default location. */
  ;
  do { if (yydebug != 0) yy_reduce_print (yyn); } while (false);
  switch (yyn)
    {
        case 3:
// _line_ 57 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandRun ();
    startHandler (); ;}
    break;
  case 4:
// _line_ 59 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = new CommandLineSpec (); ;}
    break;
  case 5:
// _line_ 60 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandRun (((CommandLineSpec)yyvsa[yyvsp+(-1)]));
     startHandler (); ;}
    break;
  case 6:
// _line_ 63 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandAttach (((Integer)yyvsa[yyvsp+(0)]));
    startHandler (); ;}
    break;
  case 7:
// _line_ 66 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandConnect (((String)yyvsa[yyvsp+(-2)]) + ":" + ((String)yyvsa[yyvsp+(0)]));
    startHandler (); ;}
    break;
  case 8:
// _line_ 69 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandListen (((Integer)yyvsa[yyvsp+(0)]));
    startHandler (); ;}
    break;
  case 9:
// _line_ 72 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandDetach (); ;}
    break;
  case 10:
// _line_ 74 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandPrint (((String)yyvsa[yyvsp+(0)]), evaluator.PRINT, ' ', false);
    showPrompt = false; ;}
    break;
  case 11:
// _line_ 77 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandPrint (((String)yyvsa[yyvsp+(0)]), printDepth (((String)yyvsa[yyvsp+(-1)])), printFormat (((String)yyvsa[yyvsp+(-1)])),
       false);
    showPrompt = false; ;}
    break;
  case 12:
// _line_ 81 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandPrint (((String)yyvsa[yyvsp+(0)]), ((Integer)yyvsa[yyvsp+(-1)]), ' ', false);
    showPrompt = false; ;}
    break;
  case 13:
// _line_ 84 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandPrint (((String)yyvsa[yyvsp+(0)]), evaluator.NO_PRINT, ' ', false);
    showPrompt = false; ;}
    break;
  case 14:
// _line_ 87 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandSetClass (""); ;}
    break;
  case 15:
// _line_ 89 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandSetClass (((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 16:
// _line_ 91 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandSetArgs (new CommandLineSpec ()); ;}
    break;
  case 17:
// _line_ 92 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = new CommandLineSpec (); ;}
    break;
  case 18:
// _line_ 93 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandSetArgs (((CommandLineSpec)yyvsa[yyvsp+(-1)])); ;}
    break;
  case 19:
// _line_ 95 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandWhere (((String)yyvsa[yyvsp+(-1)]), false); ;}
    break;
  case 20:
// _line_ 97 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandWhere (null, false); ;}
    break;
  case 21:
// _line_ 99 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandWhereAll (false); ;}
    break;
  case 22:
// _line_ 101 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandWhere (((String)yyvsa[yyvsp+(-1)]), true); ;}
    break;
  case 23:
// _line_ 103 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandWhere (null, true); ;}
    break;
  case 24:
// _line_ 105 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandWhereAll (true); ;}
    break;
  case 25:
// _line_ 107 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandUp (((Integer)yyvsa[yyvsp+(-1)])); ;}
    break;
  case 26:
// _line_ 109 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandUp (-((Integer)yyvsa[yyvsp+(-1)])); ;}
    break;
  case 27:
// _line_ 111 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandFrame (((Integer)yyvsa[yyvsp+(-1)])); ;}
    break;
  case 28:
// _line_ 113 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandSave ();
    showPrompt = false; ;}
    break;
  case 29:
// _line_ 116 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandSave (((String)yyvsa[yyvsp+(-1)]), ((String)yyvsa[yyvsp+(0)]));
     showPrompt = false; ;}
    break;
  case 30:
// _line_ 119 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandPtype (((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 31:
// _line_ 121 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandPrint (((String)yyvsa[yyvsp+(0)]), evaluator.EXAMINE, ' ', true);
    showPrompt = false; ;}
    break;
  case 32:
// _line_ 124 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandPrint (((String)yyvsa[yyvsp+(0)]), printDepth (((String)yyvsa[yyvsp+(-1)])),
       printFormat (((String)yyvsa[yyvsp+(-1)])), true);
    showPrompt = false; ;}
    break;
  case 33:
// _line_ 128 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandPrint (((String)yyvsa[yyvsp+(0)]), ((Integer)yyvsa[yyvsp+(-1)]), ' ', true);
    showPrompt = false; ;}
    break;
  case 34:
// _line_ 131 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandSet ("print", "compressed", 0); ;}
    break;
  case 35:
// _line_ 133 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandSet ("print", "pretty", 0); ;}
    break;
  case 36:
// _line_ 135 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandSet ("print", "elements", ((Integer)yyvsa[yyvsp+(0)])); ;}
    break;
  case 37:
// _line_ 137 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandSet ("print", "max-frames", ((Integer)yyvsa[yyvsp+(0)])); ;}
    break;
  case 38:
// _line_ 139 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandSet ("print", "return", 1); ;}
    break;
  case 39:
// _line_ 141 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandSet ("print", "return", 0); ;}
    break;
  case 40:
// _line_ 143 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandSet ("stdin", "on", 0); ;}
    break;
  case 41:
// _line_ 145 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandSet ("stdin", "off", 0); ;}
    break;
  case 42:
// _line_ 147 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandPrint (((String)yyvsa[yyvsp+(0)]), evaluator.PRINT, ' ', false); ;}
    break;
  case 43:
// _line_ 149 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandSet ("history", "save", ((Integer)yyvsa[yyvsp+(0)])); ;}
    break;
  case 44:
// _line_ 151 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandPrint (((String)yyvsa[yyvsp+(-2)]) + " " + ((String)yyvsa[yyvsp+(0)]),
       evaluator.PRINT, ' ', false); ;}
    break;
  case 45:
// _line_ 154 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandThread (((String)yyvsa[yyvsp+(-1)])); ;}
    break;
  case 46:
// _line_ 156 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandThreadGroup (((String)yyvsa[yyvsp+(-1)])); ;}
    break;
  case 47:
// _line_ 158 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandSuspend (); ;}
    break;
  case 48:
// _line_ 160 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandSuspend (); ;}
    break;
  case 49:
// _line_ 162 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandSuspend (); ;}
    break;
  case 50:
// _line_ 164 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandSuspend (((List)yyvsa[yyvsp+(-1)])); ;}
    break;
  case 51:
// _line_ 166 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandResume (); ;}
    break;
  case 52:
// _line_ 168 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandResume (((List)yyvsa[yyvsp+(-1)])); ;}
    break;
  case 53:
// _line_ 170 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandKill (((String)yyvsa[yyvsp+(-1)]), ((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 54:
// _line_ 172 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandInterrupt (); ;}
    break;
  case 55:
// _line_ 174 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandInterrupt (((String)yyvsa[yyvsp+(-1)])); ;}
    break;
  case 56:
// _line_ 176 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandBreak (); ;}
    break;
  case 57:
// _line_ 178 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandBreak (((BreakpointSpec)yyvsa[yyvsp+(0)])); ;}
    break;
  case 58:
// _line_ 180 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandClear (((List)yyvsa[yyvsp+(0)])); ;}
    break;
  case 59:
// _line_ 182 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandCommand (reader, false); ;}
    break;
  case 60:
// _line_ 184 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandCommand (((Integer)yyvsa[yyvsp+(0)]), reader, false); ;}
    break;
  case 61:
// _line_ 186 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandCond (((String)yyvsa[yyvsp+(-1)])); ;}
    break;
  case 62:
// _line_ 188 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandCond (((Integer)yyvsa[yyvsp+(-2)]), ((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 63:
// _line_ 190 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandCatch (); ;}
    break;
  case 64:
// _line_ 192 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandCatch (((EventRequestSpec)yyvsa[yyvsp+(0)])); ;}
    break;
  case 65:
// _line_ 194 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandPass (); ;}
    break;
  case 66:
// _line_ 196 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandPass (((EventRequestSpec)yyvsa[yyvsp+(0)])); ;}
    break;
  case 67:
// _line_ 198 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandWatch (((List)yyvsa[yyvsp+(0)])); ;}
    break;
  case 68:
// _line_ 200 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandUnwatch (); ;}
    break;
  case 69:
// _line_ 202 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandUnwatch (((List)yyvsa[yyvsp+(0)])); ;}
    break;
  case 70:
// _line_ 204 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandDelete (); ;}
    break;
  case 71:
// _line_ 206 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandDelete (((List)yyvsa[yyvsp+(0)])); ;}
    break;
  case 72:
// _line_ 208 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandIgnore (((Integer)yyvsa[yyvsp+(-1)]), ((Integer)yyvsa[yyvsp+(0)])); ;}
    break;
  case 73:
// _line_ 210 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandTrace (((Integer)yyvsa[yyvsp+(-1)]), null); ;}
    break;
  case 74:
// _line_ 212 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandTrace (((Integer)yyvsa[yyvsp+(-2)]), ((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 75:
// _line_ 214 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandUntrace (); ;}
    break;
  case 76:
// _line_ 216 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandStep (StepRequest.STEP_LINE,
      StepRequest.STEP_OUT, 1); ;}
    break;
  case 77:
// _line_ 219 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandStep (StepRequest.STEP_LINE,
      StepRequest.STEP_INTO, ((Integer)yyvsa[yyvsp+(0)])); ;}
    break;
  case 78:
// _line_ 222 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandStep (StepRequest.STEP_LINE,
      StepRequest.STEP_OUT, 1); ;}
    break;
  case 79:
// _line_ 225 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandStep (StepRequest.STEP_LINE,
      StepRequest.STEP_OVER, ((Integer)yyvsa[yyvsp+(0)])); ;}
    break;
  case 80:
// _line_ 228 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandStep (StepRequest.STEP_MIN,
      StepRequest.STEP_INTO, ((Integer)yyvsa[yyvsp+(0)])); ;}
    break;
  case 81:
// _line_ 231 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandCont (); ;}
    break;
  case 82:
// _line_ 233 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandExclude (); ;}
    break;
  case 83:
// _line_ 235 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandExcludeClear (); ;}
    break;
  case 84:
// _line_ 237 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandExcludeReset (); ;}
    break;
  case 85:
// _line_ 239 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandExcludeAdd (((List)yyvsa[yyvsp+(0)])); ;}
    break;
  case 86:
// _line_ 241 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandExcludeSet (((List)yyvsa[yyvsp+(0)])); ;}
    break;
  case 87:
// _line_ 243 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandLock (((String)yyvsa[yyvsp+(0)]));
    showPrompt = false; ;}
    break;
  case 88:
// _line_ 246 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandEnableGC (((String)yyvsa[yyvsp+(0)]), false);
    showPrompt = false; ;}
    break;
  case 89:
// _line_ 249 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandEnableGC (((String)yyvsa[yyvsp+(0)]), true);
    showPrompt = false; ;}
    break;
  case 90:
// _line_ 252 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandLocals (); ;}
    break;
  case 91:
// _line_ 254 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandClasses (); ;}
    break;
  case 92:
// _line_ 256 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandClass (((String)yyvsa[yyvsp+(-1)]), false); ;}
    break;
  case 93:
// _line_ 258 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandClass (((String)yyvsa[yyvsp+(-2)]), true); ;}
    break;
  case 94:
// _line_ 260 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandMethods (((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 95:
// _line_ 262 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandFields (((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 96:
// _line_ 264 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandThreads (); ;}
    break;
  case 97:
// _line_ 266 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandThreads (((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 98:
// _line_ 268 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandThreadGroups (); ;}
    break;
  case 99:
// _line_ 270 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandClasspathInfo (); ;}
    break;
  case 100:
// _line_ 272 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandThreadlocks (); ;}
    break;
  case 101:
// _line_ 274 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandThreadlocksAll (); ;}
    break;
  case 102:
// _line_ 276 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandThreadlocks (((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 103:
// _line_ 278 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandInfoRun (); ;}
    break;
  case 104:
// _line_ 280 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.listEventSpecs (BreakpointSpec.EXMPL); ;}
    break;
  case 105:
// _line_ 282 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.listEventSpecs (WatchpointSpec.EXMPL); ;}
    break;
  case 106:
// _line_ 284 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.listEventSpecs (ExceptionSpec.EXMPL); ;}
    break;
  case 107:
// _line_ 286 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandWhere (((String)yyvsa[yyvsp+(-1)]), false); ;}
    break;
  case 108:
// _line_ 288 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandWhere (null, false); ;}
    break;
  case 109:
// _line_ 290 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandWhereAll (false); ;}
    break;
  case 110:
// _line_ 292 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandLoadclass (((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 111:
// _line_ 294 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandClasspath (); ;}
    break;
  case 112:
// _line_ 296 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandClasspath (((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 113:
// _line_ 298 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandUse (); ;}
    break;
  case 114:
// _line_ 300 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandUse (((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 115:
// _line_ 302 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandMonitor (); ;}
    break;
  case 116:
// _line_ 304 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandMonitor (((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 117:
// _line_ 306 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandUnmonitor (((Integer)yyvsa[yyvsp+(0)])); ;}
    break;
  case 118:
// _line_ 308 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandRead (((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 119:
// _line_ 310 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandList (-1, null); ;}
    break;
  case 120:
// _line_ 312 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandList (((Integer)yyvsa[yyvsp+(0)]), null); ;}
    break;
  case 121:
// _line_ 314 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandList (-1, ((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 122:
// _line_ 316 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandLines (((String)yyvsa[yyvsp+(0)]), null); ;}
    break;
  case 123:
// _line_ 318 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandLines (((String)yyvsa[yyvsp+(-1)]), ((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 124:
// _line_ 320 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandBytecodes (((String)yyvsa[yyvsp+(-1)]), ((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 125:
// _line_ 322 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandBytecodes (((String)yyvsa[yyvsp+(-2)]), ((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 126:
// _line_ 324 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandVersion (GJDB.progname, Version.value); ;}
    break;
  case 127:
// _line_ 326 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandQuit (); ;}
    break;
  case 128:
// _line_ 328 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { GJDB.help (); ;}
    break;
  case 129:
// _line_ 330 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { GJDB.help (((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 130:
// _line_ 332 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandRepeat (((Integer)yyvsa[yyvsp+(-2)]), ((String)yyvsa[yyvsp+(0)]), reader); ;}
    break;
  case 131:
// _line_ 336 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = convertInt (((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 132:
// _line_ 339 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = 1; ;}
    break;
  case 133:
// _line_ 340 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = convertInt (((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 134:
// _line_ 344 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = -1; ;}
    break;
  case 135:
// _line_ 345 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = convertInt (((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 136:
// _line_ 349 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { ArrayList<Integer> L = new ArrayList<Integer> ();
     yyval = L; L.add (((Integer)yyvsa[yyvsp+(0)])); ;}
    break;
  case 137:
// _line_ 352 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = ((List)yyvsa[yyvsp+(-1)]); ((List)yyvsa[yyvsp+(-1)]).add (((Integer)yyvsa[yyvsp+(0)])); ;}
    break;
  case 140:
// _line_ 361 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { ArrayList<String> v = new ArrayList<String> ();
     v.add (((String)yyvsa[yyvsp+(0)]));
     yyval = v; ;}
    break;
  case 141:
// _line_ 365 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = ((List)yyvsa[yyvsp+(-1)]); ((List)yyvsa[yyvsp+(-1)]).add (((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 145:
// _line_ 379 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { CommandLineSpec spec = ((CommandLineSpec)yyvsa[yyvsp+(-1)]);
     spec.cmdArgs += " " + shellConvert (((String)yyvsa[yyvsp+(0)]));
     yyval = spec; ;}
    break;
  case 146:
// _line_ 383 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { CommandLineSpec spec = ((CommandLineSpec)yyvsa[yyvsp+(-1)]);
     spec.cmdArgs = " " + shellConvert (((String)yyvsa[yyvsp+(-2)]))
      + spec.cmdArgs;
     yyval = spec; ;}
    break;
  case 147:
// _line_ 391 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = ((CommandLineSpec)yyvsa[yyvsp+(-1)]); ;}
    break;
  case 148:
// _line_ 392 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = (yyvsa[yyvsp+(-1)]); ;}
    break;
  case 149:
// _line_ 398 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { CommandLineSpec spec = ((CommandLineSpec)yyvsa[yyvsp+(-2)]);
     if (spec.inFile != null)
         throw ERROR ("Ambiguous input redirection");
     spec.inFile = shellConvert (((String)yyvsa[yyvsp+(0)]));
   ;}
    break;
  case 150:
// _line_ 404 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { CommandLineSpec spec = ((CommandLineSpec)yyvsa[yyvsp+(-2)]);
     if (spec.outFile != null)
         throw ERROR ("Ambiguous output redirection");
     spec.outFile = shellConvert (((String)yyvsa[yyvsp+(0)]));
   ;}
    break;
  case 151:
// _line_ 410 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { CommandLineSpec spec = ((CommandLineSpec)yyvsa[yyvsp+(-3)]);
     if (spec.outFile != null)
         throw ERROR ("Ambiguous output redirection");
     spec.outFile = spec.errFile = shellConvert (((String)yyvsa[yyvsp+(0)]));
   ;}
    break;
  case 152:
// _line_ 418 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = ""; ;}
    break;
  case 154:
// _line_ 423 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = null; ;}
    break;
  case 155:
// _line_ 425 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = ((List)yyvsa[yyvsp+(-1)]); ;}
    break;
  case 156:
// _line_ 426 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = Collections.EMPTY_LIST; ;}
    break;
  case 157:
// _line_ 430 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { ArrayList<String> L = new ArrayList<String> ();
     yyval = L;
     L.add (((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 158:
// _line_ 434 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = ((List)yyvsa[yyvsp+(-2)]); ((List)yyvsa[yyvsp+(-2)]).add (((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 160:
// _line_ 439 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = ((String)yyvsa[yyvsp+(-1)]) + "[]"; ;}
    break;
  case 162:
// _line_ 444 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = ((String)yyvsa[yyvsp+(-2)]) + "." + ((String)yyvsa[yyvsp+(0)]); ;}
    break;
  case 163:
// _line_ 449 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = createBreakpointSpec (((String)yyvsa[yyvsp+(-4)]), ((String)yyvsa[yyvsp+(-2)]), ((List)yyvsa[yyvsp+(-1)]), ((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 164:
// _line_ 451 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = createBreakpointSpec (((String)yyvsa[yyvsp+(-3)]), ((Integer)yyvsa[yyvsp+(-1)]), ((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 165:
// _line_ 456 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { ArrayList<Object> L = new ArrayList<Object> ();
        yyval = L;
        L.add (((BreakpointSpec)yyvsa[yyvsp+(0)])); ;}
    break;
  case 166:
// _line_ 460 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = ((List)yyvsa[yyvsp+(-1)]); ((List)yyvsa[yyvsp+(-1)]).add (((BreakpointSpec)yyvsa[yyvsp+(0)])); ;}
    break;
  case 167:
// _line_ 464 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = createBreakpointSpec (((Integer)yyvsa[yyvsp+(0)])); ;}
    break;
  case 168:
// _line_ 466 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = createBreakpointSpec (((String)yyvsa[yyvsp+(-3)]), ((String)yyvsa[yyvsp+(-1)]), ((List)yyvsa[yyvsp+(0)]), null); ;}
    break;
  case 169:
// _line_ 468 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = createBreakpointSpec (((String)yyvsa[yyvsp+(-2)]), ((Integer)yyvsa[yyvsp+(0)]), null); ;}
    break;
  case 170:
// _line_ 472 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = "*." + ((String)yyvsa[yyvsp+(0)]); ;}
    break;
  case 172:
// _line_ 475 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { if (((String)yyvsa[yyvsp+(-2)]).endsWith (".0"))
           throw ERROR ("Bad class specification");
       yyval = ((String)yyvsa[yyvsp+(-2)]) + "." + ((String)yyvsa[yyvsp+(0)]); ;}
    break;
  case 173:
// _line_ 479 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { if (((String)yyvsa[yyvsp+(-1)]).endsWith (".0"))
           throw ERROR ("Bad class specification");
       yyval = ((String)yyvsa[yyvsp+(-1)]) + ".0"; ;}
    break;
  case 174:
// _line_ 486 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { ArrayList<String> L = new ArrayList<String> ();
     L.add (((String)yyvsa[yyvsp+(0)]));
     yyval = L;
   ;}
    break;
  case 175:
// _line_ 491 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = ((List)yyvsa[yyvsp+(-2)]); ((List)yyvsa[yyvsp+(-2)]).add (((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 180:
// _line_ 502 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = "*"; ;}
    break;
  case 181:
// _line_ 503 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = ((String)yyvsa[yyvsp+(-2)]) + "." + ((String)yyvsa[yyvsp+(0)]); ;}
    break;
  case 182:
// _line_ 504 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = ((String)yyvsa[yyvsp+(-2)]) + ".*"; ;}
    break;
  case 183:
// _line_ 508 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = createExceptionSpec ("*." + ((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 184:
// _line_ 509 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = createExceptionSpec (((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 185:
// _line_ 513 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = null; ;}
    break;
  case 186:
// _line_ 515 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = ((String)yyvsa[yyvsp+(0)]); ;}
    break;
  case 187:
// _line_ 520 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = createWatchSpec (((Integer)yyvsa[yyvsp+(-4)]), ((String)yyvsa[yyvsp+(-3)]), ((String)yyvsa[yyvsp+(-2)]), null, ((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 188:
// _line_ 523 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = createWatchSpec (((Integer)yyvsa[yyvsp+(-7)]), ((String)yyvsa[yyvsp+(-6)]), null, ((String)yyvsa[yyvsp+(-4)]), ((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 189:
// _line_ 527 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = ""; ;}
    break;
  case 190:
// _line_ 528 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = "all"; ;}
    break;
  case 191:
// _line_ 529 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = "access"; ;}
    break;
  case 192:
// _line_ 533 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = EventRequest.SUSPEND_ALL; ;}
    break;
  case 193:
// _line_ 534 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = EventRequest.SUSPEND_NONE; ;}
    break;
  case 194:
// _line_ 535 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = EventRequest.SUSPEND_EVENT_THREAD; ;}
    break;
  case 195:
// _line_ 540 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = ((String)yyvsa[yyvsp+(0)]); ;}
    break;
  case 196:
// _line_ 544 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = (yyvsa[yyvsp+(-1)]); ;}
    break;
  case 197:
// _line_ 549 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { lexer.toDefaultMode (); ;}
    break;
  case 198:
// _line_ 552 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { lexer.toBreakMode (); ;}
    break;
  case 199:
// _line_ 556 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { lexer.toPrintMode (); ;}
    break;
  case 200:
// _line_ 560 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.checkConnect (); ;}
    break;
  case 201:
// _line_ 564 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { lexer.toBalancedCollectMode (); ;}
    break;
  case 202:
// _line_ 568 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { lexer.toCollectMode (); ;}
    break;
  case 203:
// _line_ 572 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { lexer.toRunArgsMode (); ;}
    break;
    }
/* Line 813 of yacc.java.  */
// _line_ 2105 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.java"
  yyvsp -= yylen;
  yyssp -= yylen;
  yylsp -= yylen;
  do { if (yydebug != 0) yy_stack_print (yyssa, (yyss), (yyssp)); } while (false);
  yyvsa[++yyvsp] = yyval;
  yylsa[++yylsp] = yyloc;
  /* Now `shift' the result of the reduction.  Determine what state
     that goes to, based on the state we popped back to and the rule
     number reduced by.  */
  yyn = yyr1[yyn];
  yystate = yypgoto[yyn - 107] + yyssa[yyssp];
  if (0 <= yystate && yystate <= 413 && yycheck[yystate] == yyssa[yyssp])
    yystate = yytable[yystate];
  else
    yystate = yydefgoto[yyn - 107];
  do { pc = yynewstate; continue Loop; } while (false);
/*------------------------------------.
| yyerrlab -- here on detecting error |
`------------------------------------*/
case yyerrlab:
  /* If not already recovering from an error, report this error.  */
  if (yyerrstatus == 0)
    {
      ++yynerrs;
 yyerror (yylloc, "syntax error");
    }
  yyerror_range[0] = yylloc;
  if (yyerrstatus == 3)
    {
      /* If just tried and failed to reuse look-ahead token after an
	 error, discard it.  */
      if (yychar <= 0)
        {
          /* If at end of input, pop the error token,
	     then the rest of the stack, then return failure.  */
   if (yychar == 0)
      for (;;)
        {
                 yyerror_range[0] = yylsa[yylsp];
   yyvsp--; yyssp--; yylsp--;
   if (yyssp == yyss)
     do { pc = yyabortlab; continue Loop; } while (false);
        }
        }
      else
 {
   yychar = (-2);
 }
    }
  /* Else will try to reuse look-ahead token after shifting the error
     token.  */
  do { pc = yyerrlab1; continue Loop; } while (false);
/*---------------------------------------------------.
| yyerrorlab -- error raised explicitly by YYERROR.  |
`---------------------------------------------------*/
case yyerrorlab:
  yyerror_range[0] = yylsa[yylsp+1-yylen];
  yylsp -= yylen;
  yyvsp -= yylen;
  yyssp -= yylen;
  yystate = yyssa[yyssp];
  do { pc = yyerrlab1; continue Loop; } while (false);
/*-------------------------------------------------------------.
| yyerrlab1 -- common code for both syntax error and YYERROR.  |
`-------------------------------------------------------------*/
case yyerrlab1:
  yyerrstatus = 3; /* Each real token shifted decrements this.  */
  for (;;)
    {
      yyn = yypact[yystate];
      if (yyn != -159)
 {
   yyn += 1;
   if (0 <= yyn && yyn <= 413 && yycheck[yyn] == 1)
     {
       yyn = yytable[yyn];
       if (0 < yyn)
  break;
     }
 }
      /* Pop the current state because it cannot handle the error token.  */
      if (yyssp == yyss)
 do { pc = yyabortlab; continue Loop; } while (false);
      yyerror_range[0] = yylsa[yylsp];
      yyvsp--; yyssp--; yylsp--;
      yystate = yyssa[yyssp];
      do { if (yydebug != 0) yy_stack_print (yyssa, (yyss), (yyssp)); } while (false);
    }
  if (yyn == 158)
    do { pc = yyacceptlab; continue Loop; } while (false);
  yyvsa[++yyvsp] = yylval;
  yyerror_range[1] = yylloc;
  /* Using YYLLOC is tempting, but would change the location of
     the look-ahead.  YYLOC is available though. */
  ;
  yylsa[++yylsp] = yyloc;
  /* Shift the error token. */
  do { if (yydebug != 0) { System.err.print ("Shifting" + " "); yysymprint (yystos[yyn], yyvsa[yyvsp], yylsa[yylsp]); System.err.print (yyendl); } } while (false);
  yystate = yyn;
  do { pc = yynewstate; continue Loop; } while (false);
/*-------------------------------------.
| yyacceptlab -- YYACCEPT comes here.  |
`-------------------------------------*/
case yyacceptlab:
  yyresult = 0;
  do { pc = yyreturn; continue Loop; } while (false);
/*-----------------------------------.
| yyabortlab -- YYABORT comes here.  |
`-----------------------------------*/
case yyabortlab:
  yychar = (-2);
  yyresult = 1;
  do { pc = yyreturn; continue Loop; } while (false);
/*----------------------------------------------.
| yyoverflowlab -- parser overflow comes here.  |
`----------------------------------------------*/
case yyoverflowlab:
  yyerror (yylloc, "parser stack overflow");
  yyresult = 2;
  /* Fall through.  */
case yyreturn:
  return yyresult;
}
}
}
// _line_ 575 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
private Commands evaluator;
private boolean showPrompt;
private BufferedReader reader;
private static final HashMap<String, Integer> tokenMap =
        new HashMap<String, Integer> ();
static void execute (String src, Commands evaluator, BufferedReader reader,
                     boolean prompt)
{
    execute (src, evaluator, reader, prompt, false);
}
static void execute (String src, Commands evaluator, BufferedReader reader,
                     boolean prompt, boolean passException)
{
    CommandParser parser = new CommandParser (new CommandLexer (src));
    try {
 try {
     parser.reader = reader;
     parser.evaluator = evaluator;
     parser.showPrompt = prompt;
     parser.parse ();
 } catch (UnsupportedOperationException uoe) {
     throw ERROR ("Command is not supported on the target VM");
 } catch (VMNotConnectedException vmnse) {
     throw ERROR ("Command is not valid until the program is started or attached");
        } catch (CommandException e) {
     throw e;
 } catch (VMDisconnectedException e) {
     Env.shutdown (null);
     throw ERROR ("Debugged process has disconnected.");
 } catch (Exception e) {
     throw ERROR ("Unknown error in command: %s", e);
        }
    } catch (CommandException e) {
 if (passException)
     throw e;
 Env.errorln ("%s", e.getMessage ());
    }
    if (parser.showPrompt)
        evaluator.printPrompt ();
}
private CommandParser (CommandLexer lexer) {
    this.lexer = lexer;
    lexer.parser = this;
}
private CommandLexer lexer;
private int convertInt (String s) {
    try {
        return Integer.decode (s);
    } catch (NumberFormatException e) {
        throw ERROR ("badly formed integer numeral");
    }
}
static final private Pattern PRINT_OPTIONS_PATN
  = Pattern.compile ("(?i)([xodbcsr]?)(\\d*)([xodbcsr]?)$");
private void startHandler () {
    evaluator.startHandler ();
}
private int printDepth (String spec) {
    Matcher m = PRINT_OPTIONS_PATN.matcher (spec);
    if (m.matches ()) {
        if (m.group (2).equals (""))
            return 0;
        else
            return Integer.parseInt (m.group (2));
    } else
        throw ERROR ("bad print format or depth specifier");
}
private char printFormat (String spec) {
    Matcher m = PRINT_OPTIONS_PATN.matcher (spec);
    if (m.matches () && m.group (1).length () + m.group (3).length () < 2) {
        if (m.group (1).equals ("") && m.group (3).equals (""))
            return ' ';
        else
            return (m.group (1) + m.group (3)).charAt (0);
    } else
        throw ERROR ("bad print format or depth specifier");
}
private BreakpointSpec createBreakpointSpec(int number)
{
    BreakpointSpec breakpoint =
        (BreakpointSpec) EventRequestSpec.idToSpec
            (Env.eventRequestSpecs (BreakpointSpec.EXMPL), number);
    if (breakpoint == null)
        throw ERROR ("No such breakpoint: %d", number);
    return breakpoint;
}
private BreakpointSpec createBreakpointSpec(String breakClass,
                                            int lineNum,
                                            String cond)
{
    try {
        BreakpointSpec breakpoint = (BreakpointSpec)
            Env.specList.createBreakpoint(breakClass, lineNum);
        breakpoint.setCondition (cond);
        return breakpoint;
    } catch (ClassNotFoundException exc) {
        throw ERROR ("Bad class name: %s", breakClass);
    }
}
private BreakpointSpec createBreakpointSpec(String breakClass,
                                            String method,
                                            List<String> formals,
                                            String cond)
{
    try {
        BreakpointSpec spec =
                (BreakpointSpec) Env.specList.createBreakpoint(breakClass,
                                                               method, formals);
        spec.setCondition (cond);
        return spec;
    } catch (BadMemberNameException exc) {
        throw ERROR ("Bad method name: %s", method);
    } catch (ClassNotFoundException exc) {
        throw ERROR ("Bad class name: %s", breakClass);
    }
}
private EventRequestSpec createExceptionSpec (String className) {
    try {
        return Env.specList.createExceptionCatch(className);
    } catch (ClassNotFoundException exc) {
        throw ERROR ("Bad class name: %s", className);
    }
}
private List<EventRequestSpec> createWatchSpec (int policy, String type,
                                                String classId, String expr,
                                                String fld)
{
    ArrayList<EventRequestSpec> specs = new ArrayList<EventRequestSpec> ();
    boolean access = !type.equals ("");
    boolean modification = !type.equals ("access");
    ObjectReference obj;
    if (expr == null) {
        obj = null;
    } else {
        Value val = evaluator.evaluate (expr);
        if (val instanceof ObjectReference)
           obj = (ObjectReference) val;
        else
           throw ERROR ("Value of (%s) is not object an object reference.",
                        expr);
    }
    try {
        if (access) {
            EventRequestSpec spec =
                Env.specList.createAccessWatchpoint(classId, fld, obj);
            spec.suspendPolicy = policy;
            specs.add (spec);
        }
        if (modification) {
            EventRequestSpec spec =
                Env.specList.createModificationWatchpoint(classId, fld, obj);
            spec.suspendPolicy = policy;
            specs.add(spec);
        }
    } catch (BadMemberNameException exc) {
        throw ERROR ("Bad field name: %s", fld);
    } catch (ClassNotFoundException exc) {
        throw ERROR ("Bad class name: %s", classId);
    }
    return specs;
}
private int yylex () {
    try {
       int v = lexer.scan ();
       yylval = lexer.lexeme;
       return v;
    } catch (CommandException e) {
       throw e;
    } catch (Exception e) {
       throw ERROR ("problem reading expression: %s", e);
    }
}
private void yyerror (int ignored0, String ignored1) {
    if (lexer.lastCommand == null)
        throw ERROR ("Unknown command.");
    List<String> usage = GJDB.commandUsageMsgs (lexer.lastCommand);
    if (usage.size () == 0)
 throw ERROR ("Syntax error in command.");
    Formatter result = new Formatter ();
    String format;
    format = "Usage: %s";
    for (String S : usage) {
 result.format (format, S);
 format = "%n       %s";
    }
    throw ERROR ("%s", result);
}
static int findQuotedToken (String s) {
    Integer i = tokenMap.get (s);
    return i == null ? 0 : i;
}
static String tildeConvert (String s) {
    if (s.equals ("~"))
        return System.getProperty ("user.home");
    try {
        Process p = Runtime.getRuntime ().exec (new String[] {
            System.getenv ("SHELL"), "-c", "echo " + s });
        StringBuilder r = new StringBuilder ();
        while (true) {
            int c = p.getInputStream ().read ();
            if (c == '\n' || c == -1)
                break;
            r.append ((char) c);
        }
        p.destroy ();
        return r.toString ();
    } catch (IOException e) {
        return s;
    }
}
static String shellConvert (String s) {
    if (s.startsWith ("~")) {
        int sl = s.indexOf (System.getProperty ("file.separator"));
        if (sl < 0)
            sl = s.length ();
        return tildeConvert (s.substring (0, sl)) + s.substring (sl);
    } else
        return s;
}
static {
    for (int i = 0; i < yytname.length; i += 1) {
        if (yytname[i] instanceof String) {
            String token = (String) yytname[i];
            if (token.startsWith ("\""))
                tokenMap.put (token.substring (1, token.length () - 1),
                              yytoknum[i]);
        }
    }
}
}
