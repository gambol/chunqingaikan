package com.twocloo.base.util; class LogUtils { void a() { int a;
a=0;// .class public Lcom/twocloo/base/util/LogUtils;
a=0;// .super Ljava/lang/Object;
a=0;// .source "LogUtils.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final DATE_FORMAT:Ljava/text/SimpleDateFormat;
a=0;// 
a=0;// .field private static final LOG_IS_ON:Z = false
a=0;// 
a=0;// .field private static final LOG_LEVEL:I = 0x3
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 21
a=0;//     new-instance v0, Ljava/text/SimpleDateFormat;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/text/SimpleDateFormat;);
a=0;//     const-string v1, "yyyy-MM-dd HH:mm:ss"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/text/SimpleDateFormat;);
a=0;//     sput-object v0, Lcom/twocloo/base/util/LogUtils;->DATE_FORMAT:Ljava/text/SimpleDateFormat;
a=0;// 
a=0;//     .line 26
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 20
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/base/util/LogUtils;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static antoError()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 57
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static debug(Ljava/lang/String;)V
a=0;//     .locals 2
a=0;//     .param p0, "msg"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 32
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {v0, p0, v1}, Lcom/twocloo/base/util/LogUtils;->doLog(ILjava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     .line 33
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static doLog(ILjava/lang/String;Ljava/lang/Throwable;)V
a=0;//     .locals 0
a=0;//     .param p0, "logLevel"    # I
a=0;//     .param p1, "logMessage"    # Ljava/lang/String;
a=0;//     .param p2, "throwable"    # Ljava/lang/Throwable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 70
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;//     .locals 1
a=0;//     .param p0, "msg"    # Ljava/lang/String;
a=0;//     .param p1, "e"    # Ljava/lang/Throwable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 46
a=0;//     const/4 v0, 0x6
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-static {v0, p0, p1}, Lcom/twocloo/base/util/LogUtils;->doLog(ILjava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     .line 48
a=0;//     invoke-static {p1}, Lcom/twocloo/base/util/LogUtils;->sendLog(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     .line 49
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static getLogTag()Ljava/lang/String;
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     .line 93
a=0;//     const/4 v5, 0x6
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-static {v5}, Lcom/twocloo/base/util/LogUtils;->getStackTraceElement(I)Ljava/lang/StackTraceElement;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 94
a=0;//     .local v3, "stackTraceElement":Ljava/lang/StackTraceElement;
a=0;//     #v3=(Reference,Ljava/lang/StackTraceElement;);
a=0;//     invoke-virtual {v3}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 95
a=0;//     .local v0, "className":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 96
a=0;//     .local v2, "methodName":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3}, Ljava/lang/StackTraceElement;->getLineNumber()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 97
a=0;//     .local v1, "line":I
a=0;//     #v1=(Integer);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "|"
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const-string v6, "|"
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const-string v6, "|"
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 99
a=0;//     .local v4, "tag":Ljava/lang/String;
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     return-object v4
a=0;// .end method
a=0;// 
a=0;// .method private static getStackTraceElement(I)Ljava/lang/StackTraceElement;
a=0;//     .locals 1
a=0;//     .param p0, "i"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 106
a=0;//     invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Thread;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Thread;->getStackTrace()[Ljava/lang/StackTraceElement;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     aget-object v0, v0, p0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static info(Ljava/lang/String;)V
a=0;//     .locals 2
a=0;//     .param p0, "msg"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 39
a=0;//     const/4 v0, 0x4
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {v0, p0, v1}, Lcom/twocloo/base/util/LogUtils;->doLog(ILjava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     .line 40
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static sendLog(Ljava/io/File;)V
a=0;//     .locals 4
a=0;//     .param p0, "file"    # Ljava/io/File;
a=0;// 
a=0;//     .prologue
a=0;//     .line 150
a=0;//     invoke-static {}, Lcom/twocloo/base/common/CommonApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/app/Application;);
a=0;//     invoke-static {v3}, Lcom/twocloo/base/util/NetUtils;->checkNet(Landroid/content/Context;)Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 151
a=0;//     .local v2, "netType":Lcom/twocloo/base/common/NetType;
a=0;//     #v2=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     sget-object v3, Lcom/twocloo/base/common/NetType;->TYPE_2G:Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     invoke-virtual {v3, v2}, Lcom/twocloo/base/common/NetType;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 153
a=0;//     :try_start_0
a=0;//     new-instance v3, Ljava/io/FileReader;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/FileReader;);
a=0;//     invoke-direct {v3, p0}, Ljava/io/FileReader;-><init>(Ljava/io/File;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/FileReader;);
a=0;//     invoke-static {v3}, Lcom/twocloo/base/util/FileUtils;->readString(Ljava/io/Reader;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 154
a=0;//     .local v1, "errorMsg":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/base/common/CommonApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3, v1}, Lcom/umeng/analytics/MobclickAgent;->reportError(Landroid/content/Context;Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 159
a=0;//     .end local v1    # "errorMsg":Ljava/lang/String;
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 155
a=0;//     :catch_0
a=0;//     #v0=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 156
a=0;//     .local v0, "e":Ljava/lang/Throwable;
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v0}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static sendLog(Ljava/lang/Throwable;)V
a=0;//     .locals 12
a=0;//     .param p0, "e"    # Ljava/lang/Throwable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 113
a=0;//     new-instance v7, Ljava/io/StringWriter;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/io/StringWriter;);
a=0;//     invoke-direct {v7}, Ljava/io/StringWriter;-><init>()V
a=0;// 
a=0;//     .line 114
a=0;//     .local v7, "sw":Ljava/io/StringWriter;
a=0;//     #v7=(Reference,Ljava/io/StringWriter;);
a=0;//     new-instance v3, Ljava/io/PrintWriter;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/PrintWriter;);
a=0;//     invoke-direct {v3, v7}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V
a=0;// 
a=0;//     .line 115
a=0;//     .local v3, "pw":Ljava/io/PrintWriter;
a=0;//     #v3=(Reference,Ljava/io/PrintWriter;);
a=0;//     invoke-virtual {p0, v3}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintWriter;)V
a=0;// 
a=0;//     .line 117
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     .line 118
a=0;//     .local v4, "sb":Ljava/lang/StringBuilder;
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v8, "Version code is "
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 119
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     sget v9, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     invoke-static {v9}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v9, "\n"
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 120
a=0;//     const-string v8, "Model is "
a=0;// 
a=0;//     invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 121
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     sget-object v9, Landroid/os/Build;->MODEL:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v9}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v9, "\n"
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 122
a=0;//     const-string v8, "Time is "
a=0;// 
a=0;//     invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 123
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     sget-object v9, Lcom/twocloo/base/util/LogUtils;->DATE_FORMAT:Ljava/text/SimpleDateFormat;
a=0;// 
a=0;//     new-instance v10, Ljava/util/Date;
a=0;// 
a=0;//     #v10=(UninitRef,Ljava/util/Date;);
a=0;//     invoke-direct {v10}, Ljava/util/Date;-><init>()V
a=0;// 
a=0;//     #v10=(Reference,Ljava/util/Date;);
a=0;//     invoke-virtual {v9, v10}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-static {v9}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v9, "\n"
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 124
a=0;//     invoke-virtual {v7}, Ljava/io/StringWriter;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 127
a=0;//     invoke-static {}, Lcom/twocloo/base/common/CommonApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-static {v8}, Lcom/twocloo/base/util/NetUtils;->checkNet(Landroid/content/Context;)Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 128
a=0;//     .local v2, "netType":Lcom/twocloo/base/common/NetType;
a=0;//     #v2=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     sget-object v8, Lcom/twocloo/base/common/NetType;->TYPE_2G:Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     invoke-virtual {v8, v2}, Lcom/twocloo/base/common/NetType;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-nez v8, :cond_0
a=0;// 
a=0;//     .line 129
a=0;//     invoke-static {}, Lcom/twocloo/base/common/CommonApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Landroid/app/Application;);
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-static {v8, v9}, Lcom/umeng/analytics/MobclickAgent;->reportError(Landroid/content/Context;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 133
a=0;//     :cond_0
a=0;//     :try_start_0
a=0;//     #v8=(Conflicted);
a=0;//     invoke-static {}, Lcom/twocloo/base/util/StorageUtils;->getAvailableExternalMemorySize()J
a=0;// 
a=0;//     move-result-wide v5
a=0;// 
a=0;//     .line 134
a=0;//     .local v5, "sdcardSize":J
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     invoke-static {}, Lcom/twocloo/base/util/StorageUtils;->externalMemoryAvailable()Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_2
a=0;// 
a=0;//     const-wide/32 v8, 0x500000
a=0;// 
a=0;//     #v8=(LongLo);v9=(LongHi);
a=0;//     cmp-long v8, v5, v8
a=0;// 
a=0;//     #v8=(Byte);
a=0;//     if-lez v8, :cond_2
a=0;// 
a=0;//     .line 135
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {}, Lcom/twocloo/base/util/StorageUtils;->externalMemoryRootPath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v9}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v9, "/readnovel_error.log"
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 137
a=0;//     .local v1, "fileFullName":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 138
a=0;//     .local v0, "file":Ljava/io/File;
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_1
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/File;->length()J
a=0;// 
a=0;//     move-result-wide v8
a=0;// 
a=0;//     #v8=(LongLo);v9=(LongHi);
a=0;//     const-wide/32 v10, 0x200000
a=0;// 
a=0;//     #v10=(LongLo);v11=(LongHi);
a=0;//     cmp-long v8, v8, v10
a=0;// 
a=0;//     #v8=(Byte);
a=0;//     if-ltz v8, :cond_1
a=0;// 
a=0;//     .line 139
a=0;//     invoke-virtual {v0}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     .line 141
a=0;//     :cond_1
a=0;//     #v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v8, v0}, Lcom/twocloo/base/util/StorageUtils;->append(Ljava/lang/String;Ljava/io/File;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 145
a=0;//     .end local v0    # "file":Ljava/io/File;
a=0;//     .end local v1    # "fileFullName":Ljava/lang/String;
a=0;//     .end local v5    # "sdcardSize":J
a=0;//     :cond_2
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v5=(Conflicted);v6=(Conflicted);v8=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 143
a=0;//     :catch_0
a=0;//     move-exception v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// .end method
}}
