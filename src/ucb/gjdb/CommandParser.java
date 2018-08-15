/* Copyright (C) 1991-2016 Free Software Foundation, Inc.
   This file is part of the GNU C Library.

   The GNU C Library is free software; you can redistribute it and/or
   modify it under the terms of the GNU Lesser General Public
   License as published by the Free Software Foundation; either
   version 2.1 of the License, or (at your option) any later version.

   The GNU C Library is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
   Lesser General Public License for more details.

   You should have received a copy of the GNU Lesser General Public
   License along with the GNU C Library; if not, see
   <http://www.gnu.org/licenses/>.  */
/* This header is separate from features.h so that the compiler can
   include it implicitly at the start of every compilation.  It must
   not itself include <features.h> or any other header that includes
   <features.h> because the implicit include comes before any feature
   test macros that may be defined in a source file before it first
   explicitly includes a system header.  GCC knows the name of this
   header in order to preinclude it.  */
/* glibc's intent is to support the IEC 559 math functionality, real
   and complex.  If the GCC (4.9 and later) predefined macros
   specifying compiler intent are available, use them to determine
   whether the overall intent is to support these features; otherwise,
   presume an older compiler has intent to support these features and
   define these macros by default.  */
/* wchar_t uses Unicode 8.0.0.  Version 8.0 of the Unicode Standard is
   synchronized with ISO/IEC 10646:2014, plus Amendment 1 (published
   2015-05-15).  */
/* We do not support C11 <threads.h>.  */
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
       2, 2, 2, 2, 2, 2, 2, 2, 105, 2,
      56, 57, 108, 77, 106, 2, 99, 16, 2, 2,
       2, 2, 2, 2, 2, 2, 2, 2, 12, 110,
     103, 2, 104, 2, 2, 2, 2, 2, 2, 2,
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
      47, 48, 49, 50, 51, 52, 53, 54, 55, 58,
      59, 60, 61, 62, 63, 64, 65, 66, 67, 68,
      69, 70, 71, 72, 73, 74, 75, 76, 78, 79,
      80, 81, 82, 83, 84, 85, 86, 87, 88, 89,
      90, 91, 92, 93, 94, 95, 96, 97, 98, 100,
     101, 102, 107, 109, 111, 112, 113
};
/* YYPRHS[YYN] -- Index of the first RHS symbol of rule number YYN in
   YYRHS.  */
