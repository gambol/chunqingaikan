package com.j256.ormlite.logger; class LocalLog { void a() { int a;
a=0;// .class public Lcom/j256/ormlite/logger/LocalLog;
a=0;// .super Ljava/lang/Object;
a=0;// .source "LocalLog.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/j256/ormlite/logger/Log;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/j256/ormlite/logger/LocalLog$PatternLevel;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final DEFAULT_LEVEL:Lcom/j256/ormlite/logger/Log$Level;
a=0;// 
a=0;// .field public static final LOCAL_LOG_FILE_PROPERTY:Ljava/lang/String; = "com.j256.ormlite.logger.file"
a=0;// 
a=0;// .field public static final LOCAL_LOG_LEVEL_PROPERTY:Ljava/lang/String; = "com.j256.ormlite.logger.level"
a=0;// 
a=0;// .field public static final LOCAL_LOG_PROPERTIES_FILE:Ljava/lang/String; = "/ormliteLocalLog.properties"
a=0;// 
a=0;// .field private static final classLevels:Ljava/util/List;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Lcom/j256/ormlite/logger/LocalLog$PatternLevel;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private static final dateFormatThreadLocal:Ljava/lang/ThreadLocal;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/lang/ThreadLocal",
a=0;//             "<",
a=0;//             "Ljava/text/DateFormat;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private static printStream:Ljava/io/PrintStream;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final className:Ljava/lang/String;
a=0;// 
a=0;// .field private final level:Lcom/j256/ormlite/logger/Log$Level;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 47
a=0;//     sget-object v3, Lcom/j256/ormlite/logger/Log$Level;->DEBUG:Lcom/j256/ormlite/logger/Log$Level;
a=0;// 
a=0;//     #v3=(Reference,Lcom/j256/ormlite/logger/Log$Level;);
a=0;//     sput-object v3, Lcom/j256/ormlite/logger/LocalLog;->DEFAULT_LEVEL:Lcom/j256/ormlite/logger/Log$Level;
a=0;// 
a=0;//     .line 48
a=0;//     new-instance v3, Lcom/j256/ormlite/logger/LocalLog$1;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/j256/ormlite/logger/LocalLog$1;);
a=0;//     invoke-direct {v3}, Lcom/j256/ormlite/logger/LocalLog$1;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Lcom/j256/ormlite/logger/LocalLog$1;);
a=0;//     sput-object v3, Lcom/j256/ormlite/logger/LocalLog;->dateFormatThreadLocal:Ljava/lang/ThreadLocal;
a=0;// 
a=0;//     .line 61
a=0;//     const-class v3, Lcom/j256/ormlite/logger/LocalLog;
a=0;// 
a=0;//     const-string v4, "/ormliteLocalLog.properties"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/Class;->getResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 62
a=0;//     .local v2, "stream":Ljava/io/InputStream;
a=0;//     #v2=(Reference,Ljava/io/InputStream;);
a=0;//     invoke-static {v2}, Lcom/j256/ormlite/logger/LocalLog;->readLevelResourceFile(Ljava/io/InputStream;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 63
a=0;//     .local v0, "levels":Ljava/util/List;, "Ljava/util/List<Lcom/j256/ormlite/logger/LocalLog$PatternLevel;>;"
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     sput-object v0, Lcom/j256/ormlite/logger/LocalLog;->classLevels:Ljava/util/List;
a=0;// 
a=0;//     .line 69
a=0;//     const-string v3, "com.j256.ormlite.logger.file"
a=0;// 
a=0;//     invoke-static {v3}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 70
a=0;//     .local v1, "logPath":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1}, Lcom/j256/ormlite/logger/LocalLog;->openLogFile(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 71
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Ljava/lang/String;)V
a=0;//     .locals 9
a=0;//     .param p1, "className"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 73
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 75
a=0;//     #p0=(Reference,Lcom/j256/ormlite/logger/LocalLog;);
a=0;//     invoke-static {p1}, Lcom/j256/ormlite/logger/LoggerFactory;->getSimpleClassName(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     iput-object v6, p0, Lcom/j256/ormlite/logger/LocalLog;->className:Ljava/lang/String;
a=0;// 
a=0;//     .line 77
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 78
a=0;//     .local v2, "level":Lcom/j256/ormlite/logger/Log$Level;
a=0;//     #v2=(Null);
a=0;//     sget-object v6, Lcom/j256/ormlite/logger/LocalLog;->classLevels:Ljava/util/List;
a=0;// 
a=0;//     if-eqz v6, :cond_2
a=0;// 
a=0;//     .line 79
a=0;//     sget-object v6, Lcom/j256/ormlite/logger/LocalLog;->classLevels:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .local v1, "i$":Ljava/util/Iterator;
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Reference,Ljava/util/Iterator;);v2=(Reference,Lcom/j256/ormlite/logger/Log$Level;);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_2
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v5, Lcom/j256/ormlite/logger/LocalLog$PatternLevel;
a=0;// 
a=0;//     .line 80
a=0;//     .local v5, "patternLevel":Lcom/j256/ormlite/logger/LocalLog$PatternLevel;
a=0;//     iget-object v6, v5, Lcom/j256/ormlite/logger/LocalLog$PatternLevel;->pattern:Ljava/util/regex/Pattern;
a=0;// 
a=0;//     #v6=(Reference,Ljava/util/regex/Pattern;);
a=0;//     invoke-virtual {v6, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/util/regex/Matcher;->matches()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_0
a=0;// 
a=0;//     .line 82
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     iget-object v6, v5, Lcom/j256/ormlite/logger/LocalLog$PatternLevel;->level:Lcom/j256/ormlite/logger/Log$Level;
a=0;// 
a=0;//     #v6=(Reference,Lcom/j256/ormlite/logger/Log$Level;);
a=0;//     invoke-virtual {v6}, Lcom/j256/ormlite/logger/Log$Level;->ordinal()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v2}, Lcom/j256/ormlite/logger/Log$Level;->ordinal()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     if-ge v6, v7, :cond_0
a=0;// 
a=0;//     .line 83
a=0;//     :cond_1
a=0;//     #v7=(Conflicted);
a=0;//     iget-object v2, v5, Lcom/j256/ormlite/logger/LocalLog$PatternLevel;->level:Lcom/j256/ormlite/logger/Log$Level;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 89
a=0;//     .end local v1    # "i$":Ljava/util/Iterator;
a=0;//     .end local v5    # "patternLevel":Lcom/j256/ormlite/logger/LocalLog$PatternLevel;
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     if-nez v2, :cond_3
a=0;// 
a=0;//     .line 91
a=0;//     const-string v6, "com.j256.ormlite.logger.level"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v6}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 92
a=0;//     .local v3, "levelName":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     if-nez v3, :cond_4
a=0;// 
a=0;//     .line 93
a=0;//     sget-object v2, Lcom/j256/ormlite/logger/LocalLog;->DEFAULT_LEVEL:Lcom/j256/ormlite/logger/Log$Level;
a=0;// 
a=0;//     .line 104
a=0;//     .end local v3    # "levelName":Ljava/lang/String;
a=0;//     :cond_3
a=0;//     :goto_1
a=0;//     #v3=(Conflicted);v4=(Conflicted);v6=(Conflicted);
a=0;//     iput-object v2, p0, Lcom/j256/ormlite/logger/LocalLog;->level:Lcom/j256/ormlite/logger/Log$Level;
a=0;// 
a=0;//     .line 105
a=0;//     return-void
a=0;// 
a=0;//     .line 97
a=0;//     .restart local v3    # "levelName":Ljava/lang/String;
a=0;//     :cond_4
a=0;//     :try_start_0
a=0;//     #v3=(Reference,Ljava/lang/String;);v4=(Uninit);v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-static {v6}, Lcom/j256/ormlite/logger/Log$Level;->valueOf(Ljava/lang/String;)Lcom/j256/ormlite/logger/Log$Level;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 101
a=0;//     .local v4, "matchedLevel":Lcom/j256/ormlite/logger/Log$Level;
a=0;//     #v4=(Reference,Lcom/j256/ormlite/logger/Log$Level;);
a=0;//     move-object v2, v4
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 98
a=0;//     .end local v4    # "matchedLevel":Lcom/j256/ormlite/logger/Log$Level;
a=0;//     :catch_0
a=0;//     #v4=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 99
a=0;//     .local v0, "e":Ljava/lang/IllegalArgumentException;
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v6, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v8, "Level \'"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     const-string v8, "\' was not found"
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-direct {v6, v7, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v6
a=0;// .end method
a=0;// 
a=0;// .method private static configureClassLevels(Ljava/io/InputStream;)Ljava/util/List;
a=0;//     .locals 12
a=0;//     .param p0, "stream"    # Ljava/io/InputStream;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/io/InputStream;",
a=0;//             ")",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Lcom/j256/ormlite/logger/LocalLog$PatternLevel;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v11, 0x1
a=0;// 
a=0;//     #v11=(One);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     .line 164
a=0;//     #v10=(Null);
a=0;//     new-instance v6, Ljava/io/BufferedReader;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/io/BufferedReader;);
a=0;//     new-instance v7, Ljava/io/InputStreamReader;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/io/InputStreamReader;);
a=0;//     invoke-direct {v7, p0}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/io/InputStreamReader;);
a=0;//     invoke-direct {v6, v7}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
a=0;// 
a=0;//     .line 165
a=0;//     .local v6, "reader":Ljava/io/BufferedReader;
a=0;//     #v6=(Reference,Ljava/io/BufferedReader;);
a=0;//     new-instance v3, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 167
a=0;//     .local v3, "list":Ljava/util/List;, "Ljava/util/List<Lcom/j256/ormlite/logger/LocalLog$PatternLevel;>;"
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Reference,Ljava/util/ArrayList;);v4=(Conflicted);v5=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     invoke-virtual {v6}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 168
a=0;//     .local v2, "line":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 190
a=0;//     return-object v3
a=0;// 
a=0;//     .line 172
a=0;//     :cond_1
a=0;//     invoke-virtual {v2}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     if-eqz v7, :cond_0
a=0;// 
a=0;//     invoke-virtual {v2, v10}, Ljava/lang/String;->charAt(I)C
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Char);
a=0;//     const/16 v8, 0x23
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     if-eq v7, v8, :cond_0
a=0;// 
a=0;//     .line 175
a=0;//     const-string v7, "="
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v7}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 176
a=0;//     .local v4, "parts":[Ljava/lang/String;
a=0;//     #v4=(Reference,[Ljava/lang/String;);
a=0;//     array-length v7, v4
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     const/4 v8, 0x2
a=0;// 
a=0;//     if-eq v7, v8, :cond_2
a=0;// 
a=0;//     .line 177
a=0;//     sget-object v7, Ljava/lang/System;->err:Ljava/io/PrintStream;
a=0;// 
a=0;//     #v7=(Reference,Ljava/io/PrintStream;);
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v9, "Line is not in the format of \'pattern = level\': "
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 180
a=0;//     :cond_2
a=0;//     #v7=(Integer);v8=(PosByte);v9=(Conflicted);
a=0;//     aget-object v7, v4, v10
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-virtual {v7}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v7}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 183
a=0;//     .local v5, "pattern":Ljava/util/regex/Pattern;
a=0;//     #v5=(Reference,Ljava/util/regex/Pattern;);
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     :try_start_0
a=0;//     #v7=(One);
a=0;//     aget-object v7, v4, v7
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-virtual {v7}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v7}, Lcom/j256/ormlite/logger/Log$Level;->valueOf(Ljava/lang/String;)Lcom/j256/ormlite/logger/Log$Level;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 188
a=0;//     .local v1, "level":Lcom/j256/ormlite/logger/Log$Level;
a=0;//     #v1=(Reference,Lcom/j256/ormlite/logger/Log$Level;);
a=0;//     new-instance v7, Lcom/j256/ormlite/logger/LocalLog$PatternLevel;
a=0;// 
a=0;//     #v7=(UninitRef,Lcom/j256/ormlite/logger/LocalLog$PatternLevel;);
a=0;//     invoke-direct {v7, v5, v1}, Lcom/j256/ormlite/logger/LocalLog$PatternLevel;-><init>(Ljava/util/regex/Pattern;Lcom/j256/ormlite/logger/Log$Level;)V
a=0;// 
a=0;//     #v7=(Reference,Lcom/j256/ormlite/logger/LocalLog$PatternLevel;);
a=0;//     invoke-interface {v3, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 184
a=0;//     .end local v1    # "level":Lcom/j256/ormlite/logger/Log$Level;
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 185
a=0;//     .local v0, "e":Ljava/lang/IllegalArgumentException;
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     sget-object v7, Ljava/lang/System;->err:Ljava/io/PrintStream;
a=0;// 
a=0;//     #v7=(Reference,Ljava/io/PrintStream;);
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v9, "Level \'"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     aget-object v9, v4, v11
a=0;// 
a=0;//     #v9=(Null);
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     const-string v9, "\' was not found"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static openLogFile(Ljava/lang/String;)V
a=0;//     .locals 4
a=0;//     .param p0, "logPath"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 111
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     .line 112
a=0;//     sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/PrintStream;);
a=0;//     sput-object v1, Lcom/j256/ormlite/logger/LocalLog;->printStream:Ljava/io/PrintStream;
a=0;// 
a=0;//     .line 120
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 115
a=0;//     :cond_0
a=0;//     :try_start_0
a=0;//     #v1=(Uninit);v2=(Uninit);
a=0;//     new-instance v1, Ljava/io/PrintStream;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/PrintStream;);
a=0;//     new-instance v2, Ljava/io/File;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v2, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     invoke-direct {v1, v2}, Ljava/io/PrintStream;-><init>(Ljava/io/File;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/PrintStream;);
a=0;//     sput-object v1, Lcom/j256/ormlite/logger/LocalLog;->printStream:Ljava/io/PrintStream;
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 116
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 117
a=0;//     .local v0, "e":Ljava/io/FileNotFoundException;
a=0;//     #v0=(Reference,Ljava/io/FileNotFoundException;);
a=0;//     new-instance v1, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "Log file "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, " was not found"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method private printMessage(Lcom/j256/ormlite/logger/Log$Level;Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;//     .locals 4
a=0;//     .param p1, "level"    # Lcom/j256/ormlite/logger/Log$Level;
a=0;//     .param p2, "message"    # Ljava/lang/String;
a=0;//     .param p3, "throwable"    # Ljava/lang/Throwable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 194
a=0;//     invoke-virtual {p0, p1}, Lcom/j256/ormlite/logger/LocalLog;->isLevelEnabled(Lcom/j256/ormlite/logger/Log$Level;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 207
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 197
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Boolean);v3=(Uninit);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const/16 v2, 0x80
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V
a=0;// 
a=0;//     .line 198
a=0;//     .local v1, "sb":Ljava/lang/StringBuilder;
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-object v2, Lcom/j256/ormlite/logger/LocalLog;->dateFormatThreadLocal:Ljava/lang/ThreadLocal;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/ThreadLocal;);
a=0;//     invoke-virtual {v2}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/text/DateFormat;
a=0;// 
a=0;//     .line 199
a=0;//     .local v0, "dateFormat":Ljava/text/DateFormat;
a=0;//     new-instance v2, Ljava/util/Date;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/Date;);
a=0;//     invoke-direct {v2}, Ljava/util/Date;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/Date;);
a=0;//     invoke-virtual {v0, v2}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 200
a=0;//     const-string v2, " ["
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {p1}, Lcom/j256/ormlite/logger/Log$Level;->name()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "] "
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 201
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/logger/LocalLog;->className:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const/16 v3, 0x20
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 202
a=0;//     invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 203
a=0;//     sget-object v2, Lcom/j256/ormlite/logger/LocalLog;->printStream:Ljava/io/PrintStream;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 204
a=0;//     if-eqz p3, :cond_0
a=0;// 
a=0;//     .line 205
a=0;//     sget-object v2, Lcom/j256/ormlite/logger/LocalLog;->printStream:Ljava/io/PrintStream;
a=0;// 
a=0;//     invoke-virtual {p3, v2}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintStream;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static readLevelResourceFile(Ljava/io/InputStream;)Ljava/util/List;
a=0;//     .locals 5
a=0;//     .param p0, "stream"    # Ljava/io/InputStream;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/io/InputStream;",
a=0;//             ")",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Lcom/j256/ormlite/logger/LocalLog$PatternLevel;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 145
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 146
a=0;//     .local v1, "levels":Ljava/util/List;, "Ljava/util/List<Lcom/j256/ormlite/logger/LocalLog$PatternLevel;>;"
a=0;//     #v1=(Null);
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     .line 148
a=0;//     :try_start_0
a=0;//     invoke-static {p0}, Lcom/j256/ormlite/logger/LocalLog;->configureClassLevels(Ljava/io/InputStream;)Ljava/util/List;
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 154
a=0;//     :try_start_1
a=0;//     #v1=(Reference,Ljava/util/List;);
a=0;//     invoke-virtual {p0}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_1
a=0;//     .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
a=0;// 
a=0;//     .line 160
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 149
a=0;//     :catch_0
a=0;//     #v0=(Uninit);v1=(Null);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 150
a=0;//     .local v0, "e":Ljava/io/IOException;
a=0;//     :try_start_2
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     sget-object v2, Ljava/lang/System;->err:Ljava/io/PrintStream;
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/PrintStream;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "IO exception reading the log properties file \'/ormliteLocalLog.properties\': "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     .line 154
a=0;//     :try_start_3
a=0;//     invoke-virtual {p0}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_3
a=0;//     .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 155
a=0;//     :catch_1
a=0;//     move-exception v2
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 153
a=0;//     .end local v0    # "e":Ljava/io/IOException;
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 154
a=0;//     :try_start_4
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {p0}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_4
a=0;//     .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3
a=0;// 
a=0;//     .line 157
a=0;//     :goto_1
a=0;//     throw v2
a=0;// 
a=0;//     .line 155
a=0;//     :catch_2
a=0;//     #v0=(Uninit);v1=(Reference,Ljava/util/List;);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/IOException;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_3
a=0;//     #v0=(Conflicted);v1=(Null);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/IOException;);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method flush()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 138
a=0;//     sget-object v0, Lcom/j256/ormlite/logger/LocalLog;->printStream:Ljava/io/PrintStream;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/PrintStream;);
a=0;//     invoke-virtual {v0}, Ljava/io/PrintStream;->flush()V
a=0;// 
a=0;//     .line 139
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public isLevelEnabled(Lcom/j256/ormlite/logger/Log$Level;)Z
a=0;//     .locals 1
a=0;//     .param p1, "level"    # Lcom/j256/ormlite/logger/Log$Level;
a=0;// 
a=0;//     .prologue
a=0;//     .line 123
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/logger/LocalLog;->level:Lcom/j256/ormlite/logger/Log$Level;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/logger/Log$Level;);
a=0;//     invoke-virtual {v0, p1}, Lcom/j256/ormlite/logger/Log$Level;->isEnabled(Lcom/j256/ormlite/logger/Log$Level;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public log(Lcom/j256/ormlite/logger/Log$Level;Ljava/lang/String;)V
a=0;//     .locals 1
a=0;//     .param p1, "level"    # Lcom/j256/ormlite/logger/Log$Level;
a=0;//     .param p2, "msg"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 127
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, p2, v0}, Lcom/j256/ormlite/logger/LocalLog;->printMessage(Lcom/j256/ormlite/logger/Log$Level;Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     .line 128
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public log(Lcom/j256/ormlite/logger/Log$Level;Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;//     .locals 0
a=0;//     .param p1, "level"    # Lcom/j256/ormlite/logger/Log$Level;
a=0;//     .param p2, "msg"    # Ljava/lang/String;
a=0;//     .param p3, "throwable"    # Ljava/lang/Throwable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 131
a=0;//     invoke-direct {p0, p1, p2, p3}, Lcom/j256/ormlite/logger/LocalLog;->printMessage(Lcom/j256/ormlite/logger/Log$Level;Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     .line 132
a=0;//     return-void
a=0;// .end method
}}
