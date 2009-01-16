/* A Bison parser, made by GNU Bison 2.3j5.  */

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

   import java.util.Stack;
   import java.util.Collections;
   import java.util.Stack;
   import java.util.List;
   import java.util.ArrayList;
   import java.util.HashMap;

   import static ucb.gjdb.CommandException.ERROR;

   class ExpressionParser
{

/* Tokens.  */
   public static final int
     BOOLEAN = 258,
     BYTE = 259,
     CHAR = 260,
     DOUBLE = 261,
     FLOAT = 262,
     INT = 263,
     LONG = 264,
     SHORT = 265,
     FLOATLIT = 266,
     INTLIT = 267,
     CHARLIT = 268,
     STRINGLIT = 269,
     IDENT = 270,
     INTERNALVAR = 271,
     POSTFIX = 295;

/* Copy the first part of user declarations.  */
// _line_ 62 "/home/cs/hilfingr/src/gjdb-5x/src/ucb/gjdb/ExpressionParser.y"
/* End first part of user declarations.  */





/* TEMPORARY CHANGE: FIXME */





static int YYLTYPE_INIT;

/* Enabling traces.  */




/* Enabling verbose error messages.  */







/* Copy the second part of user declarations.  */


/* Line 221 of yacc.java.  */
// _line_ 138 "/home/cs/hilfingr/src/gjdb-5x/src/ucb/gjdb/ExpressionParser.java"



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
       2, 2, 2, 52, 2, 2, 2, 50, 35, 2,
      58, 57, 48, 46, 70, 47, 56, 49, 2, 2,
       2, 2, 2, 2, 2, 2, 2, 2, 30, 2,
      39, 17, 41, 29, 2, 2, 2, 2, 2, 2,
       2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
       2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
       2, 64, 2, 65, 34, 2, 2, 2, 2, 2,
       2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
       2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
       2, 2, 2, 68, 33, 69, 51, 2, 2, 2,
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
       5, 6, 7, 8, 9, 10, 11, 12, 13, 14,
      15, 16, 18, 19, 20, 21, 22, 23, 24, 25,
      26, 27, 28, 31, 32, 36, 37, 38, 40, 42,
      43, 44, 45, 53, 54, 55, 59, 60, 61, 62,
      63, 66, 67
};


/* YYPRHS[YYN] -- Index of the first RHS symbol of rule number YYN in
   YYRHS.  */
static final char yyprhs[] =
{
       0, 0, 3, 5, 7, 9, 11, 15, 19, 23,
      27, 31, 35, 39, 43, 47, 51, 55, 59, 63,
      67, 71, 75, 79, 83, 87, 91, 95, 99, 103,
     107, 111, 115, 119, 123, 127, 131, 132, 137, 138,
     143, 144, 145, 153, 155, 157, 159, 161, 163, 167,
     169, 173, 175, 177, 179, 181, 183, 187, 189, 192,
     195, 200, 204, 209, 212, 217, 221, 223, 226, 229,
     231, 234, 237, 240, 243, 248, 254, 260, 265, 268,
     270, 272, 274, 276, 278, 280, 282, 284, 286, 290,
     291, 297, 301, 305, 306, 312, 314, 317, 321, 326,
     329, 333, 337, 342, 344, 345, 348, 352, 353, 358,
     362, 365, 367, 371, 374, 376
};

/* YYRHS -- A `-1'-separated list of the rules' RHS. */
static final short yyrhs[] =
{
      72, 0, -1, 73, -1, 81, -1, 83, -1, 86,
      -1, 73, 48, 73, -1, 73, 49, 73, -1, 73,
      50, 73, -1, 73, 46, 73, -1, 73, 47, 73,
      -1, 73, 43, 73, -1, 73, 44, 73, -1, 73,
      45, 73, -1, 73, 39, 73, -1, 73, 41, 73,
      -1, 73, 38, 73, -1, 73, 40, 73, -1, 73,
      36, 73, -1, 73, 37, 73, -1, 73, 35, 73,
      -1, 73, 33, 73, -1, 73, 34, 73, -1, 73,
      17, 73, -1, 73, 20, 73, -1, 73, 21, 73,
      -1, 73, 22, 73, -1, 73, 18, 73, -1, 73,
      19, 73, -1, 73, 25, 73, -1, 73, 23, 73,
      -1, 73, 24, 73, -1, 73, 26, 73, -1, 73,
      28, 73, -1, 73, 27, 73, -1, 73, 42, 97,
      -1, -1, 73, 32, 74, 73, -1, -1, 73, 31,
      75, 73, -1, -1, -1, 73, 29, 76, 73, 30,
      77, 73, -1, 79, -1, 11, -1, 12, -1, 13,
      -1, 14, -1, 58, 73, 57, -1, 59, -1, 60,
      56, 15, -1, 61, -1, 62, -1, 63, -1, 16,
      -1, 15, -1, 79, 56, 15, -1, 78, -1, 80,
      53, -1, 80, 54, -1, 80, 64, 73, 65, -1,
      80, 56, 15, -1, 80, 56, 15, 95, -1, 15,
      95, -1, 79, 56, 15, 95, -1, 58, 79, 57,
      -1, 82, -1, 46, 82, -1, 47, 82, -1, 80,
      -1, 53, 80, -1, 54, 80, -1, 51, 81, -1,
      52, 81, -1, 58, 85, 57, 81, -1, 58, 85,
      84, 57, 81, -1, 58, 79, 84, 57, 81, -1,
      58, 79, 57, 82, -1, 84, 66, -1, 66, -1,
       8, -1, 9, -1, 5, -1, 10, -1, 4, -1,
       3, -1, 7, -1, 6, -1, 67, 85, 89, -1,
      -1, 67, 85, 84, 87, 91, -1, 67, 79, 95,
      -1, 67, 79, 89, -1, -1, 67, 79, 84, 88,
      91, -1, 90, -1, 89, 66, -1, 64, 73, 65,
      -1, 90, 64, 73, 65, -1, 68, 69, -1, 68,
      70, 69, -1, 68, 92, 69, -1, 68, 92, 70,
      69, -1, 73, -1, -1, 93, 91, -1, 92, 70,
      73, -1, -1, 92, 70, 94, 91, -1, 58, 96,
      57, -1, 58, 57, -1, 73, -1, 96, 70, 73,
      -1, 85, 84, -1, 79, -1, 79, 84, -1
};

/* YYRLINE[YYN] -- source line where rule number YYN was defined.  */
static final char yyrline[] =
{
       0, 80, 80, 83, 84, 85, 86, 87, 88, 89,
      90, 91, 92, 93, 94, 95, 96, 97, 98, 99,
     100, 101, 102, 103, 104, 105, 106, 107, 108, 109,
     110, 111, 112, 113, 114, 115, 123, 123, 143, 143,
     163, 172, 163, 184, 187, 189, 191, 193, 195, 196,
     199, 204, 206, 208, 214, 224, 225, 229, 230, 236,
     242, 249, 252, 259, 270, 278, 284, 285, 286, 290,
     291, 292, 293, 294, 298, 307, 309, 310, 314, 315,
     319, 320, 321, 322, 323, 324, 325, 326, 330, 335,
     334, 338, 342, 347, 346, 353, 354, 361, 368, 377,
     378, 379, 380, 385, 386, 386, 388, 389, 389, 394,
     395, 399, 406, 414, 415, 416
};


static final int YY_NUM_TERMINALS = 71;

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
  "$end", "error", "$undefined", "\"boolean\"", "\"byte\"", "\"char\"",
  "\"double\"", "\"float\"", "\"int\"", "\"long\"", "\"short\"",
  "FLOATLIT", "INTLIT", "CHARLIT", "STRINGLIT", "IDENT", "INTERNALVAR",
  "'='", "\"+=\"", "\"-=\"", "\"*=\"", "\"/=\"", "\"%=\"", "\">>=\"",
  "\">>>=\"", "\"<<=\"", "\"&=\"", "\"|=\"", "\"^=\"", "'?'", "':'",
  "\"||\"", "\"&&\"", "'|'", "'^'", "'&'", "\"==\"", "\"!=\"", "\"<=\"",
  "'<'", "\">=\"", "'>'", "\"instanceof\"", "\"<<\"", "\">>\"", "\">>>\"",
  "'+'", "'-'", "'*'", "'/'", "'%'", "'~'", "'!'", "\"++\"", "\"--\"",
  "POSTFIX", "'.'", "')'", "'('", "\"this\"", "\"super\"", "\"true\"",
  "\"false\"", "\"null\"", "'['", "']'", "\"[]\"", "\"new\"", "'{'", "'}'",
  "','", "$accept", "start", "expr", "@1", "@2", "@3", "@4", "primary",
  "name", "postfix", "unary", "unary_no_pm", "cast", "dims",
  "primitive_type", "create", "@5", "@6", "dimensions",
  "dimensions_prefix", "array_initializer", "array_items", "@7", "@8",
  "params", "expr_list", "reference_type", 0
};

