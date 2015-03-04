package com.j256.ormlite.misc; class VersionUtils { void a() { int a;
a=0;// .class public Lcom/j256/ormlite/misc/VersionUtils;
a=0;// .super Ljava/lang/Object;
a=0;// .source "VersionUtils.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final ANDROID_VERSION_FILE:Ljava/lang/String; = "/com/j256/ormlite/android/VERSION.txt"
a=0;// 
a=0;// .field private static final CORE_VERSION_FILE:Ljava/lang/String; = "/com/j256/ormlite/core/VERSION.txt"
a=0;// 
a=0;// .field private static final JDBC_VERSION_FILE:Ljava/lang/String; = "/com/j256/ormlite/jdbc/VERSION.txt"
a=0;// 
a=0;// .field private static androidVersionFile:Ljava/lang/String;
a=0;// 
a=0;// .field private static coreVersionFile:Ljava/lang/String;
a=0;// 
a=0;// .field private static jdbcVersionFile:Ljava/lang/String;
a=0;// 
a=0;// .field private static logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;// .field private static thrownOnErrors:Z
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 23
a=0;//     const-string v0, "/com/j256/ormlite/core/VERSION.txt"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     sput-object v0, Lcom/j256/ormlite/misc/VersionUtils;->coreVersionFile:Ljava/lang/String;
a=0;// 
a=0;//     .line 24
a=0;//     const-string v0, "/com/j256/ormlite/jdbc/VERSION.txt"
a=0;// 
a=0;//     sput-object v0, Lcom/j256/ormlite/misc/VersionUtils;->jdbcVersionFile:Ljava/lang/String;
a=0;// 
a=0;//     .line 25
a=0;//     const-string v0, "/com/j256/ormlite/android/VERSION.txt"
a=0;// 
a=0;//     sput-object v0, Lcom/j256/ormlite/misc/VersionUtils;->androidVersionFile:Ljava/lang/String;
a=0;// 
a=0;//     .line 26
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput-boolean v0, Lcom/j256/ormlite/misc/VersionUtils;->thrownOnErrors:Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 28
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 30
a=0;//     #p0=(Reference,Lcom/j256/ormlite/misc/VersionUtils;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static final checkCoreVersusAndroidVersions()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 45
a=0;//     invoke-static {}, Lcom/j256/ormlite/misc/VersionUtils;->readCoreVersion()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 46
a=0;//     .local v1, "core":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/j256/ormlite/misc/VersionUtils;->readAndroidVersion()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 47
a=0;//     .local v0, "android":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "core"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "android"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v1, v3, v0}, Lcom/j256/ormlite/misc/VersionUtils;->logVersionErrors(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 48
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static final checkCoreVersusJdbcVersions()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 36
a=0;//     invoke-static {}, Lcom/j256/ormlite/misc/VersionUtils;->readCoreVersion()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 37
a=0;//     .local v0, "core":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/j256/ormlite/misc/VersionUtils;->readJdbcVersion()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 38
a=0;//     .local v1, "jdbc":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "core"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "jdbc"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v0, v3, v1}, Lcom/j256/ormlite/misc/VersionUtils;->logVersionErrors(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 39
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static error(Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
a=0;//     .locals 6
a=0;//     .param p0, "th"    # Ljava/lang/Throwable;
a=0;//     .param p1, "msg"    # Ljava/lang/String;
a=0;//     .param p2, "arg0"    # Ljava/lang/Object;
a=0;//     .param p3, "arg1"    # Ljava/lang/Object;
a=0;//     .param p4, "arg2"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 145
a=0;//     invoke-static {}, Lcom/j256/ormlite/misc/VersionUtils;->getLogger()Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     move-object v1, p0
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v2, p1
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     move-object v3, p2
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     move-object v4, p3
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     move-object v5, p4
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual/range {v0 .. v5}, Lcom/j256/ormlite/logger/Logger;->error(Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 146
a=0;//     sget-boolean v0, Lcom/j256/ormlite/misc/VersionUtils;->thrownOnErrors:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 147
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "See error log for details: "
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 149
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static error(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
a=0;//     .locals 3
a=0;//     .param p0, "th"    # Ljava/lang/Throwable;
a=0;//     .param p1, "msg"    # Ljava/lang/String;
a=0;//     .param p2, "args"    # [Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 152
a=0;//     invoke-static {}, Lcom/j256/ormlite/misc/VersionUtils;->getLogger()Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     invoke-virtual {v0, p0, p1, p2}, Lcom/j256/ormlite/logger/Logger;->error(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 153
a=0;//     sget-boolean v0, Lcom/j256/ormlite/misc/VersionUtils;->thrownOnErrors:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 154
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "See error log for details:"
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
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 156
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static getLogger()Lcom/j256/ormlite/logger/Logger;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 162
a=0;//     sget-object v0, Lcom/j256/ormlite/misc/VersionUtils;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 163
a=0;//     const-class v0, Lcom/j256/ormlite/misc/VersionUtils;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/j256/ormlite/logger/LoggerFactory;->getLogger(Ljava/lang/Class;)Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/j256/ormlite/misc/VersionUtils;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     .line 165
a=0;//     :cond_0
a=0;//     sget-object v0, Lcom/j256/ormlite/misc/VersionUtils;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private static getVersionFromFile(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 8
a=0;//     .param p0, "file"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 118
a=0;//     #v4=(Null);
a=0;//     const-class v5, Lcom/j256/ormlite/misc/VersionUtils;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v5, p0}, Ljava/lang/Class;->getResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 119
a=0;//     .local v1, "inputStream":Ljava/io/InputStream;
a=0;//     #v1=(Reference,Ljava/io/InputStream;);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 120
a=0;//     const-string v5, "Could not find version file {}"
a=0;// 
a=0;//     invoke-static {v4, v5, p0, v4, v4}, Lcom/j256/ormlite/misc/VersionUtils;->error(Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
a=0;// 
a=0;//     move-object v3, v4
a=0;// 
a=0;//     .line 141
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Reference,Ljava/lang/String;);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-object v3
a=0;// 
a=0;//     .line 123
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v2=(Uninit);v3=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     new-instance v2, Ljava/io/BufferedReader;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/BufferedReader;);
a=0;//     new-instance v5, Ljava/io/InputStreamReader;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/io/InputStreamReader;);
a=0;//     invoke-direct {v5, v1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/io/InputStreamReader;);
a=0;//     invoke-direct {v2, v5}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
a=0;// 
a=0;//     .line 126
a=0;//     .local v2, "reader":Ljava/io/BufferedReader;
a=0;//     :try_start_0
a=0;//     #v2=(Reference,Ljava/io/BufferedReader;);
a=0;//     invoke-virtual {v2}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 133
a=0;//     .local v3, "version":Ljava/lang/String;
a=0;//     :try_start_1
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2}, Ljava/io/BufferedReader;->close()V
a=0;//     :try_end_1
a=0;//     .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     .line 138
a=0;//     :goto_1
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 139
a=0;//     const-string v5, "No version specified in {}"
a=0;// 
a=0;//     invoke-static {v4, v5, p0, v4, v4}, Lcom/j256/ormlite/misc/VersionUtils;->error(Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 127
a=0;//     .end local v3    # "version":Ljava/lang/String;
a=0;//     :catch_0
a=0;//     #v3=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 129
a=0;//     .local v0, "e":Ljava/io/IOException;
a=0;//     :try_start_2
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     const-string v5, "Could not read version from {}"
a=0;// 
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-static {v0, v5, p0, v6, v7}, Lcom/j256/ormlite/misc/VersionUtils;->error(Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     .line 133
a=0;//     :try_start_3
a=0;//     invoke-virtual {v2}, Ljava/io/BufferedReader;->close()V
a=0;//     :try_end_3
a=0;//     .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2
a=0;// 
a=0;//     :goto_2
a=0;//     move-object v3, v4
a=0;// 
a=0;//     .line 136
a=0;//     #v3=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 132
a=0;//     .end local v0    # "e":Ljava/io/IOException;
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v3=(Uninit);v6=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v4
a=0;// 
a=0;//     .line 133
a=0;//     :try_start_4
a=0;//     #v4=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v2}, Ljava/io/BufferedReader;->close()V
a=0;//     :try_end_4
a=0;//     .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3
a=0;// 
a=0;//     .line 136
a=0;//     :goto_3
a=0;//     throw v4
a=0;// 
a=0;//     .line 134
a=0;//     .restart local v3    # "version":Ljava/lang/String;
a=0;//     :catch_1
a=0;//     #v0=(Uninit);v3=(Reference,Ljava/lang/String;);v4=(Null);v6=(Uninit);v7=(Uninit);
a=0;//     move-exception v5
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .end local v3    # "version":Ljava/lang/String;
a=0;//     .restart local v0    # "e":Ljava/io/IOException;
a=0;//     :catch_2
a=0;//     #v0=(Reference,Ljava/io/IOException;);v3=(Uninit);v6=(Null);v7=(Null);
a=0;//     move-exception v5
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .end local v0    # "e":Ljava/io/IOException;
a=0;//     :catch_3
a=0;//     #v0=(Conflicted);v4=(Reference,Ljava/lang/Throwable;);v6=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v5
a=0;// 
a=0;//     goto :goto_3
a=0;// .end method
a=0;// 
a=0;// .method private static logVersionErrors(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 4
a=0;//     .param p0, "label1"    # Ljava/lang/String;
a=0;//     .param p1, "version1"    # Ljava/lang/String;
a=0;//     .param p2, "label2"    # Ljava/lang/String;
a=0;//     .param p3, "version2"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 82
a=0;//     #v3=(Null);
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     .line 83
a=0;//     if-eqz p3, :cond_0
a=0;// 
a=0;//     .line 84
a=0;//     const-string v0, "Unknown version for {}, version for {} is \'{}\'"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v0, p0, p2, p3}, Lcom/j256/ormlite/misc/VersionUtils;->error(Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 94
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 87
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);
a=0;//     if-nez p3, :cond_2
a=0;// 
a=0;//     .line 88
a=0;//     const-string v0, "Unknown version for {}, version for {} is \'{}\'"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v0, p2, p0, p1}, Lcom/j256/ormlite/misc/VersionUtils;->error(Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 89
a=0;//     :cond_2
a=0;//     #v0=(Uninit);
a=0;//     invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 90
a=0;//     const-string v0, "Mismatched versions: {} is \'{}\', while {} is \'{}\'"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     aput-object p0, v1, v2
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     aput-object p1, v1, v2
a=0;// 
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     aput-object p2, v1, v2
a=0;// 
a=0;//     const/4 v2, 0x3
a=0;// 
a=0;//     aput-object p3, v1, v2
a=0;// 
a=0;//     invoke-static {v3, v0, v1}, Lcom/j256/ormlite/misc/VersionUtils;->error(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static readAndroidVersion()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 114
a=0;//     sget-object v0, Lcom/j256/ormlite/misc/VersionUtils;->androidVersionFile:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/j256/ormlite/misc/VersionUtils;->getVersionFromFile(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private static readCoreVersion()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 100
a=0;//     sget-object v0, Lcom/j256/ormlite/misc/VersionUtils;->coreVersionFile:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/j256/ormlite/misc/VersionUtils;->getVersionFromFile(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private static readJdbcVersion()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 107
a=0;//     sget-object v0, Lcom/j256/ormlite/misc/VersionUtils;->jdbcVersionFile:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/j256/ormlite/misc/VersionUtils;->getVersionFromFile(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static setAndroidVersionFile(Ljava/lang/String;)V
a=0;//     .locals 0
a=0;//     .param p0, "androidVersionFile"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 68
a=0;//     sput-object p0, Lcom/j256/ormlite/misc/VersionUtils;->androidVersionFile:Ljava/lang/String;
a=0;// 
a=0;//     .line 69
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static setCoreVersionFile(Ljava/lang/String;)V
a=0;//     .locals 0
a=0;//     .param p0, "coreVersionFile"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 54
a=0;//     sput-object p0, Lcom/j256/ormlite/misc/VersionUtils;->coreVersionFile:Ljava/lang/String;
a=0;// 
a=0;//     .line 55
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static setJdbcVersionFile(Ljava/lang/String;)V
a=0;//     .locals 0
a=0;//     .param p0, "jdbcVersionFile"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 61
a=0;//     sput-object p0, Lcom/j256/ormlite/misc/VersionUtils;->jdbcVersionFile:Ljava/lang/String;
a=0;// 
a=0;//     .line 62
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static setThrownOnErrors(Z)V
a=0;//     .locals 0
a=0;//     .param p0, "thrownOnErrors"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 75
a=0;//     sput-boolean p0, Lcom/j256/ormlite/misc/VersionUtils;->thrownOnErrors:Z
a=0;// 
a=0;//     .line 76
a=0;//     return-void
a=0;// .end method
}}
