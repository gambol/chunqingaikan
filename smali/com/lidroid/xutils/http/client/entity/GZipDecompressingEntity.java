package com.lidroid.xutils.http.client.entity; class GZipDecompressingEntity { void a() { int a;
a=0;// .class public Lcom/lidroid/xutils/http/client/entity/GZipDecompressingEntity;
a=0;// .super Lcom/lidroid/xutils/http/client/entity/DecompressingEntity;
a=0;// .source "GZipDecompressingEntity.java"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lorg/apache/http/HttpEntity;)V
a=0;//     .locals 0
a=0;//     .param p1, "entity"    # Lorg/apache/http/HttpEntity;
a=0;// 
a=0;//     .prologue
a=0;//     .line 35
a=0;//     invoke-direct {p0, p1}, Lcom/lidroid/xutils/http/client/entity/DecompressingEntity;-><init>(Lorg/apache/http/HttpEntity;)V
a=0;// 
a=0;//     .line 36
a=0;//     #p0=(Reference,Lcom/lidroid/xutils/http/client/entity/GZipDecompressingEntity;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method decorate(Ljava/io/InputStream;)Ljava/io/InputStream;
a=0;//     .locals 1
a=0;//     .param p1, "wrapped"    # Ljava/io/InputStream;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 40
a=0;//     new-instance v0, Ljava/util/zip/GZIPInputStream;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/zip/GZIPInputStream;);
a=0;//     invoke-direct {v0, p1}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/zip/GZIPInputStream;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic getContent()Ljava/io/InputStream;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     invoke-super {p0}, Lcom/lidroid/xutils/http/client/entity/DecompressingEntity;->getContent()Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/InputStream;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getContentEncoding()Lorg/apache/http/Header;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 50
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic getContentLength()J
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     invoke-super {p0}, Lcom/lidroid/xutils/http/client/entity/DecompressingEntity;->getContentLength()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic setCallBackHandler(Lcom/lidroid/xutils/http/callback/RequestCallBackHandler;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     invoke-super {p0, p1}, Lcom/lidroid/xutils/http/client/entity/DecompressingEntity;->setCallBackHandler(Lcom/lidroid/xutils/http/callback/RequestCallBackHandler;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic writeTo(Ljava/io/OutputStream;)V
a=0;//     .locals 0
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     invoke-super {p0, p1}, Lcom/lidroid/xutils/http/client/entity/DecompressingEntity;->writeTo(Ljava/io/OutputStream;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
