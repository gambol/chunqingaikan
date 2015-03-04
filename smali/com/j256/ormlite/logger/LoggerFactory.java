package com.j256.ormlite.logger; class LoggerFactory { void a() { int a;
a=0;// .class public Lcom/j256/ormlite/logger/LoggerFactory;
a=0;// .super Ljava/lang/Object;
a=0;// .source "LoggerFactory.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/j256/ormlite/logger/LoggerFactory$1;,
a=0;//         Lcom/j256/ormlite/logger/LoggerFactory$LogType;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static logType:Lcom/j256/ormlite/logger/LoggerFactory$LogType;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 17
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 18
a=0;//     #p0=(Reference,Lcom/j256/ormlite/logger/LoggerFactory;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static findLogType()Lcom/j256/ormlite/logger/LoggerFactory$LogType;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 51
a=0;//     invoke-static {}, Lcom/j256/ormlite/logger/LoggerFactory$LogType;->values()[Lcom/j256/ormlite/logger/LoggerFactory$LogType;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .local v0, "arr$":[Lcom/j256/ormlite/logger/LoggerFactory$LogType;
a=0;//     #v0=(Reference,[Lcom/j256/ormlite/logger/LoggerFactory$LogType;);
a=0;//     array-length v2, v0
a=0;// 
a=0;//     .local v2, "len$":I
a=0;//     #v2=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "i$":I
a=0;//     :goto_0
a=0;//     #v1=(Integer);v3=(Conflicted);v4=(Conflicted);
a=0;//     if-ge v1, v2, :cond_1
a=0;// 
a=0;//     aget-object v3, v0, v1
a=0;// 
a=0;//     .line 52
a=0;//     .local v3, "logType":Lcom/j256/ormlite/logger/LoggerFactory$LogType;
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v3}, Lcom/j256/ormlite/logger/LoggerFactory$LogType;->isAvailable()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     .line 57
a=0;//     .end local v3    # "logType":Lcom/j256/ormlite/logger/LoggerFactory$LogType;
a=0;//     :goto_1
a=0;//     #v3=(Reference,Lcom/j256/ormlite/logger/LoggerFactory$LogType;);v4=(Conflicted);
a=0;//     return-object v3
a=0;// 
a=0;//     .line 51
a=0;//     .restart local v3    # "logType":Lcom/j256/ormlite/logger/LoggerFactory$LogType;
a=0;//     :cond_0
a=0;//     #v3=(Null);v4=(Boolean);
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 57
a=0;//     .end local v3    # "logType":Lcom/j256/ormlite/logger/LoggerFactory$LogType;
a=0;//     :cond_1
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     sget-object v3, Lcom/j256/ormlite/logger/LoggerFactory$LogType;->LOCAL:Lcom/j256/ormlite/logger/LoggerFactory$LogType;
a=0;// 
a=0;//     #v3=(Reference,Lcom/j256/ormlite/logger/LoggerFactory$LogType;);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static getLogger(Ljava/lang/Class;)Lcom/j256/ormlite/logger/Logger;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/Class",
a=0;//             "<*>;)",
a=0;//             "Lcom/j256/ormlite/logger/Logger;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 24
a=0;//     .local p0, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/j256/ormlite/logger/LoggerFactory;->getLogger(Ljava/lang/String;)Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static getLogger(Ljava/lang/String;)Lcom/j256/ormlite/logger/Logger;
a=0;//     .locals 2
a=0;//     .param p0, "className"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 31
a=0;//     sget-object v0, Lcom/j256/ormlite/logger/LoggerFactory;->logType:Lcom/j256/ormlite/logger/LoggerFactory$LogType;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/logger/LoggerFactory$LogType;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 32
a=0;//     invoke-static {}, Lcom/j256/ormlite/logger/LoggerFactory;->findLogType()Lcom/j256/ormlite/logger/LoggerFactory$LogType;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/j256/ormlite/logger/LoggerFactory;->logType:Lcom/j256/ormlite/logger/LoggerFactory$LogType;
a=0;// 
a=0;//     .line 34
a=0;//     :cond_0
a=0;//     new-instance v0, Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/j256/ormlite/logger/Logger;);
a=0;//     sget-object v1, Lcom/j256/ormlite/logger/LoggerFactory;->logType:Lcom/j256/ormlite/logger/LoggerFactory$LogType;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/logger/LoggerFactory$LogType;);
a=0;//     invoke-virtual {v1, p0}, Lcom/j256/ormlite/logger/LoggerFactory$LogType;->createLog(Ljava/lang/String;)Lcom/j256/ormlite/logger/Log;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Lcom/j256/ormlite/logger/Logger;-><init>(Lcom/j256/ormlite/logger/Log;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static getSimpleClassName(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 3
a=0;//     .param p0, "className"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 39
a=0;//     const-string v1, "\\."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 40
a=0;//     .local v0, "parts":[Ljava/lang/String;
a=0;//     #v0=(Reference,[Ljava/lang/String;);
a=0;//     array-length v1, v0
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     if-gt v1, v2, :cond_0
a=0;// 
a=0;//     .line 43
a=0;//     .end local p0    # "className":Ljava/lang/String;
a=0;//     :goto_0
a=0;//     return-object p0
a=0;// 
a=0;//     .restart local p0    # "className":Ljava/lang/String;
a=0;//     :cond_0
a=0;//     array-length v1, v0
a=0;// 
a=0;//     add-int/lit8 v1, v1, -0x1
a=0;// 
a=0;//     aget-object p0, v0, v1
a=0;// 
a=0;//     #p0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
}}
