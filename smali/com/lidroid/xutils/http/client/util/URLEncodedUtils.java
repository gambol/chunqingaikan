package com.lidroid.xutils.http.client.util; class URLEncodedUtils { void a() { int a;
a=0;// .class public Lcom/lidroid/xutils/http/client/util/URLEncodedUtils;
a=0;// .super Ljava/lang/Object;
a=0;// .source "URLEncodedUtils.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final CONTENT_TYPE:Ljava/lang/String; = "application/x-www-form-urlencoded"
a=0;// 
a=0;// .field private static final DELIM:[C
a=0;// 
a=0;// .field private static final FRAGMENT:Ljava/util/BitSet;
a=0;// 
a=0;// .field private static final NAME_VALUE_SEPARATOR:Ljava/lang/String; = "="
a=0;// 
a=0;// .field private static final PARAMETER_SEPARATOR:Ljava/lang/String; = "&"
a=0;// 
a=0;// .field private static final PATHSAFE:Ljava/util/BitSet;
a=0;// 
a=0;// .field private static final PUNCT:Ljava/util/BitSet;
a=0;// 
a=0;// .field private static final RADIX:I = 0x10
a=0;// 
a=0;// .field private static final RESERVED:Ljava/util/BitSet;
a=0;// 
a=0;// .field private static final UNRESERVED:Ljava/util/BitSet;
a=0;// 
a=0;// .field private static final URLENCODER:Ljava/util/BitSet;
a=0;// 
a=0;// .field private static final USERINFO:Ljava/util/BitSet;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v7, 0x2c
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     const/16 v6, 0x2b
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     const/16 v5, 0x24
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     const/16 v4, 0x26
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     const/16 v3, 0x100
a=0;// 
a=0;//     .line 115
a=0;//     #v3=(PosShort);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     new-array v1, v1, [C
a=0;// 
a=0;//     #v1=(Reference,[C);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     aput-char v4, v1, v2
a=0;// 
a=0;//     sput-object v1, Lcom/lidroid/xutils/http/client/util/URLEncodedUtils;->DELIM:[C
a=0;// 
a=0;//     .line 200
a=0;//     new-instance v1, Ljava/util/BitSet;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/BitSet;);
a=0;//     invoke-direct {v1, v3}, Ljava/util/BitSet;-><init>(I)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/BitSet;);
a=0;//     sput-object v1, Lcom/lidroid/xutils/http/client/util/URLEncodedUtils;->UNRESERVED:Ljava/util/BitSet;
a=0;// 
a=0;//     .line 206
a=0;//     new-instance v1, Ljava/util/BitSet;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/BitSet;);
a=0;//     invoke-direct {v1, v3}, Ljava/util/BitSet;-><init>(I)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/BitSet;);
a=0;//     sput-object v1, Lcom/lidroid/xutils/http/client/util/URLEncodedUtils;->PUNCT:Ljava/util/BitSet;
a=0;// 
a=0;//     .line 210
a=0;//     new-instance v1, Ljava/util/BitSet;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/BitSet;);
a=0;//     invoke-direct {v1, v3}, Ljava/util/BitSet;-><init>(I)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/BitSet;);
a=0;//     sput-object v1, Lcom/lidroid/xutils/http/client/util/URLEncodedUtils;->USERINFO:Ljava/util/BitSet;
a=0;// 
a=0;//     .line 214
a=0;//     new-instance v1, Ljava/util/BitSet;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/BitSet;);
a=0;//     invoke-direct {v1, v3}, Ljava/util/BitSet;-><init>(I)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/BitSet;);
a=0;//     sput-object v1, Lcom/lidroid/xutils/http/client/util/URLEncodedUtils;->PATHSAFE:Ljava/util/BitSet;
a=0;// 
a=0;//     .line 218
a=0;//     new-instance v1, Ljava/util/BitSet;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/BitSet;);
a=0;//     invoke-direct {v1, v3}, Ljava/util/BitSet;-><init>(I)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/BitSet;);
a=0;//     sput-object v1, Lcom/lidroid/xutils/http/client/util/URLEncodedUtils;->FRAGMENT:Ljava/util/BitSet;
a=0;// 
a=0;//     .line 228
a=0;//     new-instance v1, Ljava/util/BitSet;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/BitSet;);
a=0;//     invoke-direct {v1, v3}, Ljava/util/BitSet;-><init>(I)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/BitSet;);
a=0;//     sput-object v1, Lcom/lidroid/xutils/http/client/util/URLEncodedUtils;->RESERVED:Ljava/util/BitSet;
a=0;// 
a=0;//     .line 235
a=0;//     new-instance v1, Ljava/util/BitSet;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/BitSet;);
a=0;//     invoke-direct {v1, v3}, Ljava/util/BitSet;-><init>(I)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/BitSet;);
a=0;//     sput-object v1, Lcom/lidroid/xutils/http/client/util/URLEncodedUtils;->URLENCODER:Ljava/util/BitSet;
a=0;// 
a=0;//     .line 240
a=0;//     const/16 v0, 0x61
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0x7a
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-le v0, v1, :cond_0
a=0;// 
a=0;//     .line 243
a=0;//     const/16 v0, 0x41
a=0;// 
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);
a=0;//     const/16 v1, 0x5a
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-le v0, v1, :cond_1
a=0;// 
a=0;//     .line 247
a=0;//     const/16 v0, 0x30
a=0;// 
a=0;//     :goto_2
a=0;//     #v1=(Conflicted);
a=0;//     const/16 v1, 0x39
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-le v0, v1, :cond_2
a=0;// 
a=0;//     .line 250
a=0;//     sget-object v1, Lcom/lidroid/xutils/http/client/util/URLEncodedUtils;->UNRESERVED:Ljava/util/BitSet;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/BitSet;);
a=0;//     const/16 v2, 0x5f
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V
a=0;// 
a=0;//     .line 251
a=0;//     sget-object v1, Lcom/lidroid/xutils/http/client/util/URLEncodedUtils;->UNRESERVED:Ljava/util/BitSet;
a=0;// 
a=0;//     const/16 v2, 0x2d
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V
a=0;// 
a=0;//     .line 252
a=0;//     sget-object v1, Lcom/lidroid/xutils/http/client/util/URLEncodedUtils;->UNRESERVED:Ljava/util/BitSet;
a=0;// 
a=0;//     const/16 v2, 0x2e
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V
a=0;// 
a=0;//     .line 253
a=0;//     sget-object v1, Lcom/lidroid/xutils/http/client/util/URLEncodedUtils;->UNRESERVED:Ljava/util/BitSet;
a=0;// 
a=0;//     const/16 v2, 0x2a
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V
a=0;// 
a=0;//     .line 254
a=0;//     sget-object v1, Lcom/lidroid/xutils/http/client/util/URLEncodedUtils;->URLENCODER:Ljava/util/BitSet;
a=0;// 
a=0;//     sget-object v2, Lcom/lidroid/xutils/http/client/util/URLEncodedUtils;->UNRESERVED:Ljava/util/BitSet;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/BitSet;);
a=0;//     invoke-virtual {v1, v2}, Ljava/util/BitSet;->or(Ljava/util/BitSet;)V
a=0;// 
a=0;//     .line 255
a=0;//     sget-object v1, Lcom/lidroid/xutils/http/client/util/URLEncodedUtils;->UNRESERVED:Ljava/util/BitSet;
a=0;// 
a=0;//     const/16 v2, 0x21
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V
a=0;// 
a=0;//     .line 256
a=0;//     sget-object v1, Lcom/lidroid/xutils/http/client/util/URLEncodedUtils;->UNRESERVED:Ljava/util/BitSet;
a=0;// 
a=0;//     const/16 v2, 0x7e
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V
a=0;// 
a=0;//     .line 257
a=0;//     sget-object v1, Lcom/lidroid/xutils/http/client/util/URLEncodedUtils;->UNRESERVED:Ljava/util/BitSet;
a=0;// 
a=0;//     const/16 v2, 0x27
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V
a=0;// 
a=0;//     .line 258
a=0;//     sget-object v1, Lcom/lidroid/xutils/http/client/util/URLEncodedUtils;->UNRESERVED:Ljava/util/BitSet;
a=0;// 
a=0;//     const/16 v2, 0x28
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V
a=0;// 
a=0;//     .line 259
a=0;//     sget-object v1, Lcom/lidroid/xutils/http/client/util/URLEncodedUtils;->UNRESERVED:Ljava/util/BitSet;
a=0;// 
a=0;//     const/16 v2, 0x29
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V
a=0;// 
a=0;//     .line 261
a=0;//     sget-object v1, Lcom/lidroid/xutils/http/client/util/URLEncodedUtils;->PUNCT:Ljava/util/BitSet;
a=0;// 
a=0;//     invoke-virtual {v1, v7}, Ljava/util/BitSet;->set(I)V
a=0;// 
a=0;//     .line 262
a=0;//     sget-object v1, Lcom/lidroid/xutils/http/client/util/URLEncodedUtils;->PUNCT:Ljava/util/BitSet;
a=0;// 
a=0;//     const/16 v2, 0x3b
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V
a=0;// 
a=0;//     .line 263
a=0;//     sget-object v1, Lcom/lidroid/xutils/http/client/util/URLEncodedUtils;->PUNCT:Ljava/util/BitSet;
a=0;// 
a=0;//     const/16 v2, 0x3a
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V
a=0;// 
a=0;//     .line 264
a=0;//     sget-object v1, Lcom/lidroid/xutils/http/client/util/URLEncodedUtils;->PUNCT:Ljava/util/BitSet;
a=0;// 
a=0;//     invoke-virtual {v1, v5}, Ljava/util/BitSet;->set(I)V
a=0;// 
a=0;//     .line 265
a=0;//     sget-object v1, Lcom/lidroid/xutils/http/client/util/URLEncodedUtils;->PUNCT:Ljava/util/BitSet;
a=0;// 
a=0;//     invoke-virtual {v1, v4}, Ljava/util/BitSet;->set(I)V
a=0;// 
a=0;//     .line 266
a=0;//     sget-object v1, Lcom/lidroid/xutils/http/client/util/URLEncodedUtils;->PUNCT:Ljava/util/BitSet;
a=0;// 
a=0;//     invoke-virtual {v1, v6}, Ljava/util/BitSet;->set(I)V
a=0;// 
a=0;//     .line 267
a=0;//     sget-object v1, Lcom/lidroid/xutils/http/client/util/URLEncodedUtils;->PUNCT:Ljava/util/BitSet;
a=0;// 
a=0;//     const/16 v2, 0x3d
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V
a=0;// 
a=0;//     .line 269
a=0;//     sget-object v1, Lcom/lidroid/xutils/http/client/util/URLEncodedUtils;->USERINFO:Ljava/util/BitSet;
a=0;// 
a=0;//     sget-object v2, Lcom/lidroid/xutils/http/client/util/URLEncodedUtils;->UNRESERVED:Ljava/util/BitSet;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/BitSet;);
a=0;//     invoke-virtual {v1, v2}, Ljava/util/BitSet;->or(Ljava/util/BitSet;)V
a=0;// 
a=0;//     .line 270
a=0;//     sget-object v1, Lcom/lidroid/xutils/http/client/util/URLEncodedUtils;->USERINFO:Ljava/util/BitSet;
a=0;// 
a=0;//     sget-object v2, Lcom/lidroid/xutils/http/client/util/URLEncodedUtils;->PUNCT:Ljava/util/BitSet;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/util/BitSet;->or(Ljava/util/BitSet;)V
a=0;// 
a=0;//     .line 273
a=0;//     sget-object v1, Lcom/lidroid/xutils/http/client/util/URLEncodedUtils;->PATHSAFE:Ljava/util/BitSet;
a=0;// 
a=0;//     sget-object v2, Lcom/lidroid/xutils/http/client/util/URLEncodedUtils;->UNRESERVED:Ljava/util/BitSet;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/util/BitSet;->or(Ljava/util/BitSet;)V
a=0;// 
a=0;//     .line 274
a=0;//     sget-object v1, Lcom/lidroid/xutils/http/client/util/URLEncodedUtils;->PATHSAFE:Ljava/util/BitSet;
a=0;// 
a=0;//     const/16 v2, 0x2f
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V
a=0;// 
a=0;//     .line 275
a=0;//     sget-object v1, Lcom/lidroid/xutils/http/client/util/URLEncodedUtils;->PATHSAFE:Ljava/util/BitSet;
a=0;// 
a=0;//     const/16 v2, 0x3b
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V
a=0;// 
a=0;//     .line 276
a=0;//     sget-object v1, Lcom/lidroid/xutils/http/client/util/URLEncodedUtils;->PATHSAFE:Ljava/util/BitSet;
a=0;// 
a=0;//     const/16 v2, 0x3a
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V
a=0;// 
a=0;//     .line 277
a=0;//     sget-object v1, Lcom/lidroid/xutils/http/client/util/URLEncodedUtils;->PATHSAFE:Ljava/util/BitSet;
a=0;// 
a=0;//     const/16 v2, 0x40
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V
a=0;// 
a=0;//     .line 278
a=0;//     sget-object v1, Lcom/lidroid/xutils/http/client/util/URLEncodedUtils;->PATHSAFE:Ljava/util/BitSet;
a=0;// 
a=0;//     invoke-virtual {v1, v4}, Ljava/util/BitSet;->set(I)V
a=0;// 
a=0;//     .line 279
a=0;//     sget-object v1, Lcom/lidroid/xutils/http/client/util/URLEncodedUtils;->PATHSAFE:Ljava/util/BitSet;
a=0;// 
a=0;//     const/16 v2, 0x3d
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V
a=0;// 
a=0;//     .line 280
a=0;//     sget-object v1, Lcom/lidroid/xutils/http/client/util/URLEncodedUtils;->PATHSAFE:Ljava/util/BitSet;
a=0;// 
a=0;//     invoke-virtual {v1, v6}, Ljava/util/BitSet;->set(I)V
a=0;// 
a=0;//     .line 281
a=0;//     sget-object v1, Lcom/lidroid/xutils/http/client/util/URLEncodedUtils;->PATHSAFE:Ljava/util/BitSet;
a=0;// 
a=0;//     invoke-virtual {v1, v5}, Ljava/util/BitSet;->set(I)V
a=0;// 
a=0;//     .line 282
a=0;//     sget-object v1, Lcom/lidroid/xutils/http/client/util/URLEncodedUtils;->PATHSAFE:Ljava/util/BitSet;
a=0;// 
a=0;//     invoke-virtual {v1, v7}, Ljava/util/BitSet;->set(I)V
a=0;// 
a=0;//     .line 284
a=0;//     sget-object v1, Lcom/lidroid/xutils/http/client/util/URLEncodedUtils;->RESERVED:Ljava/util/BitSet;
a=0;// 
a=0;//     const/16 v2, 0x3b
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V
a=0;// 
a=0;//     .line 285
a=0;//     sget-object v1, Lcom/lidroid/xutils/http/client/util/URLEncodedUtils;->RESERVED:Ljava/util/BitSet;
a=0;// 
a=0;//     const/16 v2, 0x2f
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V
a=0;// 
a=0;//     .line 286
a=0;//     sget-object v1, Lcom/lidroid/xutils/http/client/util/URLEncodedUtils;->RESERVED:Ljava/util/BitSet;
a=0;// 
a=0;//     const/16 v2, 0x3f
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V
a=0;// 
a=0;//     .line 287
a=0;//     sget-object v1, Lcom/lidroid/xutils/http/client/util/URLEncodedUtils;->RESERVED:Ljava/util/BitSet;
a=0;// 
a=0;//     const/16 v2, 0x3a
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V
a=0;// 
a=0;//     .line 288
a=0;//     sget-object v1, Lcom/lidroid/xutils/http/client/util/URLEncodedUtils;->RESERVED:Ljava/util/BitSet;
a=0;// 
a=0;//     const/16 v2, 0x40
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V
a=0;// 
a=0;//     .line 289
a=0;//     sget-object v1, Lcom/lidroid/xutils/http/client/util/URLEncodedUtils;->RESERVED:Ljava/util/BitSet;
a=0;// 
a=0;//     invoke-virtual {v1, v4}, Ljava/util/BitSet;->set(I)V
a=0;// 
a=0;//     .line 290
a=0;//     sget-object v1, Lcom/lidroid/xutils/http/client/util/URLEncodedUtils;->RESERVED:Ljava/util/BitSet;
a=0;// 
a=0;//     const/16 v2, 0x3d
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V
a=0;// 
a=0;//     .line 291
a=0;//     sget-object v1, Lcom/lidroid/xutils/http/client/util/URLEncodedUtils;->RESERVED:Ljava/util/BitSet;
a=0;// 
a=0;//     invoke-virtual {v1, v6}, Ljava/util/BitSet;->set(I)V
a=0;// 
a=0;//     .line 292
a=0;//     sget-object v1, Lcom/lidroid/xutils/http/client/util/URLEncodedUtils;->RESERVED:Ljava/util/BitSet;
a=0;// 
a=0;//     invoke-virtual {v1, v5}, Ljava/util/BitSet;->set(I)V
a=0;// 
a=0;//     .line 293
a=0;//     sget-object v1, Lcom/lidroid/xutils/http/client/util/URLEncodedUtils;->RESERVED:Ljava/util/BitSet;
a=0;// 
a=0;//     invoke-virtual {v1, v7}, Ljava/util/BitSet;->set(I)V
a=0;// 
a=0;//     .line 294
a=0;//     sget-object v1, Lcom/lidroid/xutils/http/client/util/URLEncodedUtils;->RESERVED:Ljava/util/BitSet;
a=0;// 
a=0;//     const/16 v2, 0x5b
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V
a=0;// 
a=0;//     .line 295
a=0;//     sget-object v1, Lcom/lidroid/xutils/http/client/util/URLEncodedUtils;->RESERVED:Ljava/util/BitSet;
a=0;// 
a=0;//     const/16 v2, 0x5d
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V
a=0;// 
a=0;//     .line 297
a=0;//     sget-object v1, Lcom/lidroid/xutils/http/client/util/URLEncodedUtils;->FRAGMENT:Ljava/util/BitSet;
a=0;// 
a=0;//     sget-object v2, Lcom/lidroid/xutils/http/client/util/URLEncodedUtils;->RESERVED:Ljava/util/BitSet;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/BitSet;);
a=0;//     invoke-virtual {v1, v2}, Ljava/util/BitSet;->or(Ljava/util/BitSet;)V
a=0;// 
a=0;//     .line 298
a=0;//     sget-object v1, Lcom/lidroid/xutils/http/client/util/URLEncodedUtils;->FRAGMENT:Ljava/util/BitSet;
a=0;// 
a=0;//     sget-object v2, Lcom/lidroid/xutils/http/client/util/URLEncodedUtils;->UNRESERVED:Ljava/util/BitSet;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/util/BitSet;->or(Ljava/util/BitSet;)V
a=0;// 
a=0;//     .line 40
a=0;//     return-void
a=0;// 
a=0;//     .line 241
a=0;//     :cond_0
a=0;//     #v1=(PosByte);v2=(Null);
a=0;//     sget-object v1, Lcom/lidroid/xutils/http/client/util/URLEncodedUtils;->UNRESERVED:Ljava/util/BitSet;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/BitSet;);
a=0;//     invoke-virtual {v1, v0}, Ljava/util/BitSet;->set(I)V
a=0;// 
a=0;//     .line 240
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 244
a=0;//     :cond_1
a=0;//     #v1=(PosByte);
a=0;//     sget-object v1, Lcom/lidroid/xutils/http/client/util/URLEncodedUtils;->UNRESERVED:Ljava/util/BitSet;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/BitSet;);
a=0;//     invoke-virtual {v1, v0}, Ljava/util/BitSet;->set(I)V
a=0;// 
a=0;//     .line 243
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 248
a=0;//     :cond_2
a=0;//     #v1=(PosByte);
a=0;//     sget-object v1, Lcom/lidroid/xutils/http/client/util/URLEncodedUtils;->UNRESERVED:Ljava/util/BitSet;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/BitSet;);
a=0;//     invoke-virtual {v1, v0}, Ljava/util/BitSet;->set(I)V
a=0;// 
a=0;//     .line 247
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 40
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/lidroid/xutils/http/client/util/URLEncodedUtils;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static decodeFormFields(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 2
a=0;//     .param p0, "content"    # Ljava/lang/String;
a=0;//     .param p1, "charset"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 379
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     .line 380
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 382
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     invoke-static {p1}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Reference,Ljava/nio/charset/Charset;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-static {p0, v0, v1}, Lcom/lidroid/xutils/http/client/util/URLEncodedUtils;->urldecode(Ljava/lang/String;Ljava/nio/charset/Charset;Z)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     const-string v0, "UTF-8"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private static decodeFormFields(Ljava/lang/String;Ljava/nio/charset/Charset;)Ljava/lang/String;
a=0;//     .locals 1
a=0;//     .param p0, "content"    # Ljava/lang/String;
a=0;//     .param p1, "charset"    # Ljava/nio/charset/Charset;
a=0;// 
a=0;//     .prologue
a=0;//     .line 393
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     .line 394
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 396
a=0;//     .end local p1    # "charset":Ljava/nio/charset/Charset;
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// 
a=0;//     .restart local p1    # "charset":Ljava/nio/charset/Charset;
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     .end local p1    # "charset":Ljava/nio/charset/Charset;
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-static {p0, p1, v0}, Lcom/lidroid/xutils/http/client/util/URLEncodedUtils;->urldecode(Ljava/lang/String;Ljava/nio/charset/Charset;Z)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .restart local p1    # "charset":Ljava/nio/charset/Charset;
a=0;//     :cond_1
a=0;//     #v0=(Uninit);
a=0;//     const-string v0, "UTF-8"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;
a=0;// 
a=0;//     move-result-object p1
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method static encFragment(Ljava/lang/String;Ljava/nio/charset/Charset;)Ljava/lang/String;
a=0;//     .locals 2
a=0;//     .param p0, "content"    # Ljava/lang/String;
a=0;//     .param p1, "charset"    # Ljava/nio/charset/Charset;
a=0;// 
a=0;//     .prologue
a=0;//     .line 459
a=0;//     sget-object v0, Lcom/lidroid/xutils/http/client/util/URLEncodedUtils;->FRAGMENT:Ljava/util/BitSet;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/BitSet;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {p0, p1, v0, v1}, Lcom/lidroid/xutils/http/client/util/URLEncodedUtils;->urlencode(Ljava/lang/String;Ljava/nio/charset/Charset;Ljava/util/BitSet;Z)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static encPath(Ljava/lang/String;Ljava/nio/charset/Charset;)Ljava/lang/String;
a=0;//     .locals 2
a=0;//     .param p0, "content"    # Ljava/lang/String;
a=0;//     .param p1, "charset"    # Ljava/nio/charset/Charset;
a=0;// 
a=0;//     .prologue
a=0;//     .line 472
a=0;//     sget-object v0, Lcom/lidroid/xutils/http/client/util/URLEncodedUtils;->PATHSAFE:Ljava/util/BitSet;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/BitSet;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {p0, p1, v0, v1}, Lcom/lidroid/xutils/http/client/util/URLEncodedUtils;->urlencode(Ljava/lang/String;Ljava/nio/charset/Charset;Ljava/util/BitSet;Z)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static encUserInfo(Ljava/lang/String;Ljava/nio/charset/Charset;)Ljava/lang/String;
a=0;//     .locals 2
a=0;//     .param p0, "content"    # Ljava/lang/String;
a=0;//     .param p1, "charset"    # Ljava/nio/charset/Charset;
a=0;// 
a=0;//     .prologue
a=0;//     .line 446
a=0;//     sget-object v0, Lcom/lidroid/xutils/http/client/util/URLEncodedUtils;->USERINFO:Ljava/util/BitSet;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/BitSet;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {p0, p1, v0, v1}, Lcom/lidroid/xutils/http/client/util/URLEncodedUtils;->urlencode(Ljava/lang/String;Ljava/nio/charset/Charset;Ljava/util/BitSet;Z)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private static encodeFormFields(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 3
a=0;//     .param p0, "content"    # Ljava/lang/String;
a=0;//     .param p1, "charset"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 411
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     .line 412
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 414
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     invoke-static {p1}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 415
a=0;//     :goto_1
a=0;//     #v0=(Reference,Ljava/nio/charset/Charset;);
a=0;//     sget-object v1, Lcom/lidroid/xutils/http/client/util/URLEncodedUtils;->URLENCODER:Ljava/util/BitSet;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/BitSet;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 414
a=0;//     #v2=(One);
a=0;//     invoke-static {p0, v0, v1, v2}, Lcom/lidroid/xutils/http/client/util/URLEncodedUtils;->urlencode(Ljava/lang/String;Ljava/nio/charset/Charset;Ljava/util/BitSet;Z)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 415
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);
a=0;//     const-string v0, "UTF-8"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private static encodeFormFields(Ljava/lang/String;Ljava/nio/charset/Charset;)Ljava/lang/String;
a=0;//     .locals 2
a=0;//     .param p0, "content"    # Ljava/lang/String;
a=0;//     .param p1, "charset"    # Ljava/nio/charset/Charset;
a=0;// 
a=0;//     .prologue
a=0;//     .line 430
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     .line 431
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 433
a=0;//     .end local p1    # "charset":Ljava/nio/charset/Charset;
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .restart local p1    # "charset":Ljava/nio/charset/Charset;
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     .end local p1    # "charset":Ljava/nio/charset/Charset;
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);
a=0;//     sget-object v0, Lcom/lidroid/xutils/http/client/util/URLEncodedUtils;->URLENCODER:Ljava/util/BitSet;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/BitSet;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-static {p0, p1, v0, v1}, Lcom/lidroid/xutils/http/client/util/URLEncodedUtils;->urlencode(Ljava/lang/String;Ljava/nio/charset/Charset;Ljava/util/BitSet;Z)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .restart local p1    # "charset":Ljava/nio/charset/Charset;
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     const-string v0, "UTF-8"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;
a=0;// 
a=0;//     move-result-object p1
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static format(Ljava/lang/Iterable;Ljava/nio/charset/Charset;)Ljava/lang/String;
a=0;//     .locals 6
a=0;//     .param p1, "charset"    # Ljava/nio/charset/Charset;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/Iterable",
a=0;//             "<+",
a=0;//             "Lorg/apache/http/NameValuePair;",
a=0;//             ">;",
a=0;//             "Ljava/nio/charset/Charset;",
a=0;//             ")",
a=0;//             "Ljava/lang/String;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 178
a=0;//     .local p0, "parameters":Ljava/lang/Iterable;, "Ljava/lang/Iterable<+Lorg/apache/http/NameValuePair;>;"
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     .line 179
a=0;//     .local v3, "result":Ljava/lang/StringBuilder;
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Reference,Ljava/util/Iterator;);v5=(Conflicted);
a=0;//     invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_1
a=0;// 
a=0;//     .line 191
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     return-object v4
a=0;// 
a=0;//     .line 179
a=0;//     :cond_1
a=0;//     invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Lorg/apache/http/NameValuePair;
a=0;// 
a=0;//     .line 180
a=0;//     .local v2, "parameter":Lorg/apache/http/NameValuePair;
a=0;//     invoke-interface {v2}, Lorg/apache/http/NameValuePair;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v5, p1}, Lcom/lidroid/xutils/http/client/util/URLEncodedUtils;->encodeFormFields(Ljava/lang/String;Ljava/nio/charset/Charset;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 181
a=0;//     .local v0, "encodedName":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v2}, Lorg/apache/http/NameValuePair;->getValue()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-static {v5, p1}, Lcom/lidroid/xutils/http/client/util/URLEncodedUtils;->encodeFormFields(Ljava/lang/String;Ljava/nio/charset/Charset;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 182
a=0;//     .local v1, "encodedValue":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->length()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-lez v5, :cond_2
a=0;// 
a=0;//     .line 183
a=0;//     const-string v5, "&"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 185
a=0;//     :cond_2
a=0;//     #v5=(Conflicted);
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 186
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 187
a=0;//     const-string v5, "="
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 188
a=0;//     invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static format(Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 6
a=0;//     .param p1, "charset"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/List",
a=0;//             "<+",
a=0;//             "Lorg/apache/http/NameValuePair;",
a=0;//             ">;",
a=0;//             "Ljava/lang/String;",
a=0;//             ")",
a=0;//             "Ljava/lang/String;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 151
a=0;//     .local p0, "parameters":Ljava/util/List;, "Ljava/util/List<+Lorg/apache/http/NameValuePair;>;"
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     .line 152
a=0;//     .local v3, "result":Ljava/lang/StringBuilder;
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Reference,Ljava/util/Iterator;);v5=(Conflicted);
a=0;//     invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_1
a=0;// 
a=0;//     .line 164
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     return-object v4
a=0;// 
a=0;//     .line 152
a=0;//     :cond_1
a=0;//     invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Lorg/apache/http/NameValuePair;
a=0;// 
a=0;//     .line 153
a=0;//     .local v2, "parameter":Lorg/apache/http/NameValuePair;
a=0;//     invoke-interface {v2}, Lorg/apache/http/NameValuePair;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v5, p1}, Lcom/lidroid/xutils/http/client/util/URLEncodedUtils;->encodeFormFields(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 154
a=0;//     .local v0, "encodedName":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v2}, Lorg/apache/http/NameValuePair;->getValue()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-static {v5, p1}, Lcom/lidroid/xutils/http/client/util/URLEncodedUtils;->encodeFormFields(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 155
a=0;//     .local v1, "encodedValue":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->length()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-lez v5, :cond_2
a=0;// 
a=0;//     .line 156
a=0;//     const-string v5, "&"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 158
a=0;//     :cond_2
a=0;//     #v5=(Conflicted);
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 159
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 160
a=0;//     const-string v5, "="
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 161
a=0;//     invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static isEncoded(Lorg/apache/http/HttpEntity;)Z
a=0;//     .locals 5
a=0;//     .param p0, "entity"    # Lorg/apache/http/HttpEntity;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 51
a=0;//     #v3=(Null);
a=0;//     invoke-interface {p0}, Lorg/apache/http/HttpEntity;->getContentType()Lorg/apache/http/Header;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 52
a=0;//     .local v2, "h":Lorg/apache/http/Header;
a=0;//     #v2=(Reference,Lorg/apache/http/Header;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 53
a=0;//     invoke-interface {v2}, Lorg/apache/http/Header;->getElements()[Lorg/apache/http/HeaderElement;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 54
a=0;//     .local v1, "elems":[Lorg/apache/http/HeaderElement;
a=0;//     #v1=(Reference,[Lorg/apache/http/HeaderElement;);
a=0;//     array-length v4, v1
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-lez v4, :cond_0
a=0;// 
a=0;//     .line 55
a=0;//     aget-object v3, v1, v3
a=0;// 
a=0;//     invoke-interface {v3}, Lorg/apache/http/HeaderElement;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 56
a=0;//     .local v0, "contentType":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "application/x-www-form-urlencoded"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 61
a=0;//     .end local v0    # "contentType":Ljava/lang/String;
a=0;//     .end local v1    # "elems":[Lorg/apache/http/HeaderElement;
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Boolean);v4=(Conflicted);
a=0;//     return v3
a=0;// .end method
a=0;// 
a=0;// .method public static parse(Ljava/lang/String;)Ljava/util/List;
a=0;//     .locals 8
a=0;//     .param p0, "s"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             ")",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Lorg/apache/http/NameValuePair;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 124
a=0;//     if-nez p0, :cond_1
a=0;// 
a=0;//     .line 125
a=0;//     invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 138
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Reference,Ujava/lang/Object;);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-object v2
a=0;// 
a=0;//     .line 127
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     sget-object v4, Lorg/apache/http/message/BasicHeaderValueParser;->DEFAULT:Lorg/apache/http/message/BasicHeaderValueParser;
a=0;// 
a=0;//     .line 128
a=0;//     .local v4, "parser":Lorg/apache/http/message/BasicHeaderValueParser;
a=0;//     #v4=(Reference,Lorg/apache/http/message/BasicHeaderValueParser;);
a=0;//     new-instance v0, Lorg/apache/http/util/CharArrayBuffer;
a=0;// 
a=0;//     #v0=(UninitRef,Lorg/apache/http/util/CharArrayBuffer;);
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-direct {v0, v5}, Lorg/apache/http/util/CharArrayBuffer;-><init>(I)V
a=0;// 
a=0;//     .line 129
a=0;//     .local v0, "buffer":Lorg/apache/http/util/CharArrayBuffer;
a=0;//     #v0=(Reference,Lorg/apache/http/util/CharArrayBuffer;);
a=0;//     invoke-virtual {v0, p0}, Lorg/apache/http/util/CharArrayBuffer;->append(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 130
a=0;//     new-instance v1, Lorg/apache/http/message/ParserCursor;
a=0;// 
a=0;//     #v1=(UninitRef,Lorg/apache/http/message/ParserCursor;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {v0}, Lorg/apache/http/util/CharArrayBuffer;->length()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-direct {v1, v5, v6}, Lorg/apache/http/message/ParserCursor;-><init>(II)V
a=0;// 
a=0;//     .line 131
a=0;//     .local v1, "cursor":Lorg/apache/http/message/ParserCursor;
a=0;//     #v1=(Reference,Lorg/apache/http/message/ParserCursor;);
a=0;//     new-instance v2, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 132
a=0;//     .local v2, "list":Ljava/util/List;, "Ljava/util/List<Lorg/apache/http/NameValuePair;>;"
a=0;//     :cond_2
a=0;//     :goto_0
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     invoke-virtual {v1}, Lorg/apache/http/message/ParserCursor;->atEnd()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_0
a=0;// 
a=0;//     .line 133
a=0;//     sget-object v5, Lcom/lidroid/xutils/http/client/util/URLEncodedUtils;->DELIM:[C
a=0;// 
a=0;//     #v5=(Reference,[C);
a=0;//     invoke-virtual {v4, v0, v1, v5}, Lorg/apache/http/message/BasicHeaderValueParser;->parseNameValuePair(Lorg/apache/http/util/CharArrayBuffer;Lorg/apache/http/message/ParserCursor;[C)Lorg/apache/http/NameValuePair;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 134
a=0;//     .local v3, "nvp":Lorg/apache/http/NameValuePair;
a=0;//     #v3=(Reference,Lorg/apache/http/NameValuePair;);
a=0;//     invoke-interface {v3}, Lorg/apache/http/NameValuePair;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-lez v5, :cond_2
a=0;// 
a=0;//     .line 135
a=0;//     new-instance v5, Lorg/apache/http/message/BasicNameValuePair;
a=0;// 
a=0;//     #v5=(UninitRef,Lorg/apache/http/message/BasicNameValuePair;);
a=0;//     invoke-interface {v3}, Lorg/apache/http/NameValuePair;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v3}, Lorg/apache/http/NameValuePair;->getValue()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v5, v6, v7}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Lorg/apache/http/message/BasicNameValuePair;);
a=0;//     invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static parse(Ljava/net/URI;)Ljava/util/List;
a=0;//     .locals 4
a=0;//     .param p0, "uri"    # Ljava/net/URI;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/net/URI;",
a=0;//             ")",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Lorg/apache/http/NameValuePair;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 76
a=0;//     invoke-virtual {p0}, Ljava/net/URI;->getRawQuery()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 77
a=0;//     .local v0, "query":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 78
a=0;//     new-instance v1, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 79
a=0;//     .local v1, "result":Ljava/util/List;, "Ljava/util/List<Lorg/apache/http/NameValuePair;>;"
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     new-instance v2, Ljava/util/Scanner;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/Scanner;);
a=0;//     invoke-direct {v2, v0}, Ljava/util/Scanner;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 80
a=0;//     .local v2, "scanner":Ljava/util/Scanner;
a=0;//     #v2=(Reference,Ljava/util/Scanner;);
a=0;//     invoke-static {v1, v2}, Lcom/lidroid/xutils/http/client/util/URLEncodedUtils;->parse(Ljava/util/List;Ljava/util/Scanner;)V
a=0;// 
a=0;//     .line 83
a=0;//     .end local v1    # "result":Ljava/util/List;, "Ljava/util/List<Lorg/apache/http/NameValuePair;>;"
a=0;//     .end local v2    # "scanner":Ljava/util/Scanner;
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v2=(Uninit);
a=0;//     invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/List;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static parse(Ljava/util/List;Ljava/util/Scanner;)V
a=0;//     .locals 5
a=0;//     .param p1, "scanner"    # Ljava/util/Scanner;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Lorg/apache/http/NameValuePair;",
a=0;//             ">;",
a=0;//             "Ljava/util/Scanner;",
a=0;//             ")V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 99
a=0;//     .local p0, "parameters":Ljava/util/List;, "Ljava/util/List<Lorg/apache/http/NameValuePair;>;"
a=0;//     const-string v4, "&"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v4}, Ljava/util/Scanner;->useDelimiter(Ljava/lang/String;)Ljava/util/Scanner;
a=0;// 
a=0;//     .line 100
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     invoke-virtual {p1}, Ljava/util/Scanner;->hasNext()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_0
a=0;// 
a=0;//     .line 113
a=0;//     return-void
a=0;// 
a=0;//     .line 101
a=0;//     :cond_0
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 102
a=0;//     .local v1, "name":Ljava/lang/String;
a=0;//     #v1=(Null);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 103
a=0;//     .local v3, "value":Ljava/lang/String;
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {p1}, Ljava/util/Scanner;->next()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 104
a=0;//     .local v2, "token":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "="
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v4}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 105
a=0;//     .local v0, "i":I
a=0;//     #v0=(Integer);
a=0;//     const/4 v4, -0x1
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-eq v0, v4, :cond_1
a=0;// 
a=0;//     .line 106
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v2, v4, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 107
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     add-int/lit8 v4, v0, 0x1
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v2, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 111
a=0;//     :goto_1
a=0;//     #v3=(Reference,Ljava/lang/String;);v4=(Conflicted);
a=0;//     new-instance v4, Lorg/apache/http/message/BasicNameValuePair;
a=0;// 
a=0;//     #v4=(UninitRef,Lorg/apache/http/message/BasicNameValuePair;);
a=0;//     invoke-direct {v4, v1, v3}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Lorg/apache/http/message/BasicNameValuePair;);
a=0;//     invoke-interface {p0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 109
a=0;//     :cond_1
a=0;//     #v1=(Null);v3=(Null);v4=(Byte);
a=0;//     invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private static urldecode(Ljava/lang/String;Ljava/nio/charset/Charset;Z)Ljava/lang/String;
a=0;//     .locals 12
a=0;//     .param p0, "content"    # Ljava/lang/String;
a=0;//     .param p1, "charset"    # Ljava/nio/charset/Charset;
a=0;//     .param p2, "plusAsBlank"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v11, 0x25
a=0;// 
a=0;//     #v11=(PosByte);
a=0;//     const/16 v10, 0x10
a=0;// 
a=0;//     #v10=(PosByte);
a=0;//     const/4 v9, -0x1
a=0;// 
a=0;//     .line 342
a=0;//     #v9=(Byte);
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     .line 343
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 368
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Reference,Ljava/lang/String;);v8=(Conflicted);
a=0;//     return-object v7
a=0;// 
a=0;//     .line 345
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-static {v7}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 346
a=0;//     .local v0, "bb":Ljava/nio/ByteBuffer;
a=0;//     #v0=(Reference,Ljava/nio/ByteBuffer;);
a=0;//     invoke-static {p0}, Ljava/nio/CharBuffer;->wrap(Ljava/lang/CharSequence;)Ljava/nio/CharBuffer;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 347
a=0;//     .local v2, "cb":Ljava/nio/CharBuffer;
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v2=(Reference,Ljava/nio/CharBuffer;);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v8=(Conflicted);
a=0;//     invoke-virtual {v2}, Ljava/nio/CharBuffer;->hasRemaining()Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_1
a=0;// 
a=0;//     .line 367
a=0;//     invoke-virtual {v0}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;
a=0;// 
a=0;//     .line 368
a=0;//     invoke-virtual {p1, v0}, Ljava/nio/charset/Charset;->decode(Ljava/nio/ByteBuffer;)Ljava/nio/CharBuffer;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/nio/CharBuffer;);
a=0;//     invoke-virtual {v7}, Ljava/nio/CharBuffer;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 348
a=0;//     :cond_1
a=0;//     #v7=(Boolean);
a=0;//     invoke-virtual {v2}, Ljava/nio/CharBuffer;->get()C
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 349
a=0;//     .local v1, "c":C
a=0;//     #v1=(Char);
a=0;//     if-ne v1, v11, :cond_3
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/nio/CharBuffer;->remaining()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     const/4 v8, 0x2
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     if-lt v7, v8, :cond_3
a=0;// 
a=0;//     .line 350
a=0;//     invoke-virtual {v2}, Ljava/nio/CharBuffer;->get()C
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 351
a=0;//     .local v6, "uc":C
a=0;//     #v6=(Char);
a=0;//     invoke-virtual {v2}, Ljava/nio/CharBuffer;->get()C
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 352
a=0;//     .local v4, "lc":C
a=0;//     #v4=(Char);
a=0;//     invoke-static {v6, v10}, Ljava/lang/Character;->digit(CI)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 353
a=0;//     .local v5, "u":I
a=0;//     #v5=(Integer);
a=0;//     invoke-static {v4, v10}, Ljava/lang/Character;->digit(CI)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 354
a=0;//     .local v3, "l":I
a=0;//     #v3=(Integer);
a=0;//     if-eq v5, v9, :cond_2
a=0;// 
a=0;//     if-eq v3, v9, :cond_2
a=0;// 
a=0;//     .line 355
a=0;//     shl-int/lit8 v7, v5, 0x4
a=0;// 
a=0;//     add-int/2addr v7, v3
a=0;// 
a=0;//     int-to-byte v7, v7
a=0;// 
a=0;//     #v7=(Byte);
a=0;//     invoke-virtual {v0, v7}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 357
a=0;//     :cond_2
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v0, v11}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     .line 358
a=0;//     int-to-byte v7, v6
a=0;// 
a=0;//     #v7=(Byte);
a=0;//     invoke-virtual {v0, v7}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     .line 359
a=0;//     int-to-byte v7, v4
a=0;// 
a=0;//     invoke-virtual {v0, v7}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 361
a=0;//     .end local v3    # "l":I
a=0;//     .end local v4    # "lc":C
a=0;//     .end local v5    # "u":I
a=0;//     .end local v6    # "uc":C
a=0;//     :cond_3
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Integer);v8=(Conflicted);
a=0;//     if-eqz p2, :cond_4
a=0;// 
a=0;//     const/16 v7, 0x2b
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     if-ne v1, v7, :cond_4
a=0;// 
a=0;//     .line 362
a=0;//     const/16 v7, 0x20
a=0;// 
a=0;//     invoke-virtual {v0, v7}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 364
a=0;//     :cond_4
a=0;//     #v7=(Integer);
a=0;//     int-to-byte v7, v1
a=0;// 
a=0;//     #v7=(Byte);
a=0;//     invoke-virtual {v0, v7}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private static urlencode(Ljava/lang/String;Ljava/nio/charset/Charset;Ljava/util/BitSet;Z)Ljava/lang/String;
a=0;//     .locals 7
a=0;//     .param p0, "content"    # Ljava/lang/String;
a=0;//     .param p1, "charset"    # Ljava/nio/charset/Charset;
a=0;//     .param p2, "safechars"    # Ljava/util/BitSet;
a=0;//     .param p3, "blankAsPlus"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v6, 0x10
a=0;// 
a=0;//     .line 308
a=0;//     #v6=(PosByte);
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     .line 309
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 327
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Reference,Ljava/lang/String;);
a=0;//     return-object v5
a=0;// 
a=0;//     .line 311
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     .line 312
a=0;//     .local v2, "buf":Ljava/lang/StringBuilder;
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p1, p0}, Ljava/nio/charset/Charset;->encode(Ljava/lang/String;)Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 313
a=0;//     .local v1, "bb":Ljava/nio/ByteBuffer;
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/nio/ByteBuffer;);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     invoke-virtual {v1}, Ljava/nio/ByteBuffer;->hasRemaining()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_1
a=0;// 
a=0;//     .line 327
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 314
a=0;//     :cond_1
a=0;//     #v5=(Boolean);
a=0;//     invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     and-int/lit16 v0, v5, 0xff
a=0;// 
a=0;//     .line 315
a=0;//     .local v0, "b":I
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p2, v0}, Ljava/util/BitSet;->get(I)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_2
a=0;// 
a=0;//     .line 316
a=0;//     int-to-char v5, v0
a=0;// 
a=0;//     #v5=(Char);
a=0;//     invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 317
a=0;//     :cond_2
a=0;//     #v5=(Boolean);
a=0;//     if-eqz p3, :cond_3
a=0;// 
a=0;//     const/16 v5, 0x20
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     if-ne v0, v5, :cond_3
a=0;// 
a=0;//     .line 318
a=0;//     const/16 v5, 0x2b
a=0;// 
a=0;//     invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 320
a=0;//     :cond_3
a=0;//     const-string v5, "%"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 321
a=0;//     shr-int/lit8 v5, v0, 0x4
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     and-int/lit8 v5, v5, 0xf
a=0;// 
a=0;//     invoke-static {v5, v6}, Ljava/lang/Character;->forDigit(II)C
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Char);
a=0;//     invoke-static {v5}, Ljava/lang/Character;->toUpperCase(C)C
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 322
a=0;//     .local v3, "hex1":C
a=0;//     #v3=(Char);
a=0;//     and-int/lit8 v5, v0, 0xf
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-static {v5, v6}, Ljava/lang/Character;->forDigit(II)C
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Char);
a=0;//     invoke-static {v5}, Ljava/lang/Character;->toUpperCase(C)C
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 323
a=0;//     .local v4, "hex2":C
a=0;//     #v4=(Char);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 324
a=0;//     invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
}}
