package com.lidroid.xutils.http.client.multipart.content; class ByteArrayBody { void a() { int a;
a=0;// .class public Lcom/lidroid/xutils/http/client/multipart/content/ByteArrayBody;
a=0;// .super Lcom/lidroid/xutils/http/client/multipart/content/AbstractContentBody;
a=0;// .source "ByteArrayBody.java"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final data:[B
a=0;// 
a=0;// .field private final filename:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>([BLjava/lang/String;)V
a=0;//     .locals 1
a=0;//     .param p1, "data"    # [B
a=0;//     .param p2, "filename"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 63
a=0;//     const-string v0, "application/octet-stream"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, p1, v0, p2}, Lcom/lidroid/xutils/http/client/multipart/content/ByteArrayBody;-><init>([BLjava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 64
a=0;//     #p0=(Reference,Lcom/lidroid/xutils/http/client/multipart/content/ByteArrayBody;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>([BLjava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 2
a=0;//     .param p1, "data"    # [B
a=0;//     .param p2, "mimeType"    # Ljava/lang/String;
a=0;//     .param p3, "filename"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 48
a=0;//     invoke-direct {p0, p2}, Lcom/lidroid/xutils/http/client/multipart/content/AbstractContentBody;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 49
a=0;//     #p0=(Reference,Lcom/lidroid/xutils/http/client/multipart/content/ByteArrayBody;);
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 50
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v1, "byte[] may not be null"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 52
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     iput-object p1, p0, Lcom/lidroid/xutils/http/client/multipart/content/ByteArrayBody;->data:[B
a=0;// 
a=0;//     .line 53
a=0;//     iput-object p3, p0, Lcom/lidroid/xutils/http/client/multipart/content/ByteArrayBody;->filename:Ljava/lang/String;
a=0;// 
a=0;//     .line 54
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getCharset()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 77
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getContentLength()J
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 85
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/client/multipart/content/ByteArrayBody;->data:[B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     array-length v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-long v0, v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public getFilename()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 67
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/client/multipart/content/ByteArrayBody;->filename:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getTransferEncoding()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 81
a=0;//     const-string v0, "binary"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public writeTo(Ljava/io/OutputStream;)V
a=0;//     .locals 5
a=0;//     .param p1, "out"    # Ljava/io/OutputStream;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 71
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/client/multipart/content/ByteArrayBody;->data:[B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write([B)V
a=0;// 
a=0;//     .line 72
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/client/multipart/content/ByteArrayBody;->callBackInfo:Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;
a=0;// 
a=0;//     iget-wide v1, v0, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;->pos:J
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     iget-object v3, p0, Lcom/lidroid/xutils/http/client/multipart/content/ByteArrayBody;->data:[B
a=0;// 
a=0;//     #v3=(Reference,[B);
a=0;//     array-length v3, v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     int-to-long v3, v3
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     add-long/2addr v1, v3
a=0;// 
a=0;//     iput-wide v1, v0, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;->pos:J
a=0;// 
a=0;//     .line 73
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/client/multipart/content/ByteArrayBody;->callBackInfo:Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;->doCallBack(Z)Z
a=0;// 
a=0;//     .line 74
a=0;//     return-void
a=0;// .end method
}}