/* YYTOKNUM[YYLEX-NUM] -- Internal token number corresponding to
   token YYLEX-NUM.  */
static final int[] yytoknum =
{
       0, 256, 257, 258, 259, 260, 261, 262, 263, 264,
     265, 266, 267, 268, 269, 270, 271, 61, 272, 273,
     274, 275, 276, 277, 278, 279, 280, 281, 282, 63,
      58, 283, 284, 124, 94, 38, 285, 286, 287, 60,
     288, 62, 289, 290, 291, 292, 43, 45, 42, 47,
      37, 126, 33, 293, 294, 295, 46, 41, 40, 296,
     297, 298, 299, 300, 91, 93, 301, 302, 123, 125,
      44
};

/* YYR1[YYN] -- Symbol number of symbol that rule YYN derives.  */
static final short yyr1[] =
{
       0, 71, 72, 73, 73, 73, 73, 73, 73, 73,
      73, 73, 73, 73, 73, 73, 73, 73, 73, 73,
      73, 73, 73, 73, 73, 73, 73, 73, 73, 73,
      73, 73, 73, 73, 73, 73, 74, 73, 75, 73,
      76, 77, 73, 78, 78, 78, 78, 78, 78, 78,
      78, 78, 78, 78, 78, 79, 79, 80, 80, 80,
      80, 80, 80, 80, 80, 80, 81, 81, 81, 82,
      82, 82, 82, 82, 83, 83, 83, 83, 84, 84,
      85, 85, 85, 85, 85, 85, 85, 85, 86, 87,
      86, 86, 86, 88, 86, 89, 89, 90, 90, 91,
      91, 91, 91, 92, 93, 92, 92, 94, 92, 95,
      95, 96, 96, 97, 97, 97
};

/* YYR2[YYN] -- Number of symbols composing right hand side of rule YYN.  */
static final short yyr2[] =
{
       0, 2, 1, 1, 1, 1, 3, 3, 3, 3,
       3, 3, 3, 3, 3, 3, 3, 3, 3, 3,
       3, 3, 3, 3, 3, 3, 3, 3, 3, 3,
       3, 3, 3, 3, 3, 3, 0, 4, 0, 4,
       0, 0, 7, 1, 1, 1, 1, 1, 3, 1,
       3, 1, 1, 1, 1, 1, 3, 1, 2, 2,
       4, 3, 4, 2, 4, 3, 1, 2, 2, 1,
       2, 2, 2, 2, 4, 5, 5, 4, 2, 1,
       1, 1, 1, 1, 1, 1, 1, 1, 3, 0,
       5, 3, 3, 0, 5, 1, 2, 3, 4, 2,
       3, 3, 4, 1, 0, 2, 3, 0, 4, 3,
       2, 1, 3, 2, 1, 2
};

/* YYDEFACT[STATE-NAME] -- Default rule to reduce with in state
   STATE-NUM when YYTABLE doesn't specify something else to do.  Zero
   means the default is an error.  */
static final short yydefact[] =
{
       0, 44, 45, 46, 47, 55, 54, 0, 0, 0,
       0, 0, 0, 0, 49, 0, 51, 52, 53, 0,
       0, 2, 57, 43, 69, 3, 66, 4, 5, 0,
      63, 0, 67, 68, 72, 73, 70, 71, 85, 84,
      82, 87, 86, 80, 81, 83, 0, 43, 0, 0,
      55, 0, 0, 1, 0, 0, 0, 0, 0, 0,
       0, 0, 0, 0, 0, 0, 40, 38, 36, 0,
       0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
       0, 0, 0, 0, 0, 0, 0, 0, 58, 59,
       0, 0, 110, 111, 0, 43, 48, 65, 79, 0,
       0, 0, 50, 0, 0, 93, 92, 95, 91, 89,
      88, 23, 27, 28, 24, 25, 26, 30, 31, 29,
      32, 34, 33, 0, 0, 0, 21, 22, 20, 18,
      19, 16, 14, 17, 15, 114, 0, 35, 11, 12,
      13, 9, 10, 6, 7, 8, 56, 61, 0, 109,
       0, 65, 77, 0, 78, 74, 0, 56, 0, 0,
      96, 0, 0, 0, 39, 37, 115, 113, 64, 62,
      60, 112, 76, 75, 97, 104, 94, 0, 90, 41,
      99, 0, 103, 0, 0, 98, 0, 100, 101, 107,
     105, 42, 102, 106, 0, 108
};

/* YYDEFGOTO[NTERM-NUM]. */
static final short yydefgoto[] =
{
      -1, 20, 46, 125, 124, 123, 186, 22, 23, 24,
      25, 26, 27, 99, 48, 28, 162, 159, 106, 107,
     176, 183, 184, 194, 30, 94, 137
};

/* YYPACT[STATE-NUM] -- Index in YYTABLE of the portion describing
   STATE-NUM.  */

static final short yypact[] =
{
     267, -154, -154, -154, -154, -42, -154, 337, 337, 324,
     324, 403, 403, 105, -154, -46, -154, -154, -154, 29,
      18, 598, -154, -32, -39, -154, -154, -154, -154, 249,
    -154, 267, -154, -154, -154, -154, -39, -39, -154, -154,
    -154, -154, -154, -154, -154, -154, 523, -36, 31, 27,
    -154, -13, -14, -154, 267, 267, 267, 267, 267, 267,
     267, 267, 267, 267, 267, 267, -154, -154, -154, 267,
     267, 267, 267, 267, 267, 267, 267, 267, 29, 267,
     267, 267, 267, 267, 267, 267, 267, 34, -154, -154,
      63, 267, -154, 598, -51, -30, -154, 350, -154, 36,
     324, 89, -154, 85, 267, 35, 37, 41, -154, 35,
      37, 620, 620, 620, 620, 620, 620, 620, 620, 620,
     620, 620, 620, 267, 267, 267, 675, 691, 706, 719,
     719, 147, 147, 147, 147, -43, 40, -154, 220, 220,
     220, -2, -2, -154, -154, -154, -42, -42, 404, -154,
     267, -154, -154, 324, -154, -154, 324, -154, 453, 39,
    -154, 267, 39, 564, 94, 658, 35, 35, -154, -154,
    -154, 598, -154, -154, -154, 165, -154, 488, -154, -154,
    -154, 53, 598, 20, 39, -154, 267, -154, -154, 190,
    -154, 640, -154, 598, 39, -154
};

/* YYPGOTO[NTERM-NUM].  */
static final short yypgoto[] =
{
    -154, -154, 0, -154, -154, -154, -154, -154, 9, 56,
      -8, -3, -154, -40, -12, -154, -154, -154, 95, -154,
    -153, -154, -154, -154, -48, -154, -154
};

/* YYTABLE[YYPACT[STATE-NUM]].  What to do in state STATE-NUM.  If
   positive, shift that token.  If negative, reduce the rule which
   number is the opposite.  If zero, do what YYDEFACT says.
   If YYTABLE_NINF, syntax error.  */

