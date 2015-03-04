package com.lidroid.xutils.http.client.entity; class FileUploadEntity { void a() { int a;
a=0;// .class public Lcom/lidroid/xutils/http/client/entity/FileUploadEntity;
a=0;// .super Lorg/apache/http/entity/FileEntity;
a=0;// .source "FileUploadEntity.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/lidroid/xutils/http/client/entity/UploadEntity;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private callBackHandler:Lcom/lidroid/xutils/http/callback/RequestCallBackHandler;
a=0;// 
a=0;// .field private fileSize:J
a=0;// 
a=0;// .field private uploadedSize:J
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Ljava/io/File;Ljava/lang/String;)V
a=0;//     .locals 2
a=0;//     .param p1, "file"    # Ljava/io/File;
a=0;//     .param p2, "contentType"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 33
a=0;//     invoke-direct {p0, p1, p2}, Lorg/apache/http/entity/FileEntity;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 38
a=0;//     #p0=(Reference,Lcom/lidroid/xutils/http/client/entity/FileUploadEntity;);
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iput-wide v0, p0, Lcom/lidroid/xutils/http/client/entity/FileUploadEntity;->uploadedSize:J
a=0;// 
a=0;//     .line 68
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/lidroid/xutils/http/client/entity/FileUploadEntity;->callBackHandler:Lcom/lidroid/xutils/http/callback/RequestCallBackHandler;
a=0;// 
a=0;//     .line 34
a=0;//     invoke-virtual {p1}, Ljava/io/File;->length()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);
a=0;//     iput-wide v0, p0, Lcom/lidroid/xutils/http/client/entity/FileUploadEntity;->fileSize:J
a=0;// 
a=0;//     .line 35
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public setCallBackHandler(Lcom/lidroid/xutils/http/callback/RequestCallBackHandler;)V
a=0;//     .locals 0
a=0;//     .param p1, "callBackHandler"    # Lcom/lidroid/xutils/http/callback/RequestCallBackHandler;
a=0;// 
a=0;//     .prologue
a=0;//     .line 72
a=0;//     iput-object p1, p0, Lcom/lidroid/xutils/http/client/entity/FileUploadEntity;->callBackHandler:Lcom/lidroid/xutils/http/callback/RequestCallBackHandler;
a=0;// 
a=0;//     .line 73
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public writeTo(Ljava/io/OutputStream;)V
a=0;//     .locals 10
a=0;//     .param p1, "outStream"    # Ljava/io/OutputStream;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 42
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 43
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v1, "Output stream may not be null"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 45
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 47
a=0;//     .local v6, "inStream":Ljava/io/BufferedInputStream;
a=0;//     :try_start_0
a=0;//     #v6=(Null);
a=0;//     new-instance v7, Ljava/io/BufferedInputStream;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/io/BufferedInputStream;);
a=0;//     new-instance v0, Ljava/io/FileInputStream;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/FileInputStream;);
a=0;//     iget-object v1, p0, Lcom/lidroid/xutils/http/client/entity/FileUploadEntity;->file:Ljava/io/File;
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-direct {v0, v1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/FileInputStream;);
a=0;//     invoke-direct {v7, v0}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_1
a=0;// 
a=0;//     .line 48
a=0;//     .end local v6    # "inStream":Ljava/io/BufferedInputStream;
a=0;//     .local v7, "inStream":Ljava/io/BufferedInputStream;
a=0;//     #v7=(Reference,Ljava/io/BufferedInputStream;);
a=0;//     const/16 v0, 0x1000
a=0;// 
a=0;//     :try_start_1
a=0;//     #v0=(PosShort);
a=0;//     new-array v9, v0, [B
a=0;// 
a=0;//     .line 50
a=0;//     .local v9, "tmp":[B
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v8=(Conflicted);v9=(Reference,[B);
a=0;//     invoke-virtual {v7, v9}, Ljava/io/BufferedInputStream;->read([B)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     .local v8, "len":I
a=0;//     #v8=(Integer);
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-ne v8, v0, :cond_3
a=0;// 
a=0;//     .line 59
a=0;//     invoke-virtual {p1}, Ljava/io/OutputStream;->flush()V
a=0;// 
a=0;//     .line 60
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/client/entity/FileUploadEntity;->callBackHandler:Lcom/lidroid/xutils/http/callback/RequestCallBackHandler;
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/http/callback/RequestCallBackHandler;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 61
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/client/entity/FileUploadEntity;->callBackHandler:Lcom/lidroid/xutils/http/callback/RequestCallBackHandler;
a=0;// 
a=0;//     iget-wide v1, p0, Lcom/lidroid/xutils/http/client/entity/FileUploadEntity;->fileSize:J
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     iget-wide v3, p0, Lcom/lidroid/xutils/http/client/entity/FileUploadEntity;->uploadedSize:J
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     invoke-interface/range {v0 .. v5}, Lcom/lidroid/xutils/http/callback/RequestCallBackHandler;->updateProgress(JJZ)Z
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 64
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     invoke-static {v7}, Lcom/lidroid/xutils/util/IOUtils;->closeQuietly(Ljava/io/Closeable;)V
a=0;// 
a=0;//     .line 66
a=0;//     return-void
a=0;// 
a=0;//     .line 51
a=0;//     :cond_3
a=0;//     #v0=(Byte);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :try_start_2
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p1, v9, v0, v8}, Ljava/io/OutputStream;->write([BII)V
a=0;// 
a=0;//     .line 52
a=0;//     iget-wide v0, p0, Lcom/lidroid/xutils/http/client/entity/FileUploadEntity;->uploadedSize:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     int-to-long v2, v8
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     add-long/2addr v0, v2
a=0;// 
a=0;//     iput-wide v0, p0, Lcom/lidroid/xutils/http/client/entity/FileUploadEntity;->uploadedSize:J
a=0;// 
a=0;//     .line 53
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/client/entity/FileUploadEntity;->callBackHandler:Lcom/lidroid/xutils/http/callback/RequestCallBackHandler;
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/http/callback/RequestCallBackHandler;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 54
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/client/entity/FileUploadEntity;->callBackHandler:Lcom/lidroid/xutils/http/callback/RequestCallBackHandler;
a=0;// 
a=0;//     iget-wide v1, p0, Lcom/lidroid/xutils/http/client/entity/FileUploadEntity;->fileSize:J
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     iget-wide v3, p0, Lcom/lidroid/xutils/http/client/entity/FileUploadEntity;->uploadedSize:J
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-interface/range {v0 .. v5}, Lcom/lidroid/xutils/http/callback/RequestCallBackHandler;->updateProgress(JJZ)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 55
a=0;//     new-instance v0, Ljava/io/InterruptedIOException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/InterruptedIOException;);
a=0;//     const-string v1, "stop"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/InterruptedIOException;);
a=0;//     throw v0
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     .line 63
a=0;//     .end local v8    # "len":I
a=0;//     .end local v9    # "tmp":[B
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v6, v7
a=0;// 
a=0;//     .line 64
a=0;//     .end local v7    # "inStream":Ljava/io/BufferedInputStream;
a=0;//     .restart local v6    # "inStream":Ljava/io/BufferedInputStream;
a=0;//     :goto_0
a=0;//     #v6=(Reference,Ljava/io/BufferedInputStream;);v7=(Conflicted);
a=0;//     invoke-static {v6}, Lcom/lidroid/xutils/util/IOUtils;->closeQuietly(Ljava/io/Closeable;)V
a=0;// 
a=0;//     .line 65
a=0;//     throw v0
a=0;// 
a=0;//     .line 63
a=0;//     :catchall_1
a=0;//     #v0=(Conflicted);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Null);v8=(Uninit);v9=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// .end method
}}
