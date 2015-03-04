package com.ccit.mmwlan.util; class ReadConfigFile { void a() { int a;
a=0;// .class public Lcom/ccit/mmwlan/util/ReadConfigFile;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ReadConfigFile.java"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 28
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/ccit/mmwlan/util/ReadConfigFile;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static main([Ljava/lang/String;)V
a=0;//     .locals 0
a=0;//     .param p0, "args"    # [Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 60
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getConfigInfo(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 6
a=0;//     .param p1, "key"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 39
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 41
a=0;//     .local v3, "result":Ljava/lang/String;
a=0;//     :try_start_0
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v4}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 42
a=0;//     const-string v5, "config.properties"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/ClassLoader;->getResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 43
a=0;//     .local v1, "inputStream":Ljava/io/InputStream;
a=0;//     #v1=(Reference,Ljava/io/InputStream;);
a=0;//     new-instance v2, Ljava/util/Properties;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/Properties;);
a=0;//     invoke-direct {v2}, Ljava/util/Properties;-><init>()V
a=0;// 
a=0;//     .line 44
a=0;//     .local v2, "pro":Ljava/util/Properties;
a=0;//     #v2=(Reference,Ljava/util/Properties;);
a=0;//     invoke-virtual {v2, v1}, Ljava/util/Properties;->load(Ljava/io/InputStream;)V
a=0;// 
a=0;//     .line 45
a=0;//     invoke-virtual {v2, p1}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v4, v3
a=0;// 
a=0;//     .line 51
a=0;//     .end local v1    # "inputStream":Ljava/io/InputStream;
a=0;//     .end local v2    # "pro":Ljava/util/Properties;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v4
a=0;// 
a=0;//     .line 46
a=0;//     :catch_0
a=0;//     #v0=(Uninit);v3=(Null);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 47
a=0;//     .local v0, "e":Ljava/io/IOException;
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     .line 48
a=0;//     const-string v4, "ReadConfigFile"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 49
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     goto :goto_0
a=0;// .end method
}}