static final short yytable[] =
{
      21, 34, 35, 108, 32, 33, 149, 52, 101, 178,
      49, 105, 109, 103, 88, 89, 29, 90, 53, 150,
      87, 97, 47, 98, 87, 91, 87, 151, 51, 93,
      98, 190, 38, 39, 40, 41, 42, 43, 44, 45,
      95, 195, 102, 103, 50, 29, 84, 85, 86, 146,
     104, 104, 98, 98, 111, 112, 113, 114, 115, 116,
     117, 118, 119, 120, 121, 122, 136, 36, 37, 126,
     127, 128, 129, 130, 131, 132, 133, 134, 147, 138,
     139, 140, 141, 142, 143, 144, 145, 135, 100, 188,
     189, 148, 155, 153, 152, 166, 167, 98, 168, 169,
     157, 154, 154, 160, 158, 161, 98, 175, 38, 39,
      40, 41, 42, 43, 44, 45, 1, 2, 3, 4,
       5, 6, 187, 163, 164, 165, 68, 69, 70, 71,
      72, 73, 74, 75, 76, 77, 78, 79, 80, 81,
      82, 83, 84, 85, 86, 172, 156, 110, 173, 0,
     171, 7, 8, 0, 0, 154, 9, 10, 11, 12,
       0, 177, 0, 13, 14, 15, 16, 17, 18, 0,
       0, 0, 19, 0, 0, 182, 1, 2, 3, 4,
       5, 6, 0, 0, 0, 0, 191, 0, 0, 193,
      79, 80, 81, 82, 83, 84, 85, 86, 0, 0,
       0, 1, 2, 3, 4, 5, 6, 0, 0, 0,
       0, 7, 8, 0, 0, 0, 9, 10, 11, 12,
       0, 0, 0, 13, 14, 15, 16, 17, 18, 0,
       0, 0, 19, 0, 180, 181, 7, 8, 0, 0,
       0, 9, 10, 11, 12, 0, 0, 0, 13, 14,
      15, 16, 17, 18, 0, 0, 0, 19, 0, 192,
       1, 2, 3, 4, 5, 6, 82, 83, 84, 85,
      86, 0, 0, 0, 0, 0, 0, 0, 1, 2,
       3, 4, 5, 6, 0, 0, 0, 0, 0, 0,
       0, 0, 0, 0, 0, 7, 8, 0, 0, 0,
       9, 10, 11, 12, 0, 0, 92, 13, 14, 15,
      16, 17, 18, 7, 8, 0, 19, 0, 9, 10,
      11, 12, 0, 0, 0, 13, 14, 15, 16, 17,
      18, 0, 0, 0, 19, 1, 2, 3, 4, 5,
       6, 0, 0, 0, 0, 0, 0, 0, 1, 2,
       3, 4, 5, 6, 0, 0, 0, 0, 0, 0,
       0, 1, 2, 3, 4, 5, 6, 0, 0, 0,
       7, 8, 0, 0, 0, 9, 10, 11, 12, 0,
       0, 0, 31, 14, 15, 16, 17, 18, 9, 10,
      11, 12, 0, 0, 0, 31, 14, 15, 16, 17,
      18, 9, 10, 0, 0, 0, 0, 0, 31, 14,
      15, 16, 17, 18, 1, 2, 3, 4, 5, 6,
       0, 54, 55, 56, 57, 58, 59, 60, 61, 62,
      63, 64, 65, 66, 0, 67, 68, 69, 70, 71,
      72, 73, 74, 75, 76, 77, 78, 79, 80, 81,
      82, 83, 84, 85, 86, 0, 0, 0, 0, 0,
       0, 31, 14, 15, 16, 17, 18, 0, 0, 170,
      54, 55, 56, 57, 58, 59, 60, 61, 62, 63,
      64, 65, 66, 0, 67, 68, 69, 70, 71, 72,
      73, 74, 75, 76, 77, 78, 79, 80, 81, 82,
      83, 84, 85, 86, 0, 54, 55, 56, 57, 58,
      59, 60, 61, 62, 63, 64, 65, 66, 174, 67,
      68, 69, 70, 71, 72, 73, 74, 75, 76, 77,
      78, 79, 80, 81, 82, 83, 84, 85, 86, 0,
      54, 55, 56, 57, 58, 59, 60, 61, 62, 63,
      64, 65, 66, 185, 67, 68, 69, 70, 71, 72,
      73, 74, 75, 76, 77, 78, 79, 80, 81, 82,
      83, 84, 85, 86, 0, 0, 0, 0, 0, 0,
      96, 54, 55, 56, 57, 58, 59, 60, 61, 62,
      63, 64, 65, 66, 179, 67, 68, 69, 70, 71,
      72, 73, 74, 75, 76, 77, 78, 79, 80, 81,
      82, 83, 84, 85, 86, 54, 55, 56, 57, 58,
      59, 60, 61, 62, 63, 64, 65, 66, 0, 67,
      68, 69, 70, 71, 72, 73, 74, 75, 76, 77,
      78, 79, 80, 81, 82, 83, 84, 85, 86, 66,
       0, 67, 68, 69, 70, 71, 72, 73, 74, 75,
      76, 77, 78, 79, 80, 81, 82, 83, 84, 85,
      86, 67, 68, 69, 70, 71, 72, 73, 74, 75,
      76, 77, 78, 79, 80, 81, 82, 83, 84, 85,
      86, 69, 70, 71, 72, 73, 74, 75, 76, 77,
      78, 79, 80, 81, 82, 83, 84, 85, 86, 70,
      71, 72, 73, 74, 75, 76, 77, 78, 79, 80,
      81, 82, 83, 84, 85, 86, 71, 72, 73, 74,
      75, 76, 77, 78, 79, 80, 81, 82, 83, 84,
      85, 86, 72, 73, 74, 75, 76, 77, 78, 79,
      80, 81, 82, 83, 84, 85, 86, 74, 75, 76,
      77, 78, 79, 80, 81, 82, 83, 84, 85, 86
};