static final char yyprhs[] =
{
       0, 0, 3, 5, 8, 9, 14, 17, 22, 25,
      27, 31, 37, 43, 47, 53, 59, 62, 64, 67,
      70, 71, 76, 80, 83, 87, 91, 94, 98, 102,
     106, 110, 113, 118, 121, 125, 131, 137, 141, 145,
     150, 155, 160, 165, 170, 175, 180, 184, 188, 192,
     196, 201, 205, 209, 212, 216, 219, 223, 226, 230,
     234, 237, 241, 244, 248, 252, 254, 257, 263, 268,
     271, 275, 278, 282, 285, 288, 291, 293, 296, 299,
     302, 306, 311, 317, 321, 325, 329, 332, 336, 340,
     343, 345, 349, 353, 358, 362, 366, 370, 374, 378,
     381, 388, 396, 401, 406, 410, 415, 419, 423, 427,
     432, 437, 440, 443, 446, 449, 454, 458, 463, 468,
     471, 475, 478, 482, 485, 489, 492, 496, 499, 502,
     505, 509, 514, 520, 527, 529, 531, 533, 536, 540,
     542, 543, 545, 546, 548, 550, 553, 555, 557, 559,
     562, 564, 566, 568, 570, 574, 576, 579, 582, 585,
     589, 590, 592, 593, 597, 600, 602, 606, 608, 611,
     613, 617, 623, 628, 630, 633, 635, 640, 644, 648,
     650, 654, 657, 659, 663, 664, 666, 668, 670, 672,
     676, 680, 684, 686, 687, 691, 698, 708, 709, 711,
     713, 714, 716, 718, 721, 722, 723, 724, 725, 726,
     727, 728
};
/* YYRHS -- A `-1'-separated list of the rules' RHS. */
static final short yyrhs[] =
{
     115, 0, -1, 116, -1, 9, 155, -1, -1, 9,
     155, 117, 127, -1, 10, 125, -1, 11, 3, 12,
     130, -1, 13, 126, -1, 14, -1, 15, 151, 147,
      -1, 15, 151, 16, 3, 147, -1, 15, 151, 16,
     119, 147, -1, 17, 151, 147, -1, 17, 151, 16,
       3, 147, -1, 17, 151, 16, 119, 147, -1, 18,
     147, -1, 19, -1, 19, 3, -1, 20, 155, -1,
      -1, 20, 155, 118, 127, -1, 21, 3, 152, -1,
      21, 152, -1, 21, 22, 152, -1, 23, 5, 152,
      -1, 23, 152, -1, 23, 22, 152, -1, 24, 120,
     152, -1, 25, 120, 152, -1, 26, 119, 152, -1,
      27, 152, -1, 27, 152, 3, 147, -1, 28, 147,
      -1, 29, 151, 147, -1, 29, 151, 16, 3, 147,
      -1, 29, 151, 16, 119, 147, -1, 30, 15, 31,
      -1, 30, 15, 32, -1, 30, 15, 33, 119, -1,
      30, 15, 34, 119, -1, 30, 15, 35, 36, -1,
      30, 15, 35, 37, -1, 30, 15, 38, 39, -1,
      30, 15, 38, 40, -1, 30, 15, 38, 41, -1,
      30, 42, 36, -1, 30, 42, 37, -1, 30, 43,
     147, -1, 30, 44, 119, -1, 30, 3, 154, 4,
      -1, 45, 123, 152, -1, 46, 3, 152, -1, 47,
     154, -1, 47, 154, 4, -1, 48, 152, -1, 48,
     124, 152, -1, 49, 152, -1, 49, 124, 152, -1,
      50, 123, 147, -1, 51, 152, -1, 51, 123, 152,
      -1, 52, 150, -1, 52, 150, 135, -1, 53, 150,
     136, -1, 54, -1, 54, 119, -1, 55, 56, 153,
       4, 57, -1, 55, 119, 153, 4, -1, 58, 150,
      -1, 58, 150, 142, -1, 59, 150, -1, 59, 150,
     142, -1, 60, 144, -1, 61, 150, -1, 61, 144,
      -1, 62, -1, 62, 122, -1, 63, 119, -1, 64,
     119, -1, 65, 119, 119, -1, 66, 152, 146, 67,
      -1, 66, 152, 146, 67, 123, -1, 68, 152, 67,
      -1, 69, 152, 24, -1, 69, 152, 120, -1, 70,
     152, -1, 71, 152, 120, -1, 72, 152, 120, -1,
      73, 152, -1, 74, -1, 74, 150, 75, -1, 74,
     150, 76, -1, 74, 150, 77, 139, -1, 74, 150,
     139, -1, 78, 152, 147, -1, 79, 152, 147, -1,
      80, 152, 147, -1, 81, 82, 152, -1, 81, 83,
      -1, 81, 84, 150, 152, 134, 149, -1, 81, 84,
     150, 152, 134, 149, 22, -1, 81, 67, 150, 134,
      -1, 81, 85, 150, 134, -1, 81, 86, 152, -1,
      81, 86, 152, 3, -1, 81, 87, 152, -1, 81,
      88, 152, -1, 81, 89, 152, -1, 81, 89, 152,
      22, -1, 81, 89, 152, 123, -1, 81, 9, -1,
      81, 52, -1, 81, 60, -1, 81, 58, -1, 81,
      90, 3, 152, -1, 81, 90, 152, -1, 81, 90,
      22, 152, -1, 91, 150, 152, 134, -1, 88, 155,
      -1, 88, 155, 3, -1, 92, 155, -1, 92, 155,
       3, -1, 93, 153, -1, 93, 153, 4, -1, 94,
     119, -1, 95, 155, 3, -1, 96, 150, -1, 96,
     119, -1, 96, 3, -1, 97, 150, 134, -1, 97,
     150, 134, 8, -1, 98, 150, 152, 134, 8, -1,
      98, 150, 152, 134, 99, 8, -1, 100, -1, 101,
      -1, 102, -1, 102, 3, -1, 119, 154, 4, -1,
       5, -1, -1, 5, -1, -1, 5, -1, 119, -1,
     122, 119, -1, 8, -1, 5, -1, 123, -1, 124,
     123, -1, 119, -1, 121, -1, 128, -1, 3, -1,
       3, 148, 127, -1, 129, -1, 128, 129, -1, 103,
       3, -1, 104, 3, -1, 104, 105, 3, -1, -1,
       3, -1, -1, 56, 132, 57, -1, 56, 57, -1,
     133, -1, 132, 106, 133, -1, 134, -1, 133, 107,
      -1, 8, -1, 134, 99, 8, -1, 138, 99, 8,
     131, 143, -1, 138, 12, 119, 143, -1, 137, -1,
     136, 137, -1, 119, -1, 138, 99, 8, 131, -1,
     138, 12, 119, -1, 108, 99, 8, -1, 8, -1,
     138, 99, 8, -1, 138, 109, -1, 141, -1, 139,
     140, 141, -1, -1, 106, -1, 110, -1, 8, -1,
     108, -1, 141, 99, 8, -1, 141, 99, 108, -1,
     108, 99, 134, -1, 134, -1, -1, 111, 153, 4,
      -1, 150, 146, 145, 134, 99, 8, -1, 150, 146,
     145, 56, 147, 57, 150, 99, 8, -1, -1, 22,
      -1, 112, -1, -1, 113, -1, 45, -1, 153, 4,
      -1, -1, -1, -1, -1, -1, -1, -1, -1
};
/* YYRLINE[YYN] -- source line where rule number YYN was defined.  */
static final char yyrline[] =
{
       0, 56, 56, 60, 63, 63, 66, 69, 72, 75,
      77, 80, 84, 87, 90, 94, 97, 100, 102, 104,
     106, 106, 108, 110, 112, 114, 116, 118, 120, 122,
     124, 126, 129, 132, 134, 137, 141, 144, 146, 148,
     150, 152, 154, 156, 158, 160, 162, 164, 166, 168,
     170, 173, 175, 177, 179, 181, 183, 185, 187, 189,
     191, 193, 195, 197, 199, 201, 203, 205, 207, 209,
     211, 213, 215, 217, 219, 221, 223, 225, 227, 229,
     231, 233, 235, 237, 239, 242, 245, 248, 251, 254,
     256, 258, 260, 262, 264, 266, 269, 272, 275, 277,
     279, 281, 283, 285, 287, 289, 291, 293, 295, 297,
     299, 301, 303, 305, 307, 309, 311, 313, 315, 317,
     319, 321, 323, 325, 327, 329, 331, 333, 335, 337,
     339, 341, 343, 345, 347, 349, 351, 353, 355, 360,
     363, 364, 368, 369, 373, 375, 380, 381, 385, 388,
     392, 396, 401, 402, 406, 415, 416, 421, 427, 433,
     442, 443, 447, 448, 450, 454, 457, 462, 463, 467,
     468, 472, 474, 479, 483, 488, 489, 491, 496, 497,
     498, 502, 509, 514, 518, 520, 521, 525, 526, 527,
     528, 532, 533, 537, 538, 543, 545, 551, 552, 553,
     557, 558, 559, 563, 568, 573, 576, 580, 584, 588,
     592, 596
};
static final int YY_NUM_TERMINALS = 114;
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
  "\"listen\"", "\"detach\"", "\"print\"", "'/'", "\"dump\"", "\"call\"",
  "\"exec-class\"", "\"exec-args\"", "\"backtrace\"", "\"all\"",
  "\"wherei\"", "\"up\"", "\"down\"", "\"frame\"", "\"save\"", "\"ptype\"",
  "\"dumpall\"", "\"set\"", "\"compressed\"", "\"pretty\"", "\"elements\"",
  "\"max-frames\"", "\"return\"", "\"on\"", "\"off\"", "\"prefix\"",
  "\"standard\"", "\"exprs\"", "\"both\"", "\"stdin\"", "\"variable\"",
  "\"history\"", "\"thread\"", "\"threadgroup\"", "\"^F\"", "\"suspend\"",
  "\"resume\"", "\"kill\"", "\"interrupt\"", "\"break\"", "\"clear\"",
  "\"command\"", "\"condition\"", "'('", "')'", "\"catch\"", "\"pass\"",
  "\"watch\"", "\"unwatch\"", "\"delete\"", "\"disable\"", "\"enable\"",
  "\"ignore\"", "\"trace\"", "\"methods\"", "\"untrace\"", "\"step\"",
  "\"finish\"", "\"next\"", "\"stepi\"", "\"continue\"", "\"exclude\"",
  "\"none\"", "\"reset\"", "'+'", "\"lock\"", "\"disablegc\"",
  "\"enablegc\"", "\"info\"", "\"locals\"", "\"classes\"", "\"class\"",
  "\"fields\"", "\"threads\"", "\"threadgroups\"", "\"classpath\"",
  "\"threadlocks\"", "\"stack\"", "\"loadclass\"", "\"sourcepath\"",
  "\"monitor\"", "\"unmonitor\"", "\"source\"", "\"list\"", "\"lines\"",
  "\"bytecodes\"", "'.'", "\"version\"", "\"quit\"", "\"help\"", "'<'",
  "'>'", "'&'", "','", "\"[]\"", "'*'", "\".0\"", "';'", "\"if\"",
  "\"access\"", "\"go\"", "$accept", "start", "command", "@1", "@2",
  "intlit", "intlit_dflt1", "intlit_dflt_m1", "int_list", "thread_id",
  "thread_id_list", "address", "address_opt", "run_args", "file_specs",
  "file_spec", "connector_args", "formal_types_opt", "formal_types",
  "formal_type", "class_id", "breakpoint_spec",
  "delete_breakpoint_spec_list", "delete_breakpoint_spec",
  "break_class_id", "exclude_class_id_list", "opt_sep", "id_pattern",
  "exception_spec", "if_clause_opt", "watchpoint_spec", "watch_type",
  "suspend_policy", "expr", "_copy_two_back", "_default_mode",
  "_break_mode", "_print_mode", "_check_connect", "_balanced_collect_mode",
  "_collect_all_mode", "_run_args_mode", 0
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
     303, 304, 305, 306, 307, 308, 40, 41, 309, 310,
     311, 312, 313, 314, 315, 316, 317, 318, 319, 320,
     321, 322, 323, 324, 325, 326, 327, 43, 328, 329,
     330, 331, 332, 333, 334, 335, 336, 337, 338, 339,
     340, 341, 342, 343, 344, 345, 346, 347, 348, 46,
     349, 350, 351, 60, 62, 38, 44, 352, 42, 353,
      59, 354, 355, 356
};
/* YYR1[YYN] -- Symbol number of symbol that rule YYN derives.  */
static final short yyr1[] =
{
       0, 114, 115, 116, 117, 116, 116, 116, 116, 116,
     116, 116, 116, 116, 116, 116, 116, 116, 116, 116,
     118, 116, 116, 116, 116, 116, 116, 116, 116, 116,
     116, 116, 116, 116, 116, 116, 116, 116, 116, 116,
     116, 116, 116, 116, 116, 116, 116, 116, 116, 116,
     116, 116, 116, 116, 116, 116, 116, 116, 116, 116,
     116, 116, 116, 116, 116, 116, 116, 116, 116, 116,
     116, 116, 116, 116, 116, 116, 116, 116, 116, 116,
     116, 116, 116, 116, 116, 116, 116, 116, 116, 116,
     116, 116, 116, 116, 116, 116, 116, 116, 116, 116,
     116, 116, 116, 116, 116, 116, 116, 116, 116, 116,
     116, 116, 116, 116, 116, 116, 116, 116, 116, 116,
     116, 116, 116, 116, 116, 116, 116, 116, 116, 116,
     116, 116, 116, 116, 116, 116, 116, 116, 116, 119,
     120, 120, 121, 121, 122, 122, 123, 123, 124, 124,
     125, 126, 127, 127, 127, 128, 128, 129, 129, 129,
     130, 130, 131, 131, 131, 132, 132, 133, 133, 134,
     134, 135, 135, 136, 136, 137, 137, 137, 138, 138,
     138, 138, 139, 139, 140, 140, 140, 141, 141, 141,
     141, 142, 142, 143, 143, 144, 144, 145, 145, 145,
     146, 146, 146, 147, 148, 149, 150, 151, 152, 153,
     154, 155
};
/* YYR2[YYN] -- Number of symbols composing right hand side of rule YYN.  */
static final short yyr2[] =
{
       0, 2, 1, 2, 0, 4, 2, 4, 2, 1,
       3, 5, 5, 3, 5, 5, 2, 1, 2, 2,
       0, 4, 3, 2, 3, 3, 2, 3, 3, 3,
       3, 2, 4, 2, 3, 5, 5, 3, 3, 4,
       4, 4, 4, 4, 4, 4, 3, 3, 3, 3,
       4, 3, 3, 2, 3, 2, 3, 2, 3, 3,
       2, 3, 2, 3, 3, 1, 2, 5, 4, 2,
       3, 2, 3, 2, 2, 2, 1, 2, 2, 2,
       3, 4, 5, 3, 3, 3, 2, 3, 3, 2,
       1, 3, 3, 4, 3, 3, 3, 3, 3, 2,
       6, 7, 4, 4, 3, 4, 3, 3, 3, 4,
       4, 2, 2, 2, 2, 4, 3, 4, 4, 2,
       3, 2, 3, 2, 3, 2, 3, 2, 2, 2,
       3, 4, 5, 6, 1, 1, 1, 2, 3, 1,
       0, 1, 0, 1, 1, 2, 1, 1, 1, 2,
       1, 1, 1, 1, 3, 1, 2, 2, 2, 3,
       0, 1, 0, 3, 2, 1, 3, 1, 2, 1,
       3, 5, 4, 1, 2, 1, 4, 3, 3, 1,
       3, 2, 1, 3, 0, 1, 1, 1, 1, 3,
       3, 3, 1, 0, 3, 6, 9, 0, 1, 1,
       0, 1, 1, 2, 0, 0, 0, 0, 0, 0,
       0, 0
};
/* YYDEFACT[STATE-NAME] -- Default rule to reduce with in state
   STATE-NUM when YYTABLE doesn't specify something else to do.  Zero
   means the default is an error.  */
