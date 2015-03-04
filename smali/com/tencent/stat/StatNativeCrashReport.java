package com.tencent.stat; class StatNativeCrashReport { void a() { int a;
a=0;// .class public Lcom/tencent/stat/StatNativeCrashReport;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final PRE_TAG_TOMBSTONE_FNAME:Ljava/lang/String; = "tombstone_"
a=0;// 
a=0;// .field static a:Lcom/tencent/stat/StatNativeCrashReport;
a=0;// 
a=0;// .field private static b:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;// .field private static d:Z
a=0;// 
a=0;// .field private static e:Z
a=0;// 
a=0;// .field private static f:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private volatile c:Z
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 2
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {}, Lcom/tencent/stat/common/k;->b()Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     sput-object v0, Lcom/tencent/stat/StatNativeCrashReport;->b:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     new-instance v0, Lcom/tencent/stat/StatNativeCrashReport;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/stat/StatNativeCrashReport;);
a=0;//     invoke-direct {v0}, Lcom/tencent/stat/StatNativeCrashReport;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/StatNativeCrashReport;);
a=0;//     sput-object v0, Lcom/tencent/stat/StatNativeCrashReport;->a:Lcom/tencent/stat/StatNativeCrashReport;
a=0;// 
a=0;//     sput-boolean v1, Lcom/tencent/stat/StatNativeCrashReport;->d:Z
a=0;// 
a=0;//     sput-boolean v1, Lcom/tencent/stat/StatNativeCrashReport;->e:Z
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput-object v0, Lcom/tencent/stat/StatNativeCrashReport;->f:Ljava/lang/String;
a=0;// 
a=0;//     :try_start_0
a=0;//     const-string v0, "MtaNativeCrash"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     #v1=(Null);
a=0;//     move-exception v0
a=0;// 
a=0;//     sput-boolean v1, Lcom/tencent/stat/StatNativeCrashReport;->d:Z
a=0;// 
a=0;//     sget-object v1, Lcom/tencent/stat/StatNativeCrashReport;->b:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     invoke-virtual {v1, v0}, Lcom/tencent/stat/common/StatLogger;->w(Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/stat/StatNativeCrashReport;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/tencent/stat/StatNativeCrashReport;->c:Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static a(Ljava/io/File;)Ljava/lang/String;
a=0;//     .locals 3
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     :try_start_0
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     new-instance v0, Ljava/io/BufferedReader;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/BufferedReader;);
a=0;//     new-instance v2, Ljava/io/FileReader;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/FileReader;);
a=0;//     invoke-direct {v2, p0}, Ljava/io/FileReader;-><init>(Ljava/io/File;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/FileReader;);
a=0;//     invoke-direct {v0, v2}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/io/BufferedReader;);v2=(Conflicted);
a=0;//     invoke-virtual {v0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const/16 v2, 0xa
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     sget-object v2, Lcom/tencent/stat/StatNativeCrashReport;->b:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     invoke-virtual {v2, v0}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Exception;)V
a=0;// 
a=0;//     :goto_1
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     :try_start_1
a=0;//     invoke-virtual {v0}, Ljava/io/BufferedReader;->close()V
a=0;//     :try_end_1
a=0;//     .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method static a(Landroid/content/Context;)Ljava/util/LinkedHashSet;
a=0;//     .locals 8
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Landroid/content/Context;",
a=0;//             ")",
a=0;//             "Ljava/util/LinkedHashSet",
a=0;//             "<",
a=0;//             "Ljava/io/File;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     new-instance v1, Ljava/util/LinkedHashSet;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/LinkedHashSet;);
a=0;//     invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/LinkedHashSet;);
a=0;//     invoke-static {p0}, Lcom/tencent/stat/StatNativeCrashReport;->getTombstonesDir(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     new-instance v2, Ljava/io/File;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/io/File;->isDirectory()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/io/File;->listFiles()[Ljava/io/File;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     array-length v3, v2
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     if-ge v0, v3, :cond_1
a=0;// 
a=0;//     aget-object v4, v2, v0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const-string v6, "tombstone_"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_0
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/io/File;->isFile()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     if-eqz v5, :cond_0
a=0;// 
a=0;//     sget-object v5, Lcom/tencent/stat/StatNativeCrashReport;->b:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v5=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "get tombstone file:"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/String;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Lcom/tencent/stat/common/StatLogger;->d(Ljava/lang/Object;)V
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/io/File;->getAbsoluteFile()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v1, v4}, Ljava/util/LinkedHashSet;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     :cond_0
a=0;//     #v5=(Conflicted);v7=(Conflicted);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v6=(Conflicted);
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method static b(Ljava/io/File;)J
a=0;//     .locals 4
a=0;// 
a=0;//     invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "tombstone_"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, ""
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-static {v2}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/Long;->longValue()J
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v3=(Conflicted);
a=0;//     return-wide v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v3=(Uninit);
a=0;//     move-exception v2
a=0;// 
a=0;//     sget-object v3, Lcom/tencent/stat/StatNativeCrashReport;->b:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v3=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     invoke-virtual {v3, v2}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Exception;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static doNativeCrashTest()V
a=0;//     .locals 1
a=0;// 
a=0;//     sget-object v0, Lcom/tencent/stat/StatNativeCrashReport;->a:Lcom/tencent/stat/StatNativeCrashReport;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/StatNativeCrashReport;);
a=0;//     invoke-virtual {v0}, Lcom/tencent/stat/StatNativeCrashReport;->makeJniCrash()Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static getTombstonesDir(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     sget-object v0, Lcom/tencent/stat/StatNativeCrashReport;->f:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const-string v0, "__mta_tombstone__"
a=0;// 
a=0;//     const-string v1, ""
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v0, v1}, Lcom/tencent/stat/common/p;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/tencent/stat/StatNativeCrashReport;->f:Ljava/lang/String;
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     sget-object v0, Lcom/tencent/stat/StatNativeCrashReport;->f:Ljava/lang/String;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static initNativeCrash(Landroid/content/Context;Ljava/lang/String;)V
a=0;//     .locals 3
a=0;// 
a=0;//     sget-object v0, Lcom/tencent/stat/StatNativeCrashReport;->a:Lcom/tencent/stat/StatNativeCrashReport;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/StatNativeCrashReport;);
a=0;//     iget-boolean v0, v0, Lcom/tencent/stat/StatNativeCrashReport;->c:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     :try_start_0
a=0;//     const-string v0, "tombstones"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getDir(Ljava/lang/String;I)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object p1
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     invoke-virtual {p1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0x80
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     if-le v0, v1, :cond_2
a=0;// 
a=0;//     sget-object v0, Lcom/tencent/stat/StatNativeCrashReport;->b:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "The length of tombstones dir: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " can\'t exceeds 200 bytes."
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     sget-object v1, Lcom/tencent/stat/StatNativeCrashReport;->b:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     invoke-virtual {v1, v0}, Lcom/tencent/stat/common/StatLogger;->w(Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     :try_start_1
a=0;//     #v0=(Integer);v1=(PosShort);v2=(Uninit);
a=0;//     sput-object p1, Lcom/tencent/stat/StatNativeCrashReport;->f:Ljava/lang/String;
a=0;// 
a=0;//     const-string v0, "__mta_tombstone__"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v0, p1}, Lcom/tencent/stat/common/p;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-static {v0}, Lcom/tencent/stat/StatNativeCrashReport;->setNativeCrashEnable(Z)V
a=0;// 
a=0;//     sget-object v0, Lcom/tencent/stat/StatNativeCrashReport;->a:Lcom/tencent/stat/StatNativeCrashReport;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/StatNativeCrashReport;);
a=0;//     invoke-virtual {v0, p1}, Lcom/tencent/stat/StatNativeCrashReport;->initJNICrash(Ljava/lang/String;)Z
a=0;// 
a=0;//     sget-object v0, Lcom/tencent/stat/StatNativeCrashReport;->a:Lcom/tencent/stat/StatNativeCrashReport;
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     iput-boolean v1, v0, Lcom/tencent/stat/StatNativeCrashReport;->c:Z
a=0;// 
a=0;//     sget-object v0, Lcom/tencent/stat/StatNativeCrashReport;->b:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     const-string v1, "initNativeCrash success."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->d(Ljava/lang/Object;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static isNativeCrashDebugEnable()Z
a=0;//     .locals 1
a=0;// 
a=0;//     sget-boolean v0, Lcom/tencent/stat/StatNativeCrashReport;->e:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static isNativeCrashEnable()Z
a=0;//     .locals 1
a=0;// 
a=0;//     sget-boolean v0, Lcom/tencent/stat/StatNativeCrashReport;->d:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static onNativeCrashHappened()Ljava/lang/String;
a=0;//     .locals 3
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     :try_start_0
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     const-string v2, "MTA has caught a native crash, java stack:\n"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/RuntimeException;);
a=0;//     invoke-virtual {v1}, Ljava/lang/RuntimeException;->printStackTrace()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/RuntimeException;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static setNativeCrashDebugEnable(Z)V
a=0;//     .locals 2
a=0;// 
a=0;//     :try_start_0
a=0;//     sget-object v0, Lcom/tencent/stat/StatNativeCrashReport;->a:Lcom/tencent/stat/StatNativeCrashReport;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/StatNativeCrashReport;);
a=0;//     invoke-virtual {v0, p0}, Lcom/tencent/stat/StatNativeCrashReport;->enableNativeCrashDebug(Z)V
a=0;// 
a=0;//     sput-boolean p0, Lcom/tencent/stat/StatNativeCrashReport;->e:Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     sget-object v1, Lcom/tencent/stat/StatNativeCrashReport;->b:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     invoke-virtual {v1, v0}, Lcom/tencent/stat/common/StatLogger;->w(Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static setNativeCrashEnable(Z)V
a=0;//     .locals 2
a=0;// 
a=0;//     :try_start_0
a=0;//     sget-object v0, Lcom/tencent/stat/StatNativeCrashReport;->a:Lcom/tencent/stat/StatNativeCrashReport;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/StatNativeCrashReport;);
a=0;//     invoke-virtual {v0, p0}, Lcom/tencent/stat/StatNativeCrashReport;->enableNativeCrash(Z)V
a=0;// 
a=0;//     sput-boolean p0, Lcom/tencent/stat/StatNativeCrashReport;->d:Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     sget-object v1, Lcom/tencent/stat/StatNativeCrashReport;->b:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     invoke-virtual {v1, v0}, Lcom/tencent/stat/common/StatLogger;->w(Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public native enableNativeCrash(Z)V
a=0;// .end method
a=0;// 
a=0;// .method public native enableNativeCrashDebug(Z)V
a=0;// .end method
a=0;// 
a=0;// .method public native initJNICrash(Ljava/lang/String;)Z
a=0;// .end method
a=0;// 
a=0;// .method public native makeJniCrash()Ljava/lang/String;
a=0;// .end method
a=0;// 
a=0;// .method public native stringFromJNI()Ljava/lang/String;
a=0;// .end method
}}
