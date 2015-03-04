package com.lidroid.xutils.http.callback; class StringDownloadHandler { void a() { int a;
a=0;// .class public Lcom/lidroid/xutils/http/callback/StringDownloadHandler;
a=0;// .super Ljava/lang/Object;
a=0;// .source "StringDownloadHandler.java"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 27
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/lidroid/xutils/http/callback/StringDownloadHandler;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public handleEntity(Lorg/apache/http/HttpEntity;Lcom/lidroid/xutils/http/callback/RequestCallBackHandler;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 12
a=0;//     .param p1, "entity"    # Lorg/apache/http/HttpEntity;
a=0;//     .param p2, "callBackHandler"    # Lcom/lidroid/xutils/http/callback/RequestCallBackHandler;
a=0;//     .param p3, "charset"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     .line 30
a=0;//     #v5=(One);
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     move-object v0, v10
a=0;// 
a=0;//     .line 60
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(PosByte);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 32
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(One);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Null);v11=(Uninit);
a=0;//     const-wide/16 v3, 0x0
a=0;// 
a=0;//     .line 33
a=0;//     .local v3, "current":J
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-interface {p1}, Lorg/apache/http/HttpEntity;->getContentLength()J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     .line 35
a=0;//     .local v1, "total":J
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     if-eqz p2, :cond_1
a=0;// 
a=0;//     move-object v0, p2
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/http/callback/RequestCallBackHandler;);
a=0;//     invoke-interface/range {v0 .. v5}, Lcom/lidroid/xutils/http/callback/RequestCallBackHandler;->updateProgress(JJZ)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     move-object v0, v10
a=0;// 
a=0;//     .line 36
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 39
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 40
a=0;//     .local v6, "inputStream":Ljava/io/InputStream;
a=0;//     #v6=(Null);
a=0;//     new-instance v9, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v9=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     .line 42
a=0;//     .local v9, "sb":Ljava/lang/StringBuilder;
a=0;//     :try_start_0
a=0;//     #v9=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-interface {p1}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 43
a=0;//     #v6=(Reference,Ljava/io/InputStream;);
a=0;//     new-instance v8, Ljava/io/BufferedReader;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/io/BufferedReader;);
a=0;//     new-instance v0, Ljava/io/InputStreamReader;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/InputStreamReader;);
a=0;//     invoke-direct {v0, v6, p3}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/InputStreamReader;);
a=0;//     invoke-direct {v8, v0}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
a=0;// 
a=0;//     .line 44
a=0;//     .local v8, "reader":Ljava/io/BufferedReader;
a=0;//     #v8=(Reference,Ljava/io/BufferedReader;);
a=0;//     const-string v7, ""
a=0;// 
a=0;//     .line 45
a=0;//     .local v7, "line":Ljava/lang/String;
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v5=(PosByte);v7=(Reference,Ljava/lang/String;);v10=(Conflicted);v11=(Conflicted);
a=0;//     invoke-virtual {v8}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     if-nez v7, :cond_4
a=0;// 
a=0;//     .line 54
a=0;//     :goto_1
a=0;//     if-eqz p2, :cond_3
a=0;// 
a=0;//     .line 55
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     move-object v0, p2
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/http/callback/RequestCallBackHandler;);
a=0;//     invoke-interface/range {v0 .. v5}, Lcom/lidroid/xutils/http/callback/RequestCallBackHandler;->updateProgress(JJZ)Z
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 58
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v5=(PosByte);
a=0;//     invoke-static {v6}, Lcom/lidroid/xutils/util/IOUtils;->closeQuietly(Ljava/io/Closeable;)V
a=0;// 
a=0;//     .line 60
a=0;//     invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 46
a=0;//     :cond_4
a=0;//     :try_start_1
a=0;//     #v0=(Conflicted);
a=0;//     invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const/16 v5, 0xa
a=0;// 
a=0;//     invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 47
a=0;//     invoke-static {v7, p3}, Lcom/lidroid/xutils/util/OtherUtils;->sizeOfString(Ljava/lang/String;Ljava/lang/String;)J
a=0;// 
a=0;//     move-result-wide v10
a=0;// 
a=0;//     #v10=(LongLo);v11=(LongHi);
a=0;//     add-long/2addr v3, v10
a=0;// 
a=0;//     .line 48
a=0;//     if-eqz p2, :cond_2
a=0;// 
a=0;//     .line 49
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     move-object v0, p2
a=0;// 
a=0;//     invoke-interface/range {v0 .. v5}, Lcom/lidroid/xutils/http/callback/RequestCallBackHandler;->updateProgress(JJZ)Z
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 57
a=0;//     .end local v7    # "line":Ljava/lang/String;
a=0;//     .end local v8    # "reader":Ljava/io/BufferedReader;
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v5=(PosByte);v7=(Conflicted);v8=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 58
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-static {v6}, Lcom/lidroid/xutils/util/IOUtils;->closeQuietly(Ljava/io/Closeable;)V
a=0;// 
a=0;//     .line 59
a=0;//     throw v0
a=0;// .end method
}}