static final short yydefact[] =
{
       0, 139, 211, 0, 0, 142, 9, 207, 207, 209,
      17, 211, 208, 208, 140, 140, 0, 208, 209, 207,
       0, 0, 0, 210, 208, 208, 0, 208, 206, 206,
      65, 0, 206, 206, 206, 206, 76, 0, 0, 0,
     208, 208, 208, 208, 208, 208, 208, 206, 208, 208,
     208, 0, 211, 206, 211, 209, 0, 211, 206, 206,
     206, 134, 135, 136, 0, 2, 210, 4, 150, 6,
       0, 143, 151, 8, 209, 209, 16, 0, 18, 20,
     208, 208, 23, 208, 208, 26, 141, 208, 208, 208,
      31, 33, 209, 210, 0, 0, 209, 0, 147, 146,
     208, 208, 53, 148, 208, 55, 208, 57, 209, 208,
      60, 62, 0, 66, 209, 209, 69, 71, 73, 200,
      75, 200, 144, 77, 78, 79, 0, 200, 0, 140,
      86, 140, 140, 89, 0, 209, 209, 209, 111, 112,
     114, 113, 206, 208, 99, 206, 206, 208, 208, 208,
     208, 208, 119, 208, 121, 123, 125, 0, 129, 128,
     127, 0, 208, 137, 1, 0, 0, 160, 0, 10,
       0, 13, 203, 0, 22, 24, 25, 27, 28, 29,
      30, 209, 0, 34, 0, 37, 38, 0, 0, 0,
       0, 46, 47, 48, 49, 51, 52, 54, 149, 56,
      58, 59, 61, 179, 0, 63, 0, 175, 64, 173,
       0, 0, 0, 169, 0, 192, 70, 72, 202, 201,
     197, 145, 80, 0, 83, 84, 85, 87, 88, 187,
      91, 92, 0, 188, 184, 182, 95, 96, 97, 0,
      98, 208, 0, 104, 106, 107, 108, 208, 208, 116,
     120, 0, 122, 124, 126, 130, 0, 138, 204, 0,
       0, 5, 152, 155, 161, 7, 209, 209, 209, 209,
      21, 32, 209, 209, 50, 39, 40, 41, 42, 43,
      44, 45, 0, 0, 0, 181, 174, 0, 0, 0,
      68, 0, 0, 198, 199, 0, 81, 184, 185, 186,
       0, 0, 102, 0, 103, 105, 109, 110, 115, 117,
     118, 131, 0, 0, 157, 158, 0, 156, 11, 12,
      14, 15, 35, 36, 178, 193, 180, 177, 162, 67,
     191, 170, 209, 0, 82, 183, 189, 190, 205, 132,
       0, 154, 159, 209, 172, 0, 193, 176, 0, 0,
     100, 170, 0, 164, 0, 165, 167, 171, 206, 170,
     101, 194, 163, 0, 168, 0, 166, 0, 196
};
/* YYDEFGOTO[NTERM-NUM]. */
static final short yydefgoto[] =
{
      -1, 64, 65, 166, 173, 207, 87, 72, 123, 103,
     104, 69, 73, 261, 262, 263, 265, 346, 354, 355,
     215, 205, 208, 209, 210, 234, 300, 235, 216, 344,
     118, 295, 220, 76, 313, 350, 111, 74, 82, 77,
     102, 67
};
/* YYPACT[STATE-NUM] -- Index in YYTABLE of the portion describing
   STATE-NUM.  */
