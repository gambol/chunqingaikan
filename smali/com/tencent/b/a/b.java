package com.tencent.b.a; class b { void a() { int a;
a=0;// .class public Lcom/tencent/b/a/b;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ProGuard"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static a:Ljava/text/SimpleDateFormat;
a=0;// 
a=0;// .field private static b:Ljava/io/FileFilter;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private c:Ljava/lang/String;
a=0;// 
a=0;// .field private d:I
a=0;// 
a=0;// .field private e:I
a=0;// 
a=0;// .field private f:I
a=0;// 
a=0;// .field private g:J
a=0;// 
a=0;// .field private h:Ljava/io/File;
a=0;// 
a=0;// .field private i:I
a=0;// 
a=0;// .field private j:Ljava/lang/String;
a=0;// 
a=0;// .field private k:J
a=0;// 
a=0;// .field private l:Ljava/io/FileFilter;
a=0;// 
a=0;// .field private m:Ljava/util/Comparator;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/Comparator",
a=0;//             "<-",
a=0;//             "Ljava/io/File;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 94
a=0;//     const-string v0, "yyyy-MM-dd"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/tencent/b/c/b;->a(Ljava/lang/String;)Ljava/text/SimpleDateFormat;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/tencent/b/a/b;->a:Ljava/text/SimpleDateFormat;
a=0;// 
a=0;//     .line 96
a=0;//     new-instance v0, Lcom/tencent/b/a/b$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/b/a/b$1;);
a=0;//     invoke-direct {v0}, Lcom/tencent/b/a/b$1;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/b/a/b$1;);
a=0;//     sput-object v0, Lcom/tencent/b/a/b;->b:Ljava/io/FileFilter;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Ljava/io/File;IIILjava/lang/String;JILjava/lang/String;J)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const v1, 0x7fffffff
a=0;// 
a=0;//     .line 203
a=0;//     #v1=(Integer);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 123
a=0;//     #p0=(Reference,Lcom/tencent/b/a/b;);
a=0;//     const-string v0, "Tracer.File"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/tencent/b/a/b;->c:Ljava/lang/String;
a=0;// 
a=0;//     .line 124
a=0;//     iput v1, p0, Lcom/tencent/b/a/b;->d:I
a=0;// 
a=0;//     .line 125
a=0;//     iput v1, p0, Lcom/tencent/b/a/b;->e:I
a=0;// 
a=0;//     .line 126
a=0;//     const/16 v0, 0x1000
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     iput v0, p0, Lcom/tencent/b/a/b;->f:I
a=0;// 
a=0;//     .line 127
a=0;//     const-wide/16 v0, 0x2710
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iput-wide v0, p0, Lcom/tencent/b/a/b;->g:J
a=0;// 
a=0;//     .line 129
a=0;//     const/16 v0, 0xa
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     iput v0, p0, Lcom/tencent/b/a/b;->i:I
a=0;// 
a=0;//     .line 130
a=0;//     const-string v0, ".log"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/tencent/b/a/b;->j:Ljava/lang/String;
a=0;// 
a=0;//     .line 131
a=0;//     const-wide v0, 0x7fffffffffffffffL
a=0;// 
a=0;//     #v0=(LongLo);
a=0;//     iput-wide v0, p0, Lcom/tencent/b/a/b;->k:J
a=0;// 
a=0;//     .line 133
a=0;//     new-instance v0, Lcom/tencent/b/a/b$2;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/b/a/b$2;);
a=0;//     invoke-direct {v0, p0}, Lcom/tencent/b/a/b$2;-><init>(Lcom/tencent/b/a/b;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/b/a/b$2;);
a=0;//     iput-object v0, p0, Lcom/tencent/b/a/b;->l:Ljava/io/FileFilter;
a=0;// 
a=0;//     .line 156
a=0;//     new-instance v0, Lcom/tencent/b/a/b$3;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/b/a/b$3;);
a=0;//     invoke-direct {v0, p0}, Lcom/tencent/b/a/b$3;-><init>(Lcom/tencent/b/a/b;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/b/a/b$3;);
a=0;//     iput-object v0, p0, Lcom/tencent/b/a/b;->m:Ljava/util/Comparator;
a=0;// 
a=0;//     .line 204
a=0;//     invoke-virtual {p0, p1}, Lcom/tencent/b/a/b;->c(Ljava/io/File;)V
a=0;// 
a=0;//     .line 205
a=0;//     invoke-virtual {p0, p2}, Lcom/tencent/b/a/b;->b(I)V
a=0;// 
a=0;//     .line 206
a=0;//     invoke-virtual {p0, p3}, Lcom/tencent/b/a/b;->a(I)V
a=0;// 
a=0;//     .line 207
a=0;//     invoke-virtual {p0, p4}, Lcom/tencent/b/a/b;->c(I)V
a=0;// 
a=0;//     .line 208
a=0;//     invoke-virtual {p0, p5}, Lcom/tencent/b/a/b;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 209
a=0;//     invoke-virtual {p0, p6, p7}, Lcom/tencent/b/a/b;->b(J)V
a=0;// 
a=0;//     .line 210
a=0;//     invoke-virtual {p0, p8}, Lcom/tencent/b/a/b;->d(I)V
a=0;// 
a=0;//     .line 211
a=0;//     invoke-virtual {p0, p9}, Lcom/tencent/b/a/b;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 212
a=0;//     invoke-virtual {p0, p10, p11}, Lcom/tencent/b/a/b;->c(J)V
a=0;// 
a=0;//     .line 213
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static a(Ljava/io/File;)J
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 115
a=0;//     :try_start_0
a=0;//     sget-object v0, Lcom/tencent/b/a/b;->a:Ljava/text/SimpleDateFormat;
a=0;// 
a=0;//     #v0=(Reference,Ljava/text/SimpleDateFormat;);
a=0;//     invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/Date;->getTime()J
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     .line 119
a=0;//     :goto_0
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// 
a=0;//     .line 117
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 119
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     const-wide/16 v0, -0x1
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic d(Ljava/io/File;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 42
a=0;//     invoke-static {p0}, Lcom/tencent/b/a/b;->f(Ljava/io/File;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method private d(J)Ljava/io/File;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 234
a=0;//     invoke-virtual {p0, p1, p2}, Lcom/tencent/b/a/b;->a(J)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 236
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-direct {p0, v0}, Lcom/tencent/b/a/b;->e(Ljava/io/File;)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private e(Ljava/io/File;)Ljava/io/File;
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 267
a=0;//     invoke-virtual {p0, p1}, Lcom/tencent/b/a/b;->b(Ljava/io/File;)[Ljava/io/File;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 270
a=0;//     #v3=(Reference,[Ljava/io/File;);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     array-length v0, v3
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 272
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     new-instance v1, Ljava/io/File;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/File;);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "1"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/tencent/b/a/b;->j()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v1, p1, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 297
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/io/File;);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 275
a=0;//     :cond_2
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     invoke-virtual {p0, v3}, Lcom/tencent/b/a/b;->a([Ljava/io/File;)[Ljava/io/File;
a=0;// 
a=0;//     .line 277
a=0;//     array-length v0, v3
a=0;// 
a=0;//     add-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     aget-object v1, v3, v0
a=0;// 
a=0;//     .line 279
a=0;//     #v1=(Null);
a=0;//     array-length v0, v3
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/tencent/b/a/b;->e()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     sub-int/2addr v0, v2
a=0;// 
a=0;//     .line 281
a=0;//     invoke-virtual {v1}, Ljava/io/File;->length()J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     long-to-int v2, v4
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/tencent/b/a/b;->d()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-le v2, v4, :cond_3
a=0;// 
a=0;//     .line 284
a=0;//     invoke-static {v1}, Lcom/tencent/b/a/b;->f(Ljava/io/File;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v2, v1, 0x1
a=0;// 
a=0;//     .line 285
a=0;//     new-instance v1, Ljava/io/File;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/File;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p0}, Lcom/tencent/b/a/b;->j()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, p1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 287
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     .line 291
a=0;//     :cond_3
a=0;//     #v2=(Conflicted);v4=(Conflicted);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Integer);
a=0;//     if-ge v2, v0, :cond_1
a=0;// 
a=0;//     .line 293
a=0;//     aget-object v4, v3, v2
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v4}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     .line 291
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static f(Ljava/io/File;)I
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 407
a=0;//     :try_start_0
a=0;//     invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 409
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/16 v1, 0x2e
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 411
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 413
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 418
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 415
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 418
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a()Ljava/io/File;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 222
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-direct {p0, v0, v1}, Lcom/tencent/b/a/b;->d(J)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public a(J)Ljava/io/File;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 248
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     invoke-virtual {p0}, Lcom/tencent/b/a/b;->h()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     sget-object v2, Lcom/tencent/b/a/b;->a:Ljava/text/SimpleDateFormat;
a=0;// 
a=0;//     #v2=(Reference,Ljava/text/SimpleDateFormat;);
a=0;//     invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Long;);
a=0;//     invoke-virtual {v2, v3}, Ljava/text/SimpleDateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 250
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z
a=0;// 
a=0;//     .line 252
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public a(I)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 461
a=0;//     iput p1, p0, Lcom/tencent/b/a/b;->d:I
a=0;// 
a=0;//     .line 462
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public a(Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 440
a=0;//     iput-object p1, p0, Lcom/tencent/b/a/b;->c:Ljava/lang/String;
a=0;// 
a=0;//     .line 441
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public a([Ljava/io/File;)[Ljava/io/File;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 391
a=0;//     iget-object v0, p0, Lcom/tencent/b/a/b;->m:Ljava/util/Comparator;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Comparator;);
a=0;//     invoke-static {p1, v0}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V
a=0;// 
a=0;//     .line 393
a=0;//     return-object p1
a=0;// .end method
a=0;// 
a=0;// .method public b()V
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     .line 317
a=0;//     invoke-virtual {p0}, Lcom/tencent/b/a/b;->h()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 338
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 322
a=0;//     :cond_1
a=0;//     #v0=(Reference,Ljava/io/File;);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     invoke-virtual {p0}, Lcom/tencent/b/a/b;->h()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget-object v1, Lcom/tencent/b/a/b;->b:Ljava/io/FileFilter;
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/FileFilter;);
a=0;//     invoke-virtual {v0, v1}, Ljava/io/File;->listFiles(Ljava/io/FileFilter;)[Ljava/io/File;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 324
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 329
a=0;//     array-length v2, v1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     if-ge v0, v2, :cond_0
a=0;// 
a=0;//     aget-object v3, v1, v0
a=0;// 
a=0;//     .line 331
a=0;//     #v3=(Null);
a=0;//     invoke-static {v3}, Lcom/tencent/b/a/b;->a(Ljava/io/File;)J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     .line 333
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v6
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     sub-long v4, v6, v4
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/tencent/b/a/b;->k()J
a=0;// 
a=0;//     move-result-wide v6
a=0;// 
a=0;//     cmp-long v4, v4, v6
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-lez v4, :cond_2
a=0;// 
a=0;//     .line 335
a=0;//     invoke-static {v3}, Lcom/tencent/b/c/a;->a(Ljava/io/File;)Z
a=0;// 
a=0;//     .line 329
a=0;//     :cond_2
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public b(I)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 482
a=0;//     iput p1, p0, Lcom/tencent/b/a/b;->e:I
a=0;// 
a=0;//     .line 483
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public b(J)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 519
a=0;//     iput-wide p1, p0, Lcom/tencent/b/a/b;->g:J
a=0;// 
a=0;//     .line 520
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public b(Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 582
a=0;//     iput-object p1, p0, Lcom/tencent/b/a/b;->j:Ljava/lang/String;
a=0;// 
a=0;//     .line 583
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public b(Ljava/io/File;)[Ljava/io/File;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 309
a=0;//     iget-object v0, p0, Lcom/tencent/b/a/b;->l:Ljava/io/FileFilter;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/FileFilter;);
a=0;//     invoke-virtual {p1, v0}, Ljava/io/File;->listFiles(Ljava/io/FileFilter;)[Ljava/io/File;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public c()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 429
a=0;//     iget-object v0, p0, Lcom/tencent/b/a/b;->c:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public c(I)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 498
a=0;//     iput p1, p0, Lcom/tencent/b/a/b;->f:I
a=0;// 
a=0;//     .line 499
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public c(J)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 602
a=0;//     iput-wide p1, p0, Lcom/tencent/b/a/b;->k:J
a=0;// 
a=0;//     .line 603
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public c(Ljava/io/File;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 540
a=0;//     iput-object p1, p0, Lcom/tencent/b/a/b;->h:Ljava/io/File;
a=0;// 
a=0;//     .line 541
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public d()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 450
a=0;//     iget v0, p0, Lcom/tencent/b/a/b;->d:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public d(I)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 561
a=0;//     iput p1, p0, Lcom/tencent/b/a/b;->i:I
a=0;// 
a=0;//     .line 562
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public e()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 471
a=0;//     iget v0, p0, Lcom/tencent/b/a/b;->e:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public f()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 487
a=0;//     iget v0, p0, Lcom/tencent/b/a/b;->f:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public g()J
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 508
a=0;//     iget-wide v0, p0, Lcom/tencent/b/a/b;->g:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public h()Ljava/io/File;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 529
a=0;//     iget-object v0, p0, Lcom/tencent/b/a/b;->h:Ljava/io/File;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public i()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 550
a=0;//     iget v0, p0, Lcom/tencent/b/a/b;->i:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public j()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 571
a=0;//     iget-object v0, p0, Lcom/tencent/b/a/b;->j:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public k()J
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 592
a=0;//     iget-wide v0, p0, Lcom/tencent/b/a/b;->k:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
}}
