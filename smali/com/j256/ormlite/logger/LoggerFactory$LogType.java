package com.j256.ormlite.logger; class LoggerFactory$LogType { void a() { int a;
a=0;// .class enum Lcom/j256/ormlite/logger/LoggerFactory$LogType;
a=0;// .super Ljava/lang/Enum;
a=0;// .source "LoggerFactory.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/j256/ormlite/logger/LoggerFactory;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x4008
a=0;//     name = "LogType"
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "Ljava/lang/Enum",
a=0;//         "<",
a=0;//         "Lcom/j256/ormlite/logger/LoggerFactory$LogType;",
a=0;//         ">;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final synthetic $VALUES:[Lcom/j256/ormlite/logger/LoggerFactory$LogType;
a=0;// 
a=0;// .field public static final enum ANDROID:Lcom/j256/ormlite/logger/LoggerFactory$LogType;
a=0;// 
a=0;// .field public static final enum COMMONS_LOGGING:Lcom/j256/ormlite/logger/LoggerFactory$LogType;
a=0;// 
a=0;// .field public static final enum LOCAL:Lcom/j256/ormlite/logger/LoggerFactory$LogType;
a=0;// 
a=0;// .field public static final enum LOG4J:Lcom/j256/ormlite/logger/LoggerFactory$LogType;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final detectClassName:Ljava/lang/String;
a=0;// 
a=0;// .field private final logClassName:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v7, 0x3
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     const/4 v6, 0x2
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 68
a=0;//     #v4=(Null);
a=0;//     new-instance v0, Lcom/j256/ormlite/logger/LoggerFactory$LogType;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/j256/ormlite/logger/LoggerFactory$LogType;);
a=0;//     const-string v1, "ANDROID"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "android.util.Log"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "com.j256.ormlite.android.AndroidLog"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1, v4, v2, v3}, Lcom/j256/ormlite/logger/LoggerFactory$LogType;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/logger/LoggerFactory$LogType;);
a=0;//     sput-object v0, Lcom/j256/ormlite/logger/LoggerFactory$LogType;->ANDROID:Lcom/j256/ormlite/logger/LoggerFactory$LogType;
a=0;// 
a=0;//     .line 69
a=0;//     new-instance v0, Lcom/j256/ormlite/logger/LoggerFactory$LogType;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/j256/ormlite/logger/LoggerFactory$LogType;);
a=0;//     const-string v1, "COMMONS_LOGGING"
a=0;// 
a=0;//     const-string v2, "org.apache.commons.logging.LogFactory"
a=0;// 
a=0;//     const-string v3, "com.j256.ormlite.logger.CommonsLoggingLog"
a=0;// 
a=0;//     invoke-direct {v0, v1, v5, v2, v3}, Lcom/j256/ormlite/logger/LoggerFactory$LogType;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/logger/LoggerFactory$LogType;);
a=0;//     sput-object v0, Lcom/j256/ormlite/logger/LoggerFactory$LogType;->COMMONS_LOGGING:Lcom/j256/ormlite/logger/LoggerFactory$LogType;
a=0;// 
a=0;//     .line 70
a=0;//     new-instance v0, Lcom/j256/ormlite/logger/LoggerFactory$LogType;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/j256/ormlite/logger/LoggerFactory$LogType;);
a=0;//     const-string v1, "LOG4J"
a=0;// 
a=0;//     const-string v2, "org.apache.log4j.Logger"
a=0;// 
a=0;//     const-string v3, "com.j256.ormlite.logger.Log4jLog"
a=0;// 
a=0;//     invoke-direct {v0, v1, v6, v2, v3}, Lcom/j256/ormlite/logger/LoggerFactory$LogType;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/logger/LoggerFactory$LogType;);
a=0;//     sput-object v0, Lcom/j256/ormlite/logger/LoggerFactory$LogType;->LOG4J:Lcom/j256/ormlite/logger/LoggerFactory$LogType;
a=0;// 
a=0;//     .line 72
a=0;//     new-instance v0, Lcom/j256/ormlite/logger/LoggerFactory$LogType$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/j256/ormlite/logger/LoggerFactory$LogType$1;);
a=0;//     const-string v1, "LOCAL"
a=0;// 
a=0;//     const-class v2, Lcom/j256/ormlite/logger/LocalLog;
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-class v3, Lcom/j256/ormlite/logger/LocalLog;
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v0, v1, v7, v2, v3}, Lcom/j256/ormlite/logger/LoggerFactory$LogType$1;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/logger/LoggerFactory$LogType$1;);
a=0;//     sput-object v0, Lcom/j256/ormlite/logger/LoggerFactory$LogType;->LOCAL:Lcom/j256/ormlite/logger/LoggerFactory$LogType;
a=0;// 
a=0;//     .line 63
a=0;//     const/4 v0, 0x4
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v0, v0, [Lcom/j256/ormlite/logger/LoggerFactory$LogType;
a=0;// 
a=0;//     #v0=(Reference,[Lcom/j256/ormlite/logger/LoggerFactory$LogType;);
a=0;//     sget-object v1, Lcom/j256/ormlite/logger/LoggerFactory$LogType;->ANDROID:Lcom/j256/ormlite/logger/LoggerFactory$LogType;
a=0;// 
a=0;//     aput-object v1, v0, v4
a=0;// 
a=0;//     sget-object v1, Lcom/j256/ormlite/logger/LoggerFactory$LogType;->COMMONS_LOGGING:Lcom/j256/ormlite/logger/LoggerFactory$LogType;
a=0;// 
a=0;//     aput-object v1, v0, v5
a=0;// 
a=0;//     sget-object v1, Lcom/j256/ormlite/logger/LoggerFactory$LogType;->LOG4J:Lcom/j256/ormlite/logger/LoggerFactory$LogType;
a=0;// 
a=0;//     aput-object v1, v0, v6
a=0;// 
a=0;//     sget-object v1, Lcom/j256/ormlite/logger/LoggerFactory$LogType;->LOCAL:Lcom/j256/ormlite/logger/LoggerFactory$LogType;
a=0;// 
a=0;//     aput-object v1, v0, v7
a=0;// 
a=0;//     sput-object v0, Lcom/j256/ormlite/logger/LoggerFactory$LogType;->$VALUES:[Lcom/j256/ormlite/logger/LoggerFactory$LogType;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 0
a=0;//     .param p3, "detectClassName"    # Ljava/lang/String;
a=0;//     .param p4, "logClassName"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             ")V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 89
a=0;//     invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 90
a=0;//     #p0=(Reference,Lcom/j256/ormlite/logger/LoggerFactory$LogType;);
a=0;//     iput-object p3, p0, Lcom/j256/ormlite/logger/LoggerFactory$LogType;->detectClassName:Ljava/lang/String;
a=0;// 
a=0;//     .line 91
a=0;//     iput-object p4, p0, Lcom/j256/ormlite/logger/LoggerFactory$LogType;->logClassName:Ljava/lang/String;
a=0;// 
a=0;//     .line 92
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method synthetic constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lcom/j256/ormlite/logger/LoggerFactory$1;)V
a=0;//     .locals 0
a=0;//     .param p1, "x0"    # Ljava/lang/String;
a=0;//     .param p2, "x1"    # I
a=0;//     .param p3, "x2"    # Ljava/lang/String;
a=0;//     .param p4, "x3"    # Ljava/lang/String;
a=0;//     .param p5, "x4"    # Lcom/j256/ormlite/logger/LoggerFactory$1;
a=0;// 
a=0;//     .prologue
a=0;//     .line 63
a=0;//     invoke-direct {p0, p1, p2, p3, p4}, Lcom/j256/ormlite/logger/LoggerFactory$LogType;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/j256/ormlite/logger/LoggerFactory$LogType;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static valueOf(Ljava/lang/String;)Lcom/j256/ormlite/logger/LoggerFactory$LogType;
a=0;//     .locals 1
a=0;//     .param p0, "name"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 63
a=0;//     const-class v0, Lcom/j256/ormlite/logger/LoggerFactory$LogType;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/j256/ormlite/logger/LoggerFactory$LogType;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static values()[Lcom/j256/ormlite/logger/LoggerFactory$LogType;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 63
a=0;//     sget-object v0, Lcom/j256/ormlite/logger/LoggerFactory$LogType;->$VALUES:[Lcom/j256/ormlite/logger/LoggerFactory$LogType;
a=0;// 
a=0;//     #v0=(Reference,[Lcom/j256/ormlite/logger/LoggerFactory$LogType;);
a=0;//     invoke-virtual {v0}, [Lcom/j256/ormlite/logger/LoggerFactory$LogType;->clone()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, [Lcom/j256/ormlite/logger/LoggerFactory$LogType;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public createLog(Ljava/lang/String;)Lcom/j256/ormlite/logger/Log;
a=0;//     .locals 1
a=0;//     .param p1, "classLabel"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 98
a=0;//     invoke-virtual {p0, p1}, Lcom/j256/ormlite/logger/LoggerFactory$LogType;->createLogFromClassName(Ljava/lang/String;)Lcom/j256/ormlite/logger/Log;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/logger/Log;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method createLogFromClassName(Ljava/lang/String;)Lcom/j256/ormlite/logger/Log;
a=0;//     .locals 7
a=0;//     .param p1, "classLabel"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 106
a=0;//     :try_start_0
a=0;//     iget-object v4, p0, Lcom/j256/ormlite/logger/LoggerFactory$LogType;->logClassName:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 108
a=0;//     .local v0, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     new-array v4, v4, [Ljava/lang/Class;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/Class;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const-class v6, Ljava/lang/String;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Class;);
a=0;//     aput-object v6, v4, v5
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 109
a=0;//     .local v1, "constructor":Ljava/lang/reflect/Constructor;, "Ljava/lang/reflect/Constructor<Lcom/j256/ormlite/logger/Log;>;"
a=0;//     #v1=(Reference,Ljava/lang/reflect/Constructor;);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     new-array v4, v4, [Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     aput-object p1, v4, v5
a=0;// 
a=0;//     invoke-virtual {v1, v4}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     check-cast v4, Lcom/j256/ormlite/logger/Log;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 115
a=0;//     .end local v0    # "clazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     .end local v1    # "constructor":Ljava/lang/reflect/Constructor;, "Ljava/lang/reflect/Constructor<Lcom/j256/ormlite/logger/Log;>;"
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v5=(Reference,Ljava/lang/String;);
a=0;//     return-object v4
a=0;// 
a=0;//     .line 110
a=0;//     :catch_0
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 112
a=0;//     .local v2, "e":Ljava/lang/Exception;
a=0;//     #v2=(Reference,Ljava/lang/Exception;);
a=0;//     new-instance v3, Lcom/j256/ormlite/logger/LocalLog;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/j256/ormlite/logger/LocalLog;);
a=0;//     invoke-direct {v3, p1}, Lcom/j256/ormlite/logger/LocalLog;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 113
a=0;//     .local v3, "log":Lcom/j256/ormlite/logger/Log;
a=0;//     #v3=(Reference,Lcom/j256/ormlite/logger/LocalLog;);
a=0;//     sget-object v4, Lcom/j256/ormlite/logger/Log$Level;->WARNING:Lcom/j256/ormlite/logger/Log$Level;
a=0;// 
a=0;//     #v4=(Reference,Lcom/j256/ormlite/logger/Log$Level;);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "Unable to call constructor with single String argument for class "
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     iget-object v6, p0, Lcom/j256/ormlite/logger/LoggerFactory$LogType;->logClassName:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const-string v6, ", so had to use local log"
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-interface {v3, v4, v5, v2}, Lcom/j256/ormlite/logger/Log;->log(Lcom/j256/ormlite/logger/Log$Level;Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     move-object v4, v3
a=0;// 
a=0;//     .line 115
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public isAvailable()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 123
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/logger/LoggerFactory$LogType;->isAvailableTestClass()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method isAvailableTestClass()Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 131
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/logger/LoggerFactory$LogType;->detectClassName:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 132
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 134
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Boolean);
a=0;//     return v1
a=0;// 
a=0;//     .line 133
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 134
a=0;//     .local v0, "e":Ljava/lang/Exception;
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// .end method
}}