static final short yypact[] =
{
     307, -163, -163, 22, 32, 51, -163, -163, -163, -163,
     108, -163, 60, 38, 110, 110, 22, -163, -163, -163,
     171, 173, 152, -163, 173, 173, 173, 173, -163, -163,
      22, 21, -163, -163, -163, -163, 22, 22, 22, 22,
    -163, -163, -163, -163, -163, -163, -163, 150, -163, -163,
    -163, 179, -163, -163, -163, -163, 22, -163, 63, -163,
    -163, -163, -163, 159, 169, -163, -163, 176, -163, -163,
      68, -163, -163, -163, 164, 182, -163, 191, -163, 200,
    -163, -163, -163, -163, -163, -163, -163, -163, -163, -163,
     202, -163, 195, -163, 185, 15, -163, 22, -163, -163,
    -163, -163, 199, -163, 173, -163, 173, -163, -163, -163,
    -163, 26, 28, -163, -163, -163, 33, 33, -163, -32,
    -163, 14, -163, 22, -163, -163, 22, -32, 158, 18,
    -163, 110, 110, -163, 77, -163, -163, -163, -163, -163,
    -163, -163, -163, -163, -163, -163, -163, -163, -163, -163,
    -163, 75, 221, -163, 224, 225, -163, 227, -163, -163,
    -163, 220, -163, -163, -163, 228, 34, 230, 91, -163,
     128, -163, -163, 34, -163, -163, -163, -163, -163, -163,
    -163, -163, 187, -163, 232, -163, -163, 22, 22, 157,
      49, -163, -163, -163, -163, -163, -163, -163, -163, -163,
    -163, -163, -163, -163, 139, -163, 57, -163, 28, -163,
      62, 236, 237, -163, 143, 144, -163, -163, -163, -163,
      10, -163, -163, 177, -163, -163, -163, -163, -163, -163,
    -163, -163, 36, -163, 19, 146, -163, -163, -163, 220,
    -163, -163, 220, 244, -163, -163, 167, -163, -163, -163,
    -163, 220, -163, -163, -163, 13, 220, -163, 248, 250,
       5, -163, 80, -163, -163, -163, -163, -163, -163, -163,
    -163, -163, -163, -163, -163, -163, -163, -163, -163, -163,
    -163, -163, 246, 22, 249, -163, -163, 22, 251, 201,
    -163, 220, 252, -163, -163, 42, 173, 20, -163, -163,
      36, 41, 144, 220, 144, -163, -163, -163, -163, -163,
     144, -163, 46, 34, -163, -163, 267, -163, -163, -163,
    -163, -163, -163, -163, -163, 160, 17, -163, 58, -163,
     144, -163, -163, 174, -163, 146, -163, -163, 144, -163,
     264, -163, -163, -163, -163, 30, 160, -163, 217, 269,
     253, 278, 275, -163, -35, 175, 144, -163, -163, 280,
    -163, -163, -163, 220, -163, 184, 175, 273, -163
};
/* YYPGOTO[NTERM-NUM].  */
static final short yypgoto[] =
{
    -163, -163, -163, -163, -163, 9, -8, -163, -163, -11,
     259, -163, -163, -162, -163, 24, -163, -41, -163, -75,
     -69, -163, -163, 81, 180, 61, -163, -5, 181, -49,
     266, -163, 172, -17, -163, -163, -29, 45, 59, -53,
     -38, 147
};
/* YYTABLE[YYPACT[STATE-NUM]].  What to do in state STATE-NUM.  If
   positive, shift that token.  If negative, reduce the rule which
   number is the opposite.  If zero, do what YYDEFACT says.
   If YYTABLE_NINF, syntax error.  */
static final short yytable[] =
{
     112, 91, 155, 116, 117, 119, 121, 88, 315, 66,
     100, 270, 68, 218, -74, 108, 109, -162, 134, -94,
     -93, 311, 362, 86, 153, 89, 1, 1, 165, 160,
     161, 162, 293, 1, 203, 70, 203, 258, 213, 113,
     115, 213, 225, 83, 229, 122, 124, 125, 126, 336,
     213, 191, 192, 75, 339, 184, 71, 169, 171, 218,
      84, 211, 212, 80, 92, 156, 158, 159, 1, 283,
    -180, 363, 85, 345, 287, 183, 90, 114, 247, 193,
     167, 219, 81, 105, 107, 229, 110, 353, 279, 280,
     281, 201, 255, 198, 266, 198, 1, 248, 332, 127,
     128, 129, 130, 131, 132, 133, 194, 135, 136, 137,
     316, 78, 292, 239, 345, 86, 241, 242, 236, 237,
     238, 226, 294, 227, 228, 298, 298, 219, -162, 299,
     299, 268, 221, 1, 204, 222, 204, 259, 260, 174,
     175, 214, 176, 177, 233, 340, 178, 179, 180, 337,
     -90, 341, 230, 231, 232, 101, 284, -180, 79, 195,
     196, 288, 163, 199, 271, 200, 285, -180, 202, 164,
     302, 285, 98, 304, 93, 99, -3, 267, 98, 269,
     168, 99, 310, 259, 260, 233, 94, 312, 138, 306,
     272, 273, 1, 277, 278, 172, 275, 276, 170, 152,
     -19, 154, 240, 197, 157, 181, 243, 244, 245, 246,
     249, 182, 251, 95, 96, 97, 185, 186, 187, 188,
     189, 256, 330, 190, 250, 224, 333, 252, 213, 253,
     254, 139, 257, 264, 338, 307, 274, 140, 282, 141,
     289, 290, 291, 292, 296, 301, 142, 305, -153, 318,
     319, 320, 321, 314, 324, 322, 323, 326, 329, 328,
     331, 143, 144, 145, 146, 147, 148, 149, 150, 151,
     342, 343, 351, 349, 358, 360, 356, 359, -133, 361,
    -195, 368, 364, 367, 106, 334, 317, 347, 366, 286,
     352, 206, 325, 297, 356, 335, 327, 357, 217, 223,
     303, 120, 0, 0, 0, 0, 308, 309, 0, 0,
       0, 0, 1, 0, 0, 348, 2, 3, 4, 0,
       5, 6, 7, 0, 8, 9, 10, 11, 12, 365,
      13, 14, 15, 16, 17, 18, 19, 20, 0, 0,
       0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
       0, 0, 21, 22, 23, 24, 25, 26, 27, 28,
      29, 30, 31, 0, 0, 32, 33, 34, 35, 36,
      37, 38, 39, 40, 0, 41, 42, 43, 44, 45,
      46, 47, 0, 0, 0, 48, 49, 50, 51, 0,
       0, 0, 0, 0, 0, 52, 0, 0, 53, 54,
      55, 56, 57, 58, 59, 60, 0, 61, 62, 63
};
static final short yycheck[] =
{
      29, 18, 55, 32, 33, 34, 35, 15, 3, 0,
      21, 173, 3, 45, 0, 26, 27, 0, 47, 0,
       0, 8, 57, 5, 53, 16, 5, 5, 66, 58,
      59, 60, 22, 5, 8, 3, 8, 3, 8, 30,
      31, 8, 24, 5, 8, 36, 37, 38, 39, 8,
       8, 36, 37, 8, 8, 93, 5, 74, 75, 45,
      22, 114, 115, 3, 19, 56, 3, 58, 5, 12,
      12, 106, 13, 56, 12, 92, 17, 56, 3, 96,
      12, 113, 22, 24, 25, 8, 27, 57, 39, 40,
      41, 108, 161, 104, 3, 106, 5, 22, 56, 40,
      41, 42, 43, 44, 45, 46, 97, 48, 49, 50,
     105, 3, 99, 142, 56, 5, 145, 146, 135, 136,
     137, 129, 112, 131, 132, 106, 106, 113, 111, 110,
     110, 3, 123, 5, 108, 126, 108, 103, 104, 80,
      81, 108, 83, 84, 108, 99, 87, 88, 89, 108,
       0, 313, 75, 76, 77, 3, 99, 99, 11, 100,
     101, 99, 3, 104, 181, 106, 109, 109, 109, 0,
     239, 109, 5, 242, 3, 8, 0, 168, 5, 170,
      16, 8, 251, 103, 104, 108, 15, 256, 9, 22,
       3, 182, 5, 36, 37, 4, 187, 188, 16, 52,
       0, 54, 143, 4, 57, 3, 147, 148, 149, 150,
     151, 16, 153, 42, 43, 44, 31, 32, 33, 34,
      35, 162, 291, 38, 3, 67, 295, 3, 8, 4,
       3, 52, 4, 3, 303, 246, 4, 58, 99, 60,
       4, 4, 99, 99, 67, 99, 67, 3, 0, 266,
     267, 268, 269, 3, 8, 272, 273, 8, 57, 8,
       8, 82, 83, 84, 85, 86, 87, 88, 89, 90,
       3, 111, 8, 99, 57, 22, 345, 8, 0, 4,
       0, 8, 107, 99, 25, 296, 262, 328, 363, 208,
     343, 111, 283, 232, 363, 300, 287, 346, 117, 127,
     241, 35, -1, -1, -1, -1, 247, 248, -1, -1,
      -1, -1, 5, -1, -1, 332, 9, 10, 11, -1,
      13, 14, 15, -1, 17, 18, 19, 20, 21, 358,
      23, 24, 25, 26, 27, 28, 29, 30, -1, -1,
      -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
      -1, -1, 45, 46, 47, 48, 49, 50, 51, 52,
      53, 54, 55, -1, -1, 58, 59, 60, 61, 62,
      63, 64, 65, 66, -1, 68, 69, 70, 71, 72,
      73, 74, -1, -1, -1, 78, 79, 80, 81, -1,
      -1, -1, -1, -1, -1, 88, -1, -1, 91, 92,
      93, 94, 95, 96, 97, 98, -1, 100, 101, 102
};
/* YYSTOS[STATE-NUM] -- The (internal number of the) accessing
   symbol of state STATE-NUM.  */