static final short yycheck[] =
{
       0, 9, 10, 51, 7, 8, 57, 19, 48, 162,
      56, 51, 52, 56, 53, 54, 58, 56, 0, 70,
      56, 57, 13, 66, 56, 64, 56, 57, 19, 29,
      66, 184, 3, 4, 5, 6, 7, 8, 9, 10,
      31, 194, 15, 56, 15, 58, 48, 49, 50, 15,
      64, 64, 66, 66, 54, 55, 56, 57, 58, 59,
      60, 61, 62, 63, 64, 65, 78, 11, 12, 69,
      70, 71, 72, 73, 74, 75, 76, 77, 15, 79,
      80, 81, 82, 83, 84, 85, 86, 78, 57, 69,
      70, 91, 100, 57, 97, 135, 136, 66, 146, 147,
      15, 66, 66, 66, 104, 64, 66, 68, 3, 4,
       5, 6, 7, 8, 9, 10, 11, 12, 13, 14,
      15, 16, 69, 123, 124, 125, 32, 33, 34, 35,
      36, 37, 38, 39, 40, 41, 42, 43, 44, 45,
      46, 47, 48, 49, 50, 153, 57, 52, 156, -1,
     150, 46, 47, -1, -1, 66, 51, 52, 53, 54,
      -1, 161, -1, 58, 59, 60, 61, 62, 63, -1,
      -1, -1, 67, -1, -1, 175, 11, 12, 13, 14,
      15, 16, -1, -1, -1, -1, 186, -1, -1, 189,
      43, 44, 45, 46, 47, 48, 49, 50, -1, -1,
      -1, 11, 12, 13, 14, 15, 16, -1, -1, -1,
      -1, 46, 47, -1, -1, -1, 51, 52, 53, 54,
      -1, -1, -1, 58, 59, 60, 61, 62, 63, -1,
      -1, -1, 67, -1, 69, 70, 46, 47, -1, -1,
      -1, 51, 52, 53, 54, -1, -1, -1, 58, 59,
      60, 61, 62, 63, -1, -1, -1, 67, -1, 69,
      11, 12, 13, 14, 15, 16, 46, 47, 48, 49,
      50, -1, -1, -1, -1, -1, -1, -1, 11, 12,
      13, 14, 15, 16, -1, -1, -1, -1, -1, -1,
      -1, -1, -1, -1, -1, 46, 47, -1, -1, -1,
      51, 52, 53, 54, -1, -1, 57, 58, 59, 60,
      61, 62, 63, 46, 47, -1, 67, -1, 51, 52,
      53, 54, -1, -1, -1, 58, 59, 60, 61, 62,
      63, -1, -1, -1, 67, 11, 12, 13, 14, 15,
      16, -1, -1, -1, -1, -1, -1, -1, 11, 12,
      13, 14, 15, 16, -1, -1, -1, -1, -1, -1,
      -1, 11, 12, 13, 14, 15, 16, -1, -1, -1,
      46, 47, -1, -1, -1, 51, 52, 53, 54, -1,
      -1, -1, 58, 59, 60, 61, 62, 63, 51, 52,
      53, 54, -1, -1, -1, 58, 59, 60, 61, 62,
      63, 51, 52, -1, -1, -1, -1, -1, 58, 59,
      60, 61, 62, 63, 11, 12, 13, 14, 15, 16,
      -1, 17, 18, 19, 20, 21, 22, 23, 24, 25,
      26, 27, 28, 29, -1, 31, 32, 33, 34, 35,
      36, 37, 38, 39, 40, 41, 42, 43, 44, 45,
      46, 47, 48, 49, 50, -1, -1, -1, -1, -1,
      -1, 58, 59, 60, 61, 62, 63, -1, -1, 65,
      17, 18, 19, 20, 21, 22, 23, 24, 25, 26,
      27, 28, 29, -1, 31, 32, 33, 34, 35, 36,
      37, 38, 39, 40, 41, 42, 43, 44, 45, 46,
      47, 48, 49, 50, -1, 17, 18, 19, 20, 21,
      22, 23, 24, 25, 26, 27, 28, 29, 65, 31,
      32, 33, 34, 35, 36, 37, 38, 39, 40, 41,
      42, 43, 44, 45, 46, 47, 48, 49, 50, -1,
      17, 18, 19, 20, 21, 22, 23, 24, 25, 26,
      27, 28, 29, 65, 31, 32, 33, 34, 35, 36,
      37, 38, 39, 40, 41, 42, 43, 44, 45, 46,
      47, 48, 49, 50, -1, -1, -1, -1, -1, -1,
      57, 17, 18, 19, 20, 21, 22, 23, 24, 25,
      26, 27, 28, 29, 30, 31, 32, 33, 34, 35,
      36, 37, 38, 39, 40, 41, 42, 43, 44, 45,
      46, 47, 48, 49, 50, 17, 18, 19, 20, 21,
      22, 23, 24, 25, 26, 27, 28, 29, -1, 31,
      32, 33, 34, 35, 36, 37, 38, 39, 40, 41,
      42, 43, 44, 45, 46, 47, 48, 49, 50, 29,
      -1, 31, 32, 33, 34, 35, 36, 37, 38, 39,
      40, 41, 42, 43, 44, 45, 46, 47, 48, 49,
      50, 31, 32, 33, 34, 35, 36, 37, 38, 39,
      40, 41, 42, 43, 44, 45, 46, 47, 48, 49,
      50, 33, 34, 35, 36, 37, 38, 39, 40, 41,
      42, 43, 44, 45, 46, 47, 48, 49, 50, 34,
      35, 36, 37, 38, 39, 40, 41, 42, 43, 44,
      45, 46, 47, 48, 49, 50, 35, 36, 37, 38,
      39, 40, 41, 42, 43, 44, 45, 46, 47, 48,
      49, 50, 36, 37, 38, 39, 40, 41, 42, 43,
      44, 45, 46, 47, 48, 49, 50, 38, 39, 40,
      41, 42, 43, 44, 45, 46, 47, 48, 49, 50
};

/* YYSTOS[STATE-NUM] -- The (internal number of the) accessing
   symbol of state STATE-NUM.  */
static final short yystos[] =
{
       0, 11, 12, 13, 14, 15, 16, 46, 47, 51,
      52, 53, 54, 58, 59, 60, 61, 62, 63, 67,
      72, 73, 78, 79, 80, 81, 82, 83, 86, 58,
      95, 58, 82, 82, 81, 81, 80, 80, 3, 4,
       5, 6, 7, 8, 9, 10, 73, 79, 85, 56,
      15, 79, 85, 0, 17, 18, 19, 20, 21, 22,
      23, 24, 25, 26, 27, 28, 29, 31, 32, 33,
      34, 35, 36, 37, 38, 39, 40, 41, 42, 43,
      44, 45, 46, 47, 48, 49, 50, 56, 53, 54,
      56, 64, 57, 73, 96, 79, 57, 57, 66, 84,
      57, 84, 15, 56, 64, 84, 89, 90, 95, 84,
      89, 73, 73, 73, 73, 73, 73, 73, 73, 73,
      73, 73, 73, 76, 75, 74, 73, 73, 73, 73,
      73, 73, 73, 73, 73, 79, 85, 97, 73, 73,
      73, 73, 73, 73, 73, 73, 15, 15, 73, 57,
      70, 57, 82, 57, 66, 81, 57, 15, 73, 88,
      66, 64, 87, 73, 73, 73, 84, 84, 95, 95,
      65, 73, 81, 81, 65, 68, 91, 73, 91, 30,
      69, 70, 73, 92, 93, 65, 77, 69, 69, 70,
      91, 73, 69, 73, 94, 91
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
  if (yytype < 71)
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
  if (yyn == -154)
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
      yytoken = ((yychar) >= 0 && (yychar) <= 302 ? yytranslate[yychar] : 2);
      do { if (yydebug != 0) { System.err.print ("Next token is" + " "); yysymprint (yytoken, yylval, yylloc); System.err.print (yyendl); } } while (false);
    }

  /* If the proper action on seeing token YYTOKEN is to reduce or to
     detect an error, take that action.  */
  yyn += yytoken;
  if (yyn < 0 || 769 < yyn || yycheck[yyn] != yytoken)
    do { pc = yydefault; continue Loop; } while (false);
  yyn = yytable[yyn];
  if (yyn <= 0)
    {
      if (yyn == 0 || yyn == -1)
 do { pc = yyerrlab; continue Loop; } while (false);
      yyn = -yyn;
      do { pc = yyreduce; continue Loop; } while (false);
    }

  if (yyn == 53)
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
        case 2:
// _line_ 80 "/home/cs/hilfingr/src/gjdb-5x/src/ucb/gjdb/ExpressionParser.y"
    { value = ((LValue)yyvsa[yyvsp+(0)]); ;}
    break;

  case 6:
// _line_ 86 "/home/cs/hilfingr/src/gjdb-5x/src/ucb/gjdb/ExpressionParser.y"
    { yyval = ((eval) ? LValue.operation (vm, "*", (((LValue)yyvsa[yyvsp+(-2)])), (((LValue)yyvsa[yyvsp+(0)]))) : null); ;}
    break;

  case 7:
// _line_ 87 "/home/cs/hilfingr/src/gjdb-5x/src/ucb/gjdb/ExpressionParser.y"
    { yyval = ((eval) ? LValue.operation (vm, "/", (((LValue)yyvsa[yyvsp+(-2)])), (((LValue)yyvsa[yyvsp+(0)]))) : null); ;}
    break;

  case 8:
// _line_ 88 "/home/cs/hilfingr/src/gjdb-5x/src/ucb/gjdb/ExpressionParser.y"
    { yyval = ((eval) ? LValue.operation (vm, "%", (((LValue)yyvsa[yyvsp+(-2)])), (((LValue)yyvsa[yyvsp+(0)]))) : null); ;}
    break;

  case 9:
// _line_ 89 "/home/cs/hilfingr/src/gjdb-5x/src/ucb/gjdb/ExpressionParser.y"
    { yyval = ((eval) ? LValue.operation (vm, "+", (((LValue)yyvsa[yyvsp+(-2)])), (((LValue)yyvsa[yyvsp+(0)])), framer) : null); ;}
    break;

  case 10:
// _line_ 90 "/home/cs/hilfingr/src/gjdb-5x/src/ucb/gjdb/ExpressionParser.y"
    { yyval = ((eval) ? LValue.operation (vm, "-", (((LValue)yyvsa[yyvsp+(-2)])), (((LValue)yyvsa[yyvsp+(0)])), framer) : null); ;}
    break;

  case 11:
// _line_ 91 "/home/cs/hilfingr/src/gjdb-5x/src/ucb/gjdb/ExpressionParser.y"
    { yyval = ((eval) ? LValue.operation (vm, "<<", (((LValue)yyvsa[yyvsp+(-2)])), (((LValue)yyvsa[yyvsp+(0)]))) : null); ;}
    break;

  case 12:
// _line_ 92 "/home/cs/hilfingr/src/gjdb-5x/src/ucb/gjdb/ExpressionParser.y"
    { yyval = ((eval) ? LValue.operation (vm, ">>", (((LValue)yyvsa[yyvsp+(-2)])), (((LValue)yyvsa[yyvsp+(0)]))) : null); ;}
    break;

  case 13:
// _line_ 93 "/home/cs/hilfingr/src/gjdb-5x/src/ucb/gjdb/ExpressionParser.y"
    { yyval = ((eval) ? LValue.operation (vm, ">>>", (((LValue)yyvsa[yyvsp+(-2)])), (((LValue)yyvsa[yyvsp+(0)]))) : null); ;}
    break;

  case 14:
// _line_ 94 "/home/cs/hilfingr/src/gjdb-5x/src/ucb/gjdb/ExpressionParser.y"
    { yyval = ((eval) ? LValue.booleanOperation (vm, "<", (((LValue)yyvsa[yyvsp+(-2)])), (((LValue)yyvsa[yyvsp+(0)]))) : null); ;}
    break;

  case 15:
// _line_ 95 "/home/cs/hilfingr/src/gjdb-5x/src/ucb/gjdb/ExpressionParser.y"
    { yyval = ((eval) ? LValue.booleanOperation (vm, ">", (((LValue)yyvsa[yyvsp+(-2)])), (((LValue)yyvsa[yyvsp+(0)]))) : null); ;}
    break;

  case 16:
// _line_ 96 "/home/cs/hilfingr/src/gjdb-5x/src/ucb/gjdb/ExpressionParser.y"
    { yyval = ((eval) ? LValue.booleanOperation (vm, "<=", (((LValue)yyvsa[yyvsp+(-2)])), (((LValue)yyvsa[yyvsp+(0)]))) : null); ;}
    break;

  case 17:
// _line_ 97 "/home/cs/hilfingr/src/gjdb-5x/src/ucb/gjdb/ExpressionParser.y"
    { yyval = ((eval) ? LValue.booleanOperation (vm, ">=", (((LValue)yyvsa[yyvsp+(-2)])), (((LValue)yyvsa[yyvsp+(0)]))) : null); ;}
    break;

  case 18:
// _line_ 98 "/home/cs/hilfingr/src/gjdb-5x/src/ucb/gjdb/ExpressionParser.y"
    { yyval = ((eval) ? LValue.booleanOperation (vm, "==", (((LValue)yyvsa[yyvsp+(-2)])), (((LValue)yyvsa[yyvsp+(0)]))) : null); ;}
    break;

  case 19:
// _line_ 99 "/home/cs/hilfingr/src/gjdb-5x/src/ucb/gjdb/ExpressionParser.y"
    { yyval = ((eval) ? LValue.booleanOperation (vm, "!=", (((LValue)yyvsa[yyvsp+(-2)])), (((LValue)yyvsa[yyvsp+(0)]))) : null); ;}
    break;

  case 20:
// _line_ 100 "/home/cs/hilfingr/src/gjdb-5x/src/ucb/gjdb/ExpressionParser.y"
    { yyval = ((eval) ? LValue.operation (vm, "&", (((LValue)yyvsa[yyvsp+(-2)])), (((LValue)yyvsa[yyvsp+(0)]))) : null); ;}
    break;

  case 21:
// _line_ 101 "/home/cs/hilfingr/src/gjdb-5x/src/ucb/gjdb/ExpressionParser.y"
    { yyval = ((eval) ? LValue.operation (vm, "|", (((LValue)yyvsa[yyvsp+(-2)])), (((LValue)yyvsa[yyvsp+(0)]))) : null); ;}
    break;

  case 22:
// _line_ 102 "/home/cs/hilfingr/src/gjdb-5x/src/ucb/gjdb/ExpressionParser.y"
    { yyval = ((eval) ? LValue.operation (vm, "^", (((LValue)yyvsa[yyvsp+(-2)])), (((LValue)yyvsa[yyvsp+(0)]))) : null); ;}
    break;

  case 23:
// _line_ 103 "/home/cs/hilfingr/src/gjdb-5x/src/ucb/gjdb/ExpressionParser.y"
    { yyval = ((eval) ? (((LValue)yyvsa[yyvsp+(-2)])).doAssign (vm, "=", (((LValue)yyvsa[yyvsp+(0)]))) : null); ;}
    break;

  case 24:
// _line_ 104 "/home/cs/hilfingr/src/gjdb-5x/src/ucb/gjdb/ExpressionParser.y"
    { yyval = ((eval) ? (((LValue)yyvsa[yyvsp+(-2)])).doAssign (vm, "*=", (((LValue)yyvsa[yyvsp+(0)]))) : null); ;}
    break;

  case 25:
// _line_ 105 "/home/cs/hilfingr/src/gjdb-5x/src/ucb/gjdb/ExpressionParser.y"
    { yyval = ((eval) ? (((LValue)yyvsa[yyvsp+(-2)])).doAssign (vm, "/=", (((LValue)yyvsa[yyvsp+(0)]))) : null); ;}
    break;

  case 26:
// _line_ 106 "/home/cs/hilfingr/src/gjdb-5x/src/ucb/gjdb/ExpressionParser.y"
    { yyval = ((eval) ? (((LValue)yyvsa[yyvsp+(-2)])).doAssign (vm, "%=", (((LValue)yyvsa[yyvsp+(0)]))) : null); ;}
    break;

  case 27:
// _line_ 107 "/home/cs/hilfingr/src/gjdb-5x/src/ucb/gjdb/ExpressionParser.y"
    { yyval = ((eval) ? (((LValue)yyvsa[yyvsp+(-2)])).doAssign (vm, "+=", (((LValue)yyvsa[yyvsp+(0)]))) : null); ;}
    break;

  case 28:
// _line_ 108 "/home/cs/hilfingr/src/gjdb-5x/src/ucb/gjdb/ExpressionParser.y"
    { yyval = ((eval) ? (((LValue)yyvsa[yyvsp+(-2)])).doAssign (vm, "-=", (((LValue)yyvsa[yyvsp+(0)]))) : null); ;}
    break;

  case 29:
// _line_ 109 "/home/cs/hilfingr/src/gjdb-5x/src/ucb/gjdb/ExpressionParser.y"
    { yyval = ((eval) ? (((LValue)yyvsa[yyvsp+(-2)])).doAssign (vm, "<<=", (((LValue)yyvsa[yyvsp+(0)]))) : null); ;}
    break;

  case 30:
// _line_ 110 "/home/cs/hilfingr/src/gjdb-5x/src/ucb/gjdb/ExpressionParser.y"
    { yyval = ((eval) ? (((LValue)yyvsa[yyvsp+(-2)])).doAssign (vm, ">>=", (((LValue)yyvsa[yyvsp+(0)]))) : null); ;}
    break;

  case 31:
// _line_ 111 "/home/cs/hilfingr/src/gjdb-5x/src/ucb/gjdb/ExpressionParser.y"
    { yyval = ((eval) ? (((LValue)yyvsa[yyvsp+(-2)])).doAssign (vm, ">>>=", (((LValue)yyvsa[yyvsp+(0)]))) : null); ;}
    break;

  case 32:
// _line_ 112 "/home/cs/hilfingr/src/gjdb-5x/src/ucb/gjdb/ExpressionParser.y"
    { yyval = ((eval) ? (((LValue)yyvsa[yyvsp+(-2)])).doAssign (vm, "&=", (((LValue)yyvsa[yyvsp+(0)]))) : null); ;}
    break;

  case 33:
// _line_ 113 "/home/cs/hilfingr/src/gjdb-5x/src/ucb/gjdb/ExpressionParser.y"
    { yyval = ((eval) ? (((LValue)yyvsa[yyvsp+(-2)])).doAssign (vm, "^=", (((LValue)yyvsa[yyvsp+(0)]))) : null); ;}
    break;

  case 34:
// _line_ 114 "/home/cs/hilfingr/src/gjdb-5x/src/ucb/gjdb/ExpressionParser.y"
    { yyval = ((eval) ? (((LValue)yyvsa[yyvsp+(-2)])).doAssign (vm, "|=", (((LValue)yyvsa[yyvsp+(0)]))) : null); ;}
    break;

  case 35:
// _line_ 116 "/home/cs/hilfingr/src/gjdb-5x/src/ucb/gjdb/ExpressionParser.y"
    { yyval = (eval)
     ? ((LValue)yyvsa[yyvsp+(-2)]).instanceOf (vm, framer, ((String)yyvsa[yyvsp+(0)]))
     : null; ;}
    break;

  case 36:
// _line_ 123 "/home/cs/hilfingr/src/gjdb-5x/src/ucb/gjdb/ExpressionParser.y"
    { pushEval ();
     if (eval) {
         Value cond1 = ((LValue)yyvsa[yyvsp+(-1)]).interiorGetValue ();
         if (! (cond1 instanceof BooleanValue))
      throw ERROR ("non-boolean operand to &&");
         eval = ((BooleanValue) cond1).booleanValue ();
         yyval = eval;
     }
   ;}
    break;

  case 37:
// _line_ 132 "/home/cs/hilfingr/src/gjdb-5x/src/ucb/gjdb/ExpressionParser.y"
    { popEval ();
     if (eval) {
         yyval = ((LValue)yyvsa[yyvsp+(-3)]);
         if (((Boolean)yyvsa[yyvsp+(-1)])) {
      Value cond2 = ((LValue)yyvsa[yyvsp+(0)]).interiorGetValue ();
      if (! (cond2 instanceof BooleanValue))
         throw ERROR ("non-boolean operand to &&");
      yyval = ((LValue)yyvsa[yyvsp+(0)]);
         }
     }
   ;}
    break;

  case 38:
// _line_ 143 "/home/cs/hilfingr/src/gjdb-5x/src/ucb/gjdb/ExpressionParser.y"
    { pushEval ();
     if (eval) {
         Value cond1 = ((LValue)yyvsa[yyvsp+(-1)]).interiorGetValue ();
         if (! (cond1 instanceof BooleanValue))
      throw ERROR ("non-boolean operand to ||");
         eval = !((BooleanValue) cond1).booleanValue ();
         yyval = !eval;
     }
   ;}
    break;

  case 39:
// _line_ 152 "/home/cs/hilfingr/src/gjdb-5x/src/ucb/gjdb/ExpressionParser.y"
    { popEval ();
     if (eval) {
         yyval = ((LValue)yyvsa[yyvsp+(-3)]);
         if (! ((Boolean)yyvsa[yyvsp+(-1)])) {
      Value cond2 = ((LValue)yyvsa[yyvsp+(0)]).interiorGetValue ();
      if (! (cond2 instanceof BooleanValue))
         throw ERROR ("non-boolean operand to ||");
      yyval = ((LValue)yyvsa[yyvsp+(0)]);
         }
     }
   ;}
    break;

  case 40:
// _line_ 163 "/home/cs/hilfingr/src/gjdb-5x/src/ucb/gjdb/ExpressionParser.y"
    { pushEval ();
     if (eval) {
         Value cond = ((LValue)yyvsa[yyvsp+(-1)]).interiorGetValue ();
         if (! (cond instanceof BooleanValue))
      throw ERROR ("non-boolean condition on ?:");
         eval = ((BooleanValue) cond).booleanValue ();
         yyval = eval;
     }
   ;}
    break;

  case 41:
// _line_ 172 "/home/cs/hilfingr/src/gjdb-5x/src/ucb/gjdb/ExpressionParser.y"
    { popEval ();
     pushEval ();
     if (eval)
         eval = ! ((Boolean)yyvsa[yyvsp+(-2)]);
   ;}
    break;

  case 42:
// _line_ 177 "/home/cs/hilfingr/src/gjdb-5x/src/ucb/gjdb/ExpressionParser.y"
    { popEval ();
     if (eval)
         yyval = ((Boolean)yyvsa[yyvsp+(-4)]) ? ((LValue)yyvsa[yyvsp+(-3)]) : ((LValue)yyvsa[yyvsp+(0)]);
   ;}
    break;

  case 43:
// _line_ 185 "/home/cs/hilfingr/src/gjdb-5x/src/ucb/gjdb/ExpressionParser.y"
    { if (eval)
         yyval = LValue.makeName (vm, framer, ((String)yyvsa[yyvsp+(0)])); ;}
    break;

  case 44:
// _line_ 187 "/home/cs/hilfingr/src/gjdb-5x/src/ucb/gjdb/ExpressionParser.y"
    { if (eval)
         yyval = LValue.makeFloat (vm, ((String)yyvsa[yyvsp+(0)])); ;}
    break;

  case 45:
// _line_ 189 "/home/cs/hilfingr/src/gjdb-5x/src/ucb/gjdb/ExpressionParser.y"
    { if (eval)
         yyval = LValue.makeInteger (vm, ((String)yyvsa[yyvsp+(0)])); ;}
    break;

  case 46:
// _line_ 191 "/home/cs/hilfingr/src/gjdb-5x/src/ucb/gjdb/ExpressionParser.y"
    { if (eval)
         yyval = LValue.makeCharacter (vm, ((String)yyvsa[yyvsp+(0)])); ;}
    break;

  case 47:
// _line_ 193 "/home/cs/hilfingr/src/gjdb-5x/src/ucb/gjdb/ExpressionParser.y"
    { if (eval)
         yyval = LValue.makeString (vm, ((String)yyvsa[yyvsp+(0)])); ;}
    break;

  case 48:
// _line_ 195 "/home/cs/hilfingr/src/gjdb-5x/src/ucb/gjdb/ExpressionParser.y"
    { yyval = ((LValue)yyvsa[yyvsp+(-1)]); ;}
    break;

  case 49:
// _line_ 196 "/home/cs/hilfingr/src/gjdb-5x/src/ucb/gjdb/ExpressionParser.y"
    { if (eval)
         yyval = LValue.makeThisObject (vm, framer,
                "this"); ;}
    break;

  case 50:
// _line_ 200 "/home/cs/hilfingr/src/gjdb-5x/src/ucb/gjdb/ExpressionParser.y"
    { if (eval)
         yyval = LValue.makeThisObject (vm, framer,
         "super")
     .superLValue (framer, ((String)yyvsa[yyvsp+(0)])); ;}
    break;

  case 51:
// _line_ 204 "/home/cs/hilfingr/src/gjdb-5x/src/ucb/gjdb/ExpressionParser.y"
    { if (eval)
         yyval = LValue.makeBoolean (vm, "true"); ;}
    break;

  case 52:
// _line_ 206 "/home/cs/hilfingr/src/gjdb-5x/src/ucb/gjdb/ExpressionParser.y"
    { if (eval)
         yyval = LValue.makeBoolean (vm, "false"); ;}
    break;

  case 53:
// _line_ 208 "/home/cs/hilfingr/src/gjdb-5x/src/ucb/gjdb/ExpressionParser.y"
    { if (eval)
         yyval = LValue.makeNull (vm, "null"); ;}
    break;

  case 54:
// _line_ 214 "/home/cs/hilfingr/src/gjdb-5x/src/ucb/gjdb/ExpressionParser.y"
    { if (eval) {
         Value val =
    Env.getSavedValue (((String)yyvsa[yyvsp+(0)]).substring (1));
         if (val == null)
    throw ERROR ("%s undefined", ((String)yyvsa[yyvsp+(0)]));
         yyval = LValue.makeConstant (val);
      }
   ;}
    break;

  case 56:
// _line_ 225 "/home/cs/hilfingr/src/gjdb-5x/src/ucb/gjdb/ExpressionParser.y"
    { yyval = ((String)yyvsa[yyvsp+(-2)]) + "." + ((String)yyvsa[yyvsp+(0)]); ;}
    break;

  case 58:
// _line_ 231 "/home/cs/hilfingr/src/gjdb-5x/src/ucb/gjdb/ExpressionParser.y"
    { if (eval) {
        yyval = LValue.makeConstant (((LValue)yyvsa[yyvsp+(-1)]).interiorGetValue ());
        doIncr (((LValue)yyvsa[yyvsp+(-1)]), 1);
    }
   ;}
    break;

  case 59:
// _line_ 237 "/home/cs/hilfingr/src/gjdb-5x/src/ucb/gjdb/ExpressionParser.y"
    { if (eval) {
        yyval = LValue.makeConstant (((LValue)yyvsa[yyvsp+(-1)]).interiorGetValue ());
        doIncr (((LValue)yyvsa[yyvsp+(-1)]), -1);
    }
  ;}
    break;

  case 60:
// _line_ 243 "/home/cs/hilfingr/src/gjdb-5x/src/ucb/gjdb/ExpressionParser.y"
    { if (eval)
        yyval = ((LValue)yyvsa[yyvsp+(-3)]).arrayElementLValue (((LValue)yyvsa[yyvsp+(-1)])); ;}
    break;

  case 61:
// _line_ 250 "/home/cs/hilfingr/src/gjdb-5x/src/ucb/gjdb/ExpressionParser.y"
    { if (eval)
        yyval = ((LValue)yyvsa[yyvsp+(-2)]).memberLValue (framer, ((String)yyvsa[yyvsp+(0)])); ;}
    break;

  case 62:
// _line_ 253 "/home/cs/hilfingr/src/gjdb-5x/src/ucb/gjdb/ExpressionParser.y"
    { if (eval) {
        LValue v = ((LValue)yyvsa[yyvsp+(-3)]).memberLValue (framer, ((String)yyvsa[yyvsp+(-1)]));
        yyval = v;
        v.invokeWith (((List)yyvsa[yyvsp+(0)]));
    }
  ;}
    break;

  case 63:
// _line_ 260 "/home/cs/hilfingr/src/gjdb-5x/src/ucb/gjdb/ExpressionParser.y"
    { if (eval) {
        LValue v = LValue.makeName (vm, framer, ((String)yyvsa[yyvsp+(-1)]));
        v.invokeWith (((List)yyvsa[yyvsp+(0)]));
        yyval = v;
    }
  ;}
    break;

  case 64:
// _line_ 271 "/home/cs/hilfingr/src/gjdb-5x/src/ucb/gjdb/ExpressionParser.y"
    { if (eval) {
        LValue v = LValue.makeName (vm, framer,
               ((String)yyvsa[yyvsp+(-3)]) + "." + ((String)yyvsa[yyvsp+(-1)]));
        v.invokeWith (((List)yyvsa[yyvsp+(0)]));
        yyval = v;
     }
  ;}
    break;

  case 65:
// _line_ 279 "/home/cs/hilfingr/src/gjdb-5x/src/ucb/gjdb/ExpressionParser.y"
    { if (eval)
       yyval = LValue.makeName (vm, framer, ((String)yyvsa[yyvsp+(-1)])); ;}
    break;

  case 67:
// _line_ 285 "/home/cs/hilfingr/src/gjdb-5x/src/ucb/gjdb/ExpressionParser.y"
    { yyval = ((eval) ? LValue.operation (vm, "+", (((LValue)yyvsa[yyvsp+(0)]))) : null); ;}
    break;

  case 68:
// _line_ 286 "/home/cs/hilfingr/src/gjdb-5x/src/ucb/gjdb/ExpressionParser.y"
    { yyval = ((eval) ? LValue.operation (vm, "-", (((LValue)yyvsa[yyvsp+(0)]))) : null); ;}
    break;

  case 70:
// _line_ 291 "/home/cs/hilfingr/src/gjdb-5x/src/ucb/gjdb/ExpressionParser.y"
    { yyval = eval ? doIncr (((LValue)yyvsa[yyvsp+(0)]), 1) : null; ;}
    break;

  case 71:
// _line_ 292 "/home/cs/hilfingr/src/gjdb-5x/src/ucb/gjdb/ExpressionParser.y"
    { yyval = eval ? doIncr (((LValue)yyvsa[yyvsp+(0)]), -1) : null; ;}
    break;

  case 72:
// _line_ 293 "/home/cs/hilfingr/src/gjdb-5x/src/ucb/gjdb/ExpressionParser.y"
    { yyval = ((eval) ? LValue.operation (vm, "~", (((LValue)yyvsa[yyvsp+(0)]))) : null); ;}
    break;

  case 73:
// _line_ 294 "/home/cs/hilfingr/src/gjdb-5x/src/ucb/gjdb/ExpressionParser.y"
    { yyval = ((eval) ? LValue.operation (vm, "!", (((LValue)yyvsa[yyvsp+(0)]))) : null); ;}
    break;

  case 74:
// _line_ 299 "/home/cs/hilfingr/src/gjdb-5x/src/ucb/gjdb/ExpressionParser.y"
    { yyval = eval
     ? LValue.castPrimitive (vm, ((String)yyvsa[yyvsp+(-2)]), ((LValue)yyvsa[yyvsp+(0)]))
     : null; ;}
    break;

  case 75:
// _line_ 308 "/home/cs/hilfingr/src/gjdb-5x/src/ucb/gjdb/ExpressionParser.y"
    { yyval = (yyvsa[yyvsp+(-1)]); ;}
    break;

  case 76:
// _line_ 309 "/home/cs/hilfingr/src/gjdb-5x/src/ucb/gjdb/ExpressionParser.y"
    { yyval = ((LValue)yyvsa[yyvsp+(0)]); ;}
    break;

  case 77:
// _line_ 310 "/home/cs/hilfingr/src/gjdb-5x/src/ucb/gjdb/ExpressionParser.y"
    { yyval = ((LValue)yyvsa[yyvsp+(0)]); ;}
    break;

  case 78:
// _line_ 314 "/home/cs/hilfingr/src/gjdb-5x/src/ucb/gjdb/ExpressionParser.y"
    { yyval = ((Integer)yyvsa[yyvsp+(-1)]) + 1; ;}
    break;

  case 79:
// _line_ 315 "/home/cs/hilfingr/src/gjdb-5x/src/ucb/gjdb/ExpressionParser.y"
    { yyval = 1; ;}
    break;

  case 88:
// _line_ 331 "/home/cs/hilfingr/src/gjdb-5x/src/ucb/gjdb/ExpressionParser.y"
    { yyval = eval
    ? LValue.makeArray (vm, ((String)yyvsa[yyvsp+(-1)]), framer, ((List)yyvsa[yyvsp+(0)]))
           : null; ;}
    break;

  case 89:
// _line_ 335 "/home/cs/hilfingr/src/gjdb-5x/src/ucb/gjdb/ExpressionParser.y"
    { startArrayInitializer (((String)yyvsa[yyvsp+(-1)]), ((Integer)yyvsa[yyvsp+(0)])); ;}
    break;

  case 90:
// _line_ 337 "/home/cs/hilfingr/src/gjdb-5x/src/ucb/gjdb/ExpressionParser.y"
    { yyval = finishArray (); ;}
    break;

  case 91:
// _line_ 339 "/home/cs/hilfingr/src/gjdb-5x/src/ucb/gjdb/ExpressionParser.y"
    { yyval = eval
          ? LValue.makeNewObject (vm, framer, ((String)yyvsa[yyvsp+(-1)]), ((List)yyvsa[yyvsp+(0)]))
          : null; ;}
    break;

  case 92:
// _line_ 343 "/home/cs/hilfingr/src/gjdb-5x/src/ucb/gjdb/ExpressionParser.y"
    { yyval = eval
    ? LValue.makeArray (vm, ((String)yyvsa[yyvsp+(-1)]), framer, ((List)yyvsa[yyvsp+(0)]))
           : null; ;}
    break;

  case 93:
// _line_ 347 "/home/cs/hilfingr/src/gjdb-5x/src/ucb/gjdb/ExpressionParser.y"
    { startArrayInitializer (((String)yyvsa[yyvsp+(-1)]), ((Integer)yyvsa[yyvsp+(0)])); ;}
    break;

  case 94:
// _line_ 349 "/home/cs/hilfingr/src/gjdb-5x/src/ucb/gjdb/ExpressionParser.y"
    { yyval = finishArray (); ;}
    break;

  case 96:
// _line_ 354 "/home/cs/hilfingr/src/gjdb-5x/src/ucb/gjdb/ExpressionParser.y"
    { if (eval) {
         yyval = ((List)yyvsa[yyvsp+(-1)]); ((List)yyvsa[yyvsp+(-1)]).add (null);
      }
    ;}
    break;

  case 97:
// _line_ 361 "/home/cs/hilfingr/src/gjdb-5x/src/ucb/gjdb/ExpressionParser.y"
    { if (eval) {
         ArrayList<Value> v =
     new ArrayList<Value> ();
         v.add (((LValue)yyvsa[yyvsp+(-1)]).interiorGetValue ());
         yyval = v;
      }
    ;}
    break;

  case 98:
// _line_ 369 "/home/cs/hilfingr/src/gjdb-5x/src/ucb/gjdb/ExpressionParser.y"
    { if (eval) {
         ((List)yyvsa[yyvsp+(-3)]).add (((LValue)yyvsa[yyvsp+(-1)]).interiorGetValue ());
         yyval = ((List)yyvsa[yyvsp+(-3)]);
      }
    ;}
    break;

  case 99:
// _line_ 377 "/home/cs/hilfingr/src/gjdb-5x/src/ucb/gjdb/ExpressionParser.y"
    { ;}
    break;

  case 100:
// _line_ 378 "/home/cs/hilfingr/src/gjdb-5x/src/ucb/gjdb/ExpressionParser.y"
    { ;}
    break;

  case 101:
// _line_ 379 "/home/cs/hilfingr/src/gjdb-5x/src/ucb/gjdb/ExpressionParser.y"
    { ;}
    break;

  case 102:
// _line_ 381 "/home/cs/hilfingr/src/gjdb-5x/src/ucb/gjdb/ExpressionParser.y"
    { ;}
    break;

  case 103:
// _line_ 385 "/home/cs/hilfingr/src/gjdb-5x/src/ucb/gjdb/ExpressionParser.y"
    { addInitializer (((LValue)yyvsa[yyvsp+(0)])); ;}
    break;

  case 104:
// _line_ 386 "/home/cs/hilfingr/src/gjdb-5x/src/ucb/gjdb/ExpressionParser.y"
    { startArrayInitializer (); ;}
    break;

  case 106:
// _line_ 388 "/home/cs/hilfingr/src/gjdb-5x/src/ucb/gjdb/ExpressionParser.y"
    { addInitializer (((LValue)yyvsa[yyvsp+(0)])); ;}
    break;

  case 107:
// _line_ 389 "/home/cs/hilfingr/src/gjdb-5x/src/ucb/gjdb/ExpressionParser.y"
    { startArrayInitializer (); ;}
    break;

  case 109:
// _line_ 394 "/home/cs/hilfingr/src/gjdb-5x/src/ucb/gjdb/ExpressionParser.y"
    { yyval = ((List)yyvsa[yyvsp+(-1)]); ;}
    break;

  case 110:
// _line_ 395 "/home/cs/hilfingr/src/gjdb-5x/src/ucb/gjdb/ExpressionParser.y"
    { yyval = Collections.EMPTY_LIST; ;}
    break;

  case 111:
// _line_ 399 "/home/cs/hilfingr/src/gjdb-5x/src/ucb/gjdb/ExpressionParser.y"
    { if (eval) {
         ArrayList<Value> v =
     new ArrayList<Value> ();
                v.add (((LValue)yyvsa[yyvsp+(0)]).interiorGetValue ());
         yyval = v;
      }
    ;}
    break;

  case 112:
// _line_ 406 "/home/cs/hilfingr/src/gjdb-5x/src/ucb/gjdb/ExpressionParser.y"
    { if (eval) {
          ((List)yyvsa[yyvsp+(-2)]).add (((LValue)yyvsa[yyvsp+(0)]).interiorGetValue ());
          yyval = ((List)yyvsa[yyvsp+(-2)]);
      }
    ;}
    break;

  case 113:
// _line_ 414 "/home/cs/hilfingr/src/gjdb-5x/src/ucb/gjdb/ExpressionParser.y"
    { yyval = LValue.JVM_typeName (((String)yyvsa[yyvsp+(-1)]), ((Integer)yyvsa[yyvsp+(0)])); ;}
    break;

  case 114:
// _line_ 415 "/home/cs/hilfingr/src/gjdb-5x/src/ucb/gjdb/ExpressionParser.y"
    { yyval = ((String)yyvsa[yyvsp+(0)]); ;}
    break;

  case 115:
// _line_ 416 "/home/cs/hilfingr/src/gjdb-5x/src/ucb/gjdb/ExpressionParser.y"
    { yyval = LValue.JVM_typeName (((String)yyvsa[yyvsp+(-1)]), ((Integer)yyvsa[yyvsp+(0)])); ;}
    break;


    }

/* Line 813 of yacc.java.  */
// _line_ 1670 "/home/cs/hilfingr/src/gjdb-5x/src/ucb/gjdb/ExpressionParser.java"

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

  yystate = yypgoto[yyn - 71] + yyssa[yyssp];
  if (0 <= yystate && yystate <= 769 && yycheck[yystate] == yyssa[yyssp])
    yystate = yytable[yystate];
  else
    yystate = yydefgoto[yyn - 71];

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
      if (yyn != -154)
 {
   yyn += 1;
   if (0 <= yyn && yyn <= 769 && yycheck[yyn] == 1)
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

  if (yyn == 53)
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

// _line_ 418 "/home/cs/hilfingr/src/gjdb-5x/src/ucb/gjdb/ExpressionParser.y"


private static final HashMap<String, Integer> tokenMap =
 new HashMap<String, Integer> ();

static Value evaluate (String src, VirtualMachine vm, GetFrame framer,
         String[] uncommentedSrc)
    throws InvocationException, InvalidTypeException,
    IncompatibleThreadStateException, ClassNotLoadedException
{
    if (vm == null)
 throw ERROR ("Expression evaluation requires a running program.");
    ExpressionParser parser =
 new ExpressionParser (new ExpressionLexer (src), vm, framer);
    parser.parse ();
    EventHandler.setEnables (false);
    Value val;
    try {
 val = parser.value.getValue ();
 if (uncommentedSrc != null)
     uncommentedSrc[0] = parser.lexer.uncommentedSource ();
    } finally {
 EventHandler.setEnables (true);
    }
    return val;
}

static Value evaluate (String src, VirtualMachine vm, GetFrame framer)
    throws InvocationException, InvalidTypeException,
    IncompatibleThreadStateException, ClassNotLoadedException
{
    return evaluate (src, vm, framer, null);
}

private ExpressionParser (ExpressionLexer lexer, VirtualMachine vm,
     GetFrame framer) {
    eval = true;
    this.lexer = lexer;
    this.vm = vm;
    this.framer = framer;
    this.value = null;
}


private Stack<Boolean> evalState = new Stack<Boolean> ();
private boolean eval;
LValue value;
private ExpressionLexer lexer;
private VirtualMachine vm;
private GetFrame framer;

private void pushEval () {
    evalState.push (eval);
}

private void popEval () {
    eval = evalState.pop ();
}

private LValue doIncr (LValue var, int n) {
    return var.doAssign (vm, "+=", LValue.make (vm, n));
}

private static class ArrayInitializer {
    int dims;
    String eltType;
    ArrayList<LValue> elts = new ArrayList<LValue> ();
}

private Stack<ArrayInitializer> arrayInits = new Stack<ArrayInitializer>();

private void startArrayInitializer (String eltType, int dims) {
    ArrayInitializer v = new ArrayInitializer ();
    v.eltType = eltType; v.dims = dims;
    arrayInits.push (v);
}

private void startArrayInitializer () {
    startArrayInitializer (arrayInits.peek ().eltType,
      arrayInits.peek ().dims - 1);
}

private void addInitializer (LValue x) {
    arrayInits.peek ().elts.add (x);
}

private LValue finishArray () {
    ArrayInitializer I = arrayInits.pop ();
    if (eval) {
 ArrayReference val =
     LValue.makeSimpleArray (vm, I.eltType, framer, I.dims,
        I.elts.size ());
 for (int i = 0; i < I.elts.size (); i += 1) {
     try {
  val.setValue (i, I.elts.get (i).interiorGetValue ());
     } catch (Exception e) {
  throw ERROR ("Problem setting array element: " + e);
     }
 }
 return LValue.makeConstant (val);
    } else
 return null;
}

private int yylex () {
    try {
       int v = lexer.yylex ();
       yylval = lexer.lexeme;
       return v;
    } catch (CommandException e) {
       throw e;
    } catch (Exception e) {
       throw ERROR ("problem reading expression: %s", e);
    }
}

private void yyerror (int dummy, String msg) {
    throw ERROR ("%s", msg);
}

static int findQuotedToken (String s) {
 Integer i = tokenMap.get (s);
 return i == null ? 0 : i;
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