static final short yystos[] =
{
       0, 5, 9, 10, 11, 13, 14, 15, 17, 18,
      19, 20, 21, 23, 24, 25, 26, 27, 28, 29,
      30, 45, 46, 47, 48, 49, 50, 51, 52, 53,
      54, 55, 58, 59, 60, 61, 62, 63, 64, 65,
      66, 68, 69, 70, 71, 72, 73, 74, 78, 79,
      80, 81, 88, 91, 92, 93, 94, 95, 96, 97,
      98, 100, 101, 102, 115, 116, 119, 155, 119, 125,
       3, 5, 121, 126, 151, 151, 147, 153, 3, 155,
       3, 22, 152, 5, 22, 152, 5, 120, 120, 119,
     152, 147, 151, 3, 15, 42, 43, 44, 5, 8,
     123, 3, 154, 123, 124, 152, 124, 152, 123, 123,
     152, 150, 150, 119, 56, 119, 150, 150, 144, 150,
     144, 150, 119, 122, 119, 119, 119, 152, 152, 152,
     152, 152, 152, 152, 150, 152, 152, 152, 9, 52,
      58, 60, 67, 82, 83, 84, 85, 86, 87, 88,
      89, 90, 155, 150, 155, 153, 119, 155, 3, 119,
     150, 150, 150, 3, 0, 154, 117, 12, 16, 147,
      16, 147, 4, 118, 152, 152, 152, 152, 152, 152,
     152, 3, 16, 147, 154, 31, 32, 33, 34, 35,
      38, 36, 37, 147, 119, 152, 152, 4, 123, 152,
     152, 147, 152, 8, 108, 135, 138, 119, 136, 137,
     138, 153, 153, 8, 108, 134, 142, 142, 45, 113,
     146, 119, 119, 146, 67, 24, 120, 120, 120, 8,
      75, 76, 77, 108, 139, 141, 147, 147, 147, 150,
     152, 150, 150, 152, 152, 152, 152, 3, 22, 152,
       3, 152, 3, 4, 3, 134, 152, 4, 3, 103,
     104, 127, 128, 129, 3, 130, 3, 119, 3, 119,
     127, 147, 3, 119, 4, 119, 119, 36, 37, 39,
      40, 41, 99, 12, 99, 109, 137, 12, 99, 4,
       4, 99, 99, 22, 112, 145, 67, 139, 106, 110,
     140, 99, 134, 152, 134, 3, 22, 123, 152, 152,
     134, 8, 134, 148, 3, 3, 105, 129, 147, 147,
     147, 147, 147, 147, 8, 119, 8, 119, 8, 57,
     134, 8, 56, 134, 123, 141, 8, 108, 134, 8,
      99, 127, 3, 111, 143, 56, 131, 131, 147, 99,
     149, 8, 153, 57, 132, 133, 134, 143, 57, 8,
      22, 4, 57, 106, 107, 150, 133, 99, 8
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
  if (yytype < 114)
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
  if (yyn == -163)
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
      yytoken = ((yychar) >= 0 && (yychar) <= 356 ? yytranslate[yychar] : 2);
      do { if (yydebug != 0) { System.err.print ("Next token is" + " "); yysymprint (yytoken, yylval, yylloc); System.err.print (yyendl); } } while (false);
    }
  /* If the proper action on seeing token YYTOKEN is to reduce or to
     detect an error, take that action.  */
  yyn += yytoken;
  if (yyn < 0 || 409 < yyn || yycheck[yyn] != yytoken)
    do { pc = yydefault; continue Loop; } while (false);
  yyn = yytable[yyn];
  if (yyn <= 0)
    {
      if (yyn == 0 || yyn == -196)
 do { pc = yyerrlab; continue Loop; } while (false);
      yyn = -yyn;
      do { pc = yyreduce; continue Loop; } while (false);
    }
  if (yyn == 164)
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
// _line_ 61 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandRun ();
                  startHandler (); ;}
    break;
  case 4:
// _line_ 63 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = new CommandLineSpec (); ;}
    break;
  case 5:
// _line_ 64 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandRun (((CommandLineSpec)yyvsa[yyvsp+(-1)]));
                   startHandler (); ;}
    break;
  case 6:
// _line_ 67 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandAttach (((Integer)yyvsa[yyvsp+(0)]));
                  startHandler (); ;}
    break;
  case 7:
// _line_ 70 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandConnect (((String)yyvsa[yyvsp+(-2)]) + ":" + ((String)yyvsa[yyvsp+(0)]));
                  startHandler (); ;}
    break;
  case 8:
// _line_ 73 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandListen (((Integer)yyvsa[yyvsp+(0)]));
                  startHandler (); ;}
    break;
  case 9:
// _line_ 76 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandDetach (); ;}
    break;
  case 10:
// _line_ 78 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandPrint (((String)yyvsa[yyvsp+(0)]), evaluator.PRINT, ' ', false);
                  showPrompt = false; ;}
    break;
  case 11:
// _line_ 81 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandPrint (((String)yyvsa[yyvsp+(0)]), printDepth (((String)yyvsa[yyvsp+(-1)])), printFormat (((String)yyvsa[yyvsp+(-1)])),
                                          false);
                  showPrompt = false; ;}
    break;
  case 12:
// _line_ 85 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandPrint (((String)yyvsa[yyvsp+(0)]), ((Integer)yyvsa[yyvsp+(-1)]), ' ', false);
                  showPrompt = false; ;}
    break;
  case 13:
// _line_ 88 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandPrint (((String)yyvsa[yyvsp+(0)]), evaluator.EXAMINE, ' ', false);
                  showPrompt = false; ;}
    break;
  case 14:
// _line_ 91 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandPrint (((String)yyvsa[yyvsp+(0)]), printDepth (((String)yyvsa[yyvsp+(-1)])), printFormat (((String)yyvsa[yyvsp+(-1)])),
                                          false);
                  showPrompt = false; ;}
    break;
  case 15:
// _line_ 95 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandPrint (((String)yyvsa[yyvsp+(0)]), ((Integer)yyvsa[yyvsp+(-1)]), ' ', false);
                  showPrompt = false; ;}
    break;
  case 16:
// _line_ 98 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandPrint (((String)yyvsa[yyvsp+(0)]), evaluator.NO_PRINT, ' ', false);
                  showPrompt = false; ;}
    break;
  case 17:
// _line_ 101 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandSetClass (""); ;}
    break;
  case 18:
// _line_ 103 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandSetClass (((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 19:
// _line_ 105 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandSetArgs (new CommandLineSpec ()); ;}
    break;
  case 20:
// _line_ 106 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = new CommandLineSpec (); ;}
    break;
  case 21:
// _line_ 107 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandSetArgs (((CommandLineSpec)yyvsa[yyvsp+(-1)])); ;}
    break;
  case 22:
// _line_ 109 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandWhere (((String)yyvsa[yyvsp+(-1)]), false); ;}
    break;
  case 23:
// _line_ 111 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandWhere (null, false); ;}
    break;
  case 24:
// _line_ 113 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandWhereAll (false); ;}
    break;
  case 25:
// _line_ 115 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandWhere (((String)yyvsa[yyvsp+(-1)]), true); ;}
    break;
  case 26:
// _line_ 117 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandWhere (null, true); ;}
    break;
  case 27:
// _line_ 119 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandWhereAll (true); ;}
    break;
  case 28:
// _line_ 121 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandUp (((Integer)yyvsa[yyvsp+(-1)])); ;}
    break;
  case 29:
// _line_ 123 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandUp (-((Integer)yyvsa[yyvsp+(-1)])); ;}
    break;
  case 30:
// _line_ 125 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandFrame (((Integer)yyvsa[yyvsp+(-1)])); ;}
    break;
  case 31:
// _line_ 127 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandSave ();
                  showPrompt = false; ;}
    break;
  case 32:
// _line_ 130 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandSave (((String)yyvsa[yyvsp+(-1)]), ((String)yyvsa[yyvsp+(0)]));
                   showPrompt = false; ;}
    break;
  case 33:
// _line_ 133 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandPtype (((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 34:
// _line_ 135 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandPrint (((String)yyvsa[yyvsp+(0)]), evaluator.EXAMINE, ' ', true);
                  showPrompt = false; ;}
    break;
  case 35:
// _line_ 138 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandPrint (((String)yyvsa[yyvsp+(0)]), printDepth (((String)yyvsa[yyvsp+(-1)])),
                                          printFormat (((String)yyvsa[yyvsp+(-1)])), true);
                  showPrompt = false; ;}
    break;
  case 36:
// _line_ 142 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandPrint (((String)yyvsa[yyvsp+(0)]), ((Integer)yyvsa[yyvsp+(-1)]), ' ', true);
                  showPrompt = false; ;}
    break;
  case 37:
// _line_ 145 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandSet ("print", "compressed", 0); ;}
    break;
  case 38:
// _line_ 147 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandSet ("print", "pretty", 0); ;}
    break;
  case 39:
// _line_ 149 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandSet ("print", "elements", ((Integer)yyvsa[yyvsp+(0)])); ;}
    break;
  case 40:
// _line_ 151 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandSet ("print", "max-frames", ((Integer)yyvsa[yyvsp+(0)])); ;}
    break;
  case 41:
// _line_ 153 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandSet ("print", "return", 1); ;}
    break;
  case 42:
// _line_ 155 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandSet ("print", "return", 0); ;}
    break;
  case 43:
// _line_ 157 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandSet ("print", "prefix", 0); ;}
    break;
  case 44:
// _line_ 159 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandSet ("print", "prefix", 1); ;}
    break;
  case 45:
// _line_ 161 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandSet ("print", "prefix", 2); ;}
    break;
  case 46:
// _line_ 163 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandSet ("stdin", "on", 0); ;}
    break;
  case 47:
// _line_ 165 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandSet ("stdin", "off", 0); ;}
    break;
  case 48:
// _line_ 167 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandPrint (((String)yyvsa[yyvsp+(0)]), evaluator.PRINT, ' ', false); ;}
    break;
  case 49:
// _line_ 169 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandSet ("history", "save", ((Integer)yyvsa[yyvsp+(0)])); ;}
    break;
  case 50:
// _line_ 171 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandPrint (((String)yyvsa[yyvsp+(-2)]) + " " + ((String)yyvsa[yyvsp+(0)]),
                                          evaluator.PRINT, ' ', false); ;}
    break;
  case 51:
// _line_ 174 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandThread (((String)yyvsa[yyvsp+(-1)])); ;}
    break;
  case 52:
// _line_ 176 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandThreadGroup (((String)yyvsa[yyvsp+(-1)])); ;}
    break;
  case 53:
// _line_ 178 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandSuspend (); ;}
    break;
  case 54:
// _line_ 180 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandSuspend (); ;}
    break;
  case 55:
// _line_ 182 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandSuspend (); ;}
    break;
  case 56:
// _line_ 184 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandSuspend (((List<String>)yyvsa[yyvsp+(-1)])); ;}
    break;
  case 57:
// _line_ 186 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandResume (); ;}
    break;
  case 58:
// _line_ 188 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandResume (((List<String>)yyvsa[yyvsp+(-1)])); ;}
    break;
  case 59:
// _line_ 190 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandKill (((String)yyvsa[yyvsp+(-1)]), ((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 60:
// _line_ 192 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandInterrupt (); ;}
    break;
  case 61:
// _line_ 194 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandInterrupt (((String)yyvsa[yyvsp+(-1)])); ;}
    break;
  case 62:
// _line_ 196 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandBreak (); ;}
    break;
  case 63:
// _line_ 198 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandBreak (((BreakpointSpec)yyvsa[yyvsp+(0)])); ;}
    break;
  case 64:
// _line_ 200 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandClear (((List<BreakpointSpec>)yyvsa[yyvsp+(0)])); ;}
    break;
  case 65:
// _line_ 202 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandCommand (reader, false); ;}
    break;
  case 66:
// _line_ 204 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandCommand (((Integer)yyvsa[yyvsp+(0)]), reader, false); ;}
    break;
  case 67:
// _line_ 206 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandCond (((String)yyvsa[yyvsp+(-1)])); ;}
    break;
  case 68:
// _line_ 208 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandCond (((Integer)yyvsa[yyvsp+(-2)]), ((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 69:
// _line_ 210 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandCatch (); ;}
    break;
  case 70:
// _line_ 212 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandCatch (((EventRequestSpec)yyvsa[yyvsp+(0)])); ;}
    break;
  case 71:
// _line_ 214 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandPass (); ;}
    break;
  case 72:
// _line_ 216 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandPass (((EventRequestSpec)yyvsa[yyvsp+(0)])); ;}
    break;
  case 73:
// _line_ 218 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandWatch (((List<EventRequestSpec>)yyvsa[yyvsp+(0)])); ;}
    break;
  case 74:
// _line_ 220 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandUnwatch (); ;}
    break;
  case 75:
// _line_ 222 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandUnwatch (((List<EventRequestSpec>)yyvsa[yyvsp+(0)])); ;}
    break;
  case 76:
// _line_ 224 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandDelete (); ;}
    break;
  case 77:
// _line_ 226 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandDelete (((List<Integer>)yyvsa[yyvsp+(0)])); ;}
    break;
  case 78:
// _line_ 228 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandEnable (((Integer)yyvsa[yyvsp+(0)]), false); ;}
    break;
  case 79:
// _line_ 230 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandEnable (((Integer)yyvsa[yyvsp+(0)]), true); ;}
    break;
  case 80:
// _line_ 232 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandIgnore (((Integer)yyvsa[yyvsp+(-1)]), ((Integer)yyvsa[yyvsp+(0)])); ;}
    break;
  case 81:
// _line_ 234 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandTrace (((Integer)yyvsa[yyvsp+(-1)]), null); ;}
    break;
  case 82:
// _line_ 236 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandTrace (((Integer)yyvsa[yyvsp+(-2)]), ((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 83:
// _line_ 238 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandUntrace (); ;}
    break;
  case 84:
// _line_ 240 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandStep (StepRequest.STEP_LINE,
                                         StepRequest.STEP_OUT, 1); ;}
    break;
  case 85:
// _line_ 243 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandStep (StepRequest.STEP_LINE,
                                         StepRequest.STEP_INTO, ((Integer)yyvsa[yyvsp+(0)])); ;}
    break;
  case 86:
// _line_ 246 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandStep (StepRequest.STEP_LINE,
                                         StepRequest.STEP_OUT, 1); ;}
    break;
  case 87:
// _line_ 249 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandStep (StepRequest.STEP_LINE,
                                         StepRequest.STEP_OVER, ((Integer)yyvsa[yyvsp+(0)])); ;}
    break;
  case 88:
// _line_ 252 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandStep (StepRequest.STEP_MIN,
                                         StepRequest.STEP_INTO, ((Integer)yyvsa[yyvsp+(0)])); ;}
    break;
  case 89:
// _line_ 255 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandCont (); ;}
    break;
  case 90:
// _line_ 257 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandExclude (); ;}
    break;
  case 91:
// _line_ 259 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandExcludeClear (); ;}
    break;
  case 92:
// _line_ 261 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandExcludeReset (); ;}
    break;
  case 93:
// _line_ 263 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandExcludeAdd (((List<String>)yyvsa[yyvsp+(0)])); ;}
    break;
  case 94:
// _line_ 265 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandExcludeSet (((List<String>)yyvsa[yyvsp+(0)])); ;}
    break;
  case 95:
// _line_ 267 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandLock (((String)yyvsa[yyvsp+(0)]));
                  showPrompt = false; ;}
    break;
  case 96:
// _line_ 270 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandEnableGC (((String)yyvsa[yyvsp+(0)]), false);
                  showPrompt = false; ;}
    break;
  case 97:
// _line_ 273 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandEnableGC (((String)yyvsa[yyvsp+(0)]), true);
                  showPrompt = false; ;}
    break;
  case 98:
// _line_ 276 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandLocals (); ;}
    break;
  case 99:
// _line_ 278 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandClasses (); ;}
    break;
  case 100:
// _line_ 280 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandClass (((String)yyvsa[yyvsp+(-1)]), false); ;}
    break;
  case 101:
// _line_ 282 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandClass (((String)yyvsa[yyvsp+(-2)]), true); ;}
    break;
  case 102:
// _line_ 284 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandMethods (((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 103:
// _line_ 286 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandFields (((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 104:
// _line_ 288 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandThreads (); ;}
    break;
  case 105:
// _line_ 290 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandThreads (((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 106:
// _line_ 292 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandThreadGroups (); ;}
    break;
  case 107:
// _line_ 294 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandClasspathInfo (); ;}
    break;
  case 108:
// _line_ 296 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandThreadlocks (); ;}
    break;
  case 109:
// _line_ 298 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandThreadlocksAll (); ;}
    break;
  case 110:
// _line_ 300 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandThreadlocks (((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 111:
// _line_ 302 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandInfoRun (); ;}
    break;
  case 112:
// _line_ 304 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.listEventSpecs (BreakpointSpec.EXMPL); ;}
    break;
  case 113:
// _line_ 306 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.listEventSpecs (WatchpointSpec.EXMPL); ;}
    break;
  case 114:
// _line_ 308 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.listEventSpecs (ExceptionSpec.EXMPL); ;}
    break;
  case 115:
// _line_ 310 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandWhere (((String)yyvsa[yyvsp+(-1)]), false); ;}
    break;
  case 116:
// _line_ 312 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandWhere (null, false); ;}
    break;
  case 117:
// _line_ 314 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandWhereAll (false); ;}
    break;
  case 118:
// _line_ 316 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandLoadclass (((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 119:
// _line_ 318 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandClasspath (); ;}
    break;
  case 120:
// _line_ 320 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandClasspath (((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 121:
// _line_ 322 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandUse (); ;}
    break;
  case 122:
// _line_ 324 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandUse (((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 123:
// _line_ 326 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandMonitor (); ;}
    break;
  case 124:
// _line_ 328 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandMonitor (((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 125:
// _line_ 330 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandUnmonitor (((Integer)yyvsa[yyvsp+(0)])); ;}
    break;
  case 126:
// _line_ 332 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandRead (((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 127:
// _line_ 334 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandList (-1, null); ;}
    break;
  case 128:
// _line_ 336 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandList (((Integer)yyvsa[yyvsp+(0)]), null); ;}
    break;
  case 129:
// _line_ 338 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandList (-1, ((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 130:
// _line_ 340 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandLines (((String)yyvsa[yyvsp+(0)]), null); ;}
    break;
  case 131:
// _line_ 342 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandLines (((String)yyvsa[yyvsp+(-1)]), ((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 132:
// _line_ 344 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandBytecodes (((String)yyvsa[yyvsp+(-1)]), ((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 133:
// _line_ 346 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandBytecodes (((String)yyvsa[yyvsp+(-2)]), ((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 134:
// _line_ 348 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandVersion (GJDB.progname, Version.value); ;}
    break;
  case 135:
// _line_ 350 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandQuit (); ;}
    break;
  case 136:
// _line_ 352 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { GJDB.help (); ;}
    break;
  case 137:
// _line_ 354 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { GJDB.help (((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 138:
// _line_ 356 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.commandRepeat (((Integer)yyvsa[yyvsp+(-2)]), ((String)yyvsa[yyvsp+(0)]), reader); ;}
    break;
  case 139:
// _line_ 360 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = convertInt (((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 140:
// _line_ 363 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = 1; ;}
    break;
  case 141:
// _line_ 364 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = convertInt (((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 142:
// _line_ 368 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = -1; ;}
    break;
  case 143:
// _line_ 369 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = convertInt (((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 144:
// _line_ 373 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { ArrayList<Integer> L = new ArrayList<Integer> ();
                          yyval = L; L.add (((Integer)yyvsa[yyvsp+(0)])); ;}
    break;
  case 145:
// _line_ 376 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = ((List<Integer>)yyvsa[yyvsp+(-1)]); ((List<Integer>)yyvsa[yyvsp+(-1)]).add (((Integer)yyvsa[yyvsp+(0)])); ;}
    break;
  case 148:
// _line_ 385 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { ArrayList<String> v = new ArrayList<String> ();
                          v.add (((String)yyvsa[yyvsp+(0)]));
                          yyval = v; ;}
    break;
  case 149:
// _line_ 389 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = ((List<String>)yyvsa[yyvsp+(-1)]); ((List<String>)yyvsa[yyvsp+(-1)]).add (((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 153:
// _line_ 403 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { CommandLineSpec spec = ((CommandLineSpec)yyvsa[yyvsp+(-1)]);
                          spec.cmdArgs += " " + shellConvert (((String)yyvsa[yyvsp+(0)]));
                          yyval = spec; ;}
    break;
  case 154:
// _line_ 407 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { CommandLineSpec spec = ((CommandLineSpec)yyvsa[yyvsp+(-1)]);
                          spec.cmdArgs = " " + shellConvert (((String)yyvsa[yyvsp+(-2)]))
                                         + spec.cmdArgs;
                          yyval = spec; ;}
    break;
  case 155:
// _line_ 415 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = ((CommandLineSpec)yyvsa[yyvsp+(-1)]); ;}
    break;
  case 156:
// _line_ 416 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = (yyvsa[yyvsp+(-1)]); ;}
    break;
  case 157:
// _line_ 422 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { CommandLineSpec spec = ((CommandLineSpec)yyvsa[yyvsp+(-2)]);
                          if (spec.inFile != null)
                              throw ERROR ("Ambiguous input redirection");
                          spec.inFile = shellConvert (((String)yyvsa[yyvsp+(0)]));
                        ;}
    break;
  case 158:
// _line_ 428 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { CommandLineSpec spec = ((CommandLineSpec)yyvsa[yyvsp+(-2)]);
                          if (spec.outFile != null)
                              throw ERROR ("Ambiguous output redirection");
                          spec.outFile = shellConvert (((String)yyvsa[yyvsp+(0)]));
                        ;}
    break;
  case 159:
// _line_ 434 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { CommandLineSpec spec = ((CommandLineSpec)yyvsa[yyvsp+(-3)]);
                          if (spec.outFile != null)
                              throw ERROR ("Ambiguous output redirection");
                          spec.outFile = spec.errFile = shellConvert (((String)yyvsa[yyvsp+(0)]));
                        ;}
    break;
  case 160:
// _line_ 442 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = ""; ;}
    break;
  case 162:
// _line_ 447 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = null; ;}
    break;
  case 163:
// _line_ 449 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = ((List<String>)yyvsa[yyvsp+(-1)]); ;}
    break;
  case 164:
// _line_ 450 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = Collections.EMPTY_LIST; ;}
    break;
  case 165:
// _line_ 454 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { ArrayList<String> L = new ArrayList<String> ();
                          yyval = L;
                          L.add (((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 166:
// _line_ 458 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = ((List<String>)yyvsa[yyvsp+(-2)]); ((List<String>)yyvsa[yyvsp+(-2)]).add (((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 168:
// _line_ 463 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = ((String)yyvsa[yyvsp+(-1)]) + "[]"; ;}
    break;
  case 170:
// _line_ 468 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = ((String)yyvsa[yyvsp+(-2)]) + "." + ((String)yyvsa[yyvsp+(0)]); ;}
    break;
  case 171:
// _line_ 473 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = createBreakpointSpec (((String)yyvsa[yyvsp+(-4)]), ((String)yyvsa[yyvsp+(-2)]), ((List<String>)yyvsa[yyvsp+(-1)]), ((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 172:
// _line_ 475 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = createBreakpointSpec (((String)yyvsa[yyvsp+(-3)]), ((Integer)yyvsa[yyvsp+(-1)]), ((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 173:
// _line_ 480 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { ArrayList<Object> L = new ArrayList<Object> ();
               yyval = L;
               L.add (((BreakpointSpec)yyvsa[yyvsp+(0)])); ;}
    break;
  case 174:
// _line_ 484 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = ((List<BreakpointSpec>)yyvsa[yyvsp+(-1)]); ((List<BreakpointSpec>)yyvsa[yyvsp+(-1)]).add (((BreakpointSpec)yyvsa[yyvsp+(0)])); ;}
    break;
  case 175:
// _line_ 488 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = createBreakpointSpec (((Integer)yyvsa[yyvsp+(0)])); ;}
    break;
  case 176:
// _line_ 490 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = createBreakpointSpec (((String)yyvsa[yyvsp+(-3)]), ((String)yyvsa[yyvsp+(-1)]), ((List<String>)yyvsa[yyvsp+(0)]), null); ;}
    break;
  case 177:
// _line_ 492 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = createBreakpointSpec (((String)yyvsa[yyvsp+(-2)]), ((Integer)yyvsa[yyvsp+(0)]), null); ;}
    break;
  case 178:
// _line_ 496 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = "*." + ((String)yyvsa[yyvsp+(0)]); ;}
    break;
  case 180:
// _line_ 499 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { if (((String)yyvsa[yyvsp+(-2)]).endsWith (".0"))
                                      throw ERROR ("Bad class specification");
                                  yyval = ((String)yyvsa[yyvsp+(-2)]) + "." + ((String)yyvsa[yyvsp+(0)]); ;}
    break;
  case 181:
// _line_ 503 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { if (((String)yyvsa[yyvsp+(-1)]).endsWith (".0"))
                                      throw ERROR ("Bad class specification");
                                  yyval = ((String)yyvsa[yyvsp+(-1)]) + ".0"; ;}
    break;
  case 182:
// _line_ 510 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { ArrayList<String> L = new ArrayList<String> ();
                          L.add (((String)yyvsa[yyvsp+(0)]));
                          yyval = L;
                        ;}
    break;
  case 183:
// _line_ 515 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = ((List<String>)yyvsa[yyvsp+(-2)]); ((List<String>)yyvsa[yyvsp+(-2)]).add (((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 188:
// _line_ 526 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = "*"; ;}
    break;
  case 189:
// _line_ 527 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = ((String)yyvsa[yyvsp+(-2)]) + "." + ((String)yyvsa[yyvsp+(0)]); ;}
    break;
  case 190:
// _line_ 528 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = ((String)yyvsa[yyvsp+(-2)]) + ".*"; ;}
    break;
  case 191:
// _line_ 532 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = createExceptionSpec ("*." + ((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 192:
// _line_ 533 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = createExceptionSpec (((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 193:
// _line_ 537 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = null; ;}
    break;
  case 194:
// _line_ 539 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = ((String)yyvsa[yyvsp+(0)]); ;}
    break;
  case 195:
// _line_ 544 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = createWatchSpec (((Integer)yyvsa[yyvsp+(-4)]), ((String)yyvsa[yyvsp+(-3)]), ((String)yyvsa[yyvsp+(-2)]), null, ((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 196:
// _line_ 547 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = createWatchSpec (((Integer)yyvsa[yyvsp+(-7)]), ((String)yyvsa[yyvsp+(-6)]), null, ((String)yyvsa[yyvsp+(-4)]), ((String)yyvsa[yyvsp+(0)])); ;}
    break;
  case 197:
// _line_ 551 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = ""; ;}
    break;
  case 198:
// _line_ 552 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = "all"; ;}
    break;
  case 199:
// _line_ 553 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = "access"; ;}
    break;
  case 200:
// _line_ 557 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = EventRequest.SUSPEND_ALL; ;}
    break;
  case 201:
// _line_ 558 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = EventRequest.SUSPEND_NONE; ;}
    break;
  case 202:
// _line_ 559 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = EventRequest.SUSPEND_EVENT_THREAD; ;}
    break;
  case 203:
// _line_ 564 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = ((String)yyvsa[yyvsp+(0)]); ;}
    break;
  case 204:
// _line_ 568 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { yyval = (yyvsa[yyvsp+(-1)]); ;}
    break;
  case 205:
// _line_ 573 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { lexer.toDefaultMode (); ;}
    break;
  case 206:
// _line_ 576 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { lexer.toBreakMode (); ;}
    break;
  case 207:
// _line_ 580 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { lexer.toPrintMode (); ;}
    break;
  case 208:
// _line_ 584 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { evaluator.checkConnect (); ;}
    break;
  case 209:
// _line_ 588 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { lexer.toBalancedCollectMode (); ;}
    break;
  case 210:
// _line_ 592 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { lexer.toCollectMode (); ;}
    break;
  case 211:
// _line_ 596 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
    { lexer.toRunArgsMode (); ;}
    break;
    }
/* Line 813 of yacc.java.  */
// _line_ 2160 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.java"
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
  yystate = yypgoto[yyn - 114] + yyssa[yyssp];
  if (0 <= yystate && yystate <= 409 && yycheck[yystate] == yyssa[yyssp])
    yystate = yytable[yystate];
  else
    yystate = yydefgoto[yyn - 114];
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
      if (yyn != -163)
 {
   yyn += 1;
   if (0 <= yyn && yyn <= 409 && yycheck[yyn] == 1)
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
  if (yyn == 164)
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
// _line_ 599 "/home/cs/hilfingr/src/gjdb/src/ucb/gjdb/CommandParser.y"
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
