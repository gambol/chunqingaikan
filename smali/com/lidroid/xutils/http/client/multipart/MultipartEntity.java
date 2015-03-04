package com.lidroid.xutils.http.client.multipart; class MultipartEntity { void a() { int a;
a=0;// .class public Lcom/lidroid/xutils/http/client/multipart/MultipartEntity;
a=0;// .super Ljava/lang/Object;
a=0;// .source "MultipartEntity.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/lidroid/xutils/http/client/entity/UploadEntity;
a=0;// .implements Lorg/apache/http/HttpEntity;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final MULTIPART_CHARS:[C
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final boundary:Ljava/lang/String;
a=0;// 
a=0;// .field private callBackInfo:Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;
a=0;// 
a=0;// .field private final charset:Ljava/nio/charset/Charset;
a=0;// 
a=0;// .field private contentType:Lorg/apache/http/Header;
a=0;// 
a=0;// .field private volatile dirty:Z
a=0;// 
a=0;// .field private length:J
a=0;// 
a=0;// .field private final multipart:Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;
a=0;// 
a=0;// .field private multipartSubtype:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 69
a=0;//     const-string v0, "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"
a=0;// 
a=0;//     .line 70
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 68
a=0;//     sput-object v0, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity;->MULTIPART_CHARS:[C
a=0;// 
a=0;//     .line 37
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 124
a=0;//     #v1=(Null);
a=0;//     sget-object v0, Lcom/lidroid/xutils/http/client/multipart/HttpMultipartMode;->STRICT:Lcom/lidroid/xutils/http/client/multipart/HttpMultipartMode;
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/http/client/multipart/HttpMultipartMode;);
a=0;//     invoke-direct {p0, v0, v1, v1}, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity;-><init>(Lcom/lidroid/xutils/http/client/multipart/HttpMultipartMode;Ljava/lang/String;Ljava/nio/charset/Charset;)V
a=0;// 
a=0;//     .line 125
a=0;//     #p0=(Reference,Lcom/lidroid/xutils/http/client/multipart/MultipartEntity;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Lcom/lidroid/xutils/http/client/multipart/HttpMultipartMode;)V
a=0;//     .locals 1
a=0;//     .param p1, "mode"    # Lcom/lidroid/xutils/http/client/multipart/HttpMultipartMode;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 117
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, v0, v0}, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity;-><init>(Lcom/lidroid/xutils/http/client/multipart/HttpMultipartMode;Ljava/lang/String;Ljava/nio/charset/Charset;)V
a=0;// 
a=0;//     .line 118
a=0;//     #p0=(Reference,Lcom/lidroid/xutils/http/client/multipart/MultipartEntity;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Lcom/lidroid/xutils/http/client/multipart/HttpMultipartMode;Ljava/lang/String;Ljava/nio/charset/Charset;)V
a=0;//     .locals 4
a=0;//     .param p1, "mode"    # Lcom/lidroid/xutils/http/client/multipart/HttpMultipartMode;
a=0;//     .param p2, "boundary"    # Ljava/lang/String;
a=0;//     .param p3, "charset"    # Ljava/nio/charset/Charset;
a=0;// 
a=0;//     .prologue
a=0;//     .line 94
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 39
a=0;//     #p0=(Reference,Lcom/lidroid/xutils/http/client/multipart/MultipartEntity;);
a=0;//     new-instance v0, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;);
a=0;//     invoke-direct {v0}, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;);
a=0;//     iput-object v0, p0, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity;->callBackInfo:Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;
a=0;// 
a=0;//     .line 128
a=0;//     const-string v0, "form-data"
a=0;// 
a=0;//     iput-object v0, p0, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity;->multipartSubtype:Ljava/lang/String;
a=0;// 
a=0;//     .line 95
a=0;//     if-nez p2, :cond_0
a=0;// 
a=0;//     .line 96
a=0;//     invoke-virtual {p0}, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity;->generateBoundary()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object p2
a=0;// 
a=0;//     .line 98
a=0;//     :cond_0
a=0;//     iput-object p2, p0, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity;->boundary:Ljava/lang/String;
a=0;// 
a=0;//     .line 99
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     .line 100
a=0;//     sget-object p1, Lcom/lidroid/xutils/http/client/multipart/HttpMultipartMode;->STRICT:Lcom/lidroid/xutils/http/client/multipart/HttpMultipartMode;
a=0;// 
a=0;//     .line 102
a=0;//     :cond_1
a=0;//     if-eqz p3, :cond_2
a=0;// 
a=0;//     .end local p3    # "charset":Ljava/nio/charset/Charset;
a=0;//     :goto_0
a=0;//     iput-object p3, p0, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity;->charset:Ljava/nio/charset/Charset;
a=0;// 
a=0;//     .line 103
a=0;//     new-instance v0, Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;);
a=0;//     iget-object v1, p0, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity;->multipartSubtype:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity;->charset:Ljava/nio/charset/Charset;
a=0;// 
a=0;//     #v2=(Reference,Ljava/nio/charset/Charset;);
a=0;//     iget-object v3, p0, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity;->boundary:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1, v2, v3, p1}, Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;-><init>(Ljava/lang/String;Ljava/nio/charset/Charset;Ljava/lang/String;Lcom/lidroid/xutils/http/client/multipart/HttpMultipartMode;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;);
a=0;//     iput-object v0, p0, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity;->multipart:Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;
a=0;// 
a=0;//     .line 104
a=0;//     new-instance v0, Lorg/apache/http/message/BasicHeader;
a=0;// 
a=0;//     .line 105
a=0;//     #v0=(UninitRef,Lorg/apache/http/message/BasicHeader;);
a=0;//     const-string v1, "Content-Type"
a=0;// 
a=0;//     .line 106
a=0;//     iget-object v2, p0, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity;->boundary:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v3, p0, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity;->charset:Ljava/nio/charset/Charset;
a=0;// 
a=0;//     invoke-virtual {p0, v2, v3}, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity;->generateContentType(Ljava/lang/String;Ljava/nio/charset/Charset;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v0, v1, v2}, Lorg/apache/http/message/BasicHeader;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 104
a=0;//     #v0=(Reference,Lorg/apache/http/message/BasicHeader;);
a=0;//     iput-object v0, p0, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity;->contentType:Lorg/apache/http/Header;
a=0;// 
a=0;//     .line 107
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity;->dirty:Z
a=0;// 
a=0;//     .line 108
a=0;//     return-void
a=0;// 
a=0;//     .line 102
a=0;//     .restart local p3    # "charset":Ljava/nio/charset/Charset;
a=0;//     :cond_2
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     sget-object p3, Lcom/lidroid/xutils/http/client/multipart/MIME;->DEFAULT_CHARSET:Ljava/nio/charset/Charset;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public addPart(Lcom/lidroid/xutils/http/client/multipart/FormBodyPart;)V
a=0;//     .locals 1
a=0;//     .param p1, "bodyPart"    # Lcom/lidroid/xutils/http/client/multipart/FormBodyPart;
a=0;// 
a=0;//     .prologue
a=0;//     .line 165
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity;->multipart:Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;);
a=0;//     invoke-virtual {v0, p1}, Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;->addBodyPart(Lcom/lidroid/xutils/http/client/multipart/FormBodyPart;)V
a=0;// 
a=0;//     .line 166
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity;->dirty:Z
a=0;// 
a=0;//     .line 167
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public addPart(Ljava/lang/String;Lcom/lidroid/xutils/http/client/multipart/content/ContentBody;)V
a=0;//     .locals 1
a=0;//     .param p1, "name"    # Ljava/lang/String;
a=0;//     .param p2, "contentBody"    # Lcom/lidroid/xutils/http/client/multipart/content/ContentBody;
a=0;// 
a=0;//     .prologue
a=0;//     .line 170
a=0;//     new-instance v0, Lcom/lidroid/xutils/http/client/multipart/FormBodyPart;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/lidroid/xutils/http/client/multipart/FormBodyPart;);
a=0;//     invoke-direct {v0, p1, p2}, Lcom/lidroid/xutils/http/client/multipart/FormBodyPart;-><init>(Ljava/lang/String;Lcom/lidroid/xutils/http/client/multipart/content/ContentBody;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/http/client/multipart/FormBodyPart;);
a=0;//     invoke-virtual {p0, v0}, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity;->addPart(Lcom/lidroid/xutils/http/client/multipart/FormBodyPart;)V
a=0;// 
a=0;//     .line 171
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public addPart(Ljava/lang/String;Lcom/lidroid/xutils/http/client/multipart/content/ContentBody;Ljava/lang/String;)V
a=0;//     .locals 1
a=0;//     .param p1, "name"    # Ljava/lang/String;
a=0;//     .param p2, "contentBody"    # Lcom/lidroid/xutils/http/client/multipart/content/ContentBody;
a=0;//     .param p3, "contentDisposition"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 174
a=0;//     new-instance v0, Lcom/lidroid/xutils/http/client/multipart/FormBodyPart;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/lidroid/xutils/http/client/multipart/FormBodyPart;);
a=0;//     invoke-direct {v0, p1, p2, p3}, Lcom/lidroid/xutils/http/client/multipart/FormBodyPart;-><init>(Ljava/lang/String;Lcom/lidroid/xutils/http/client/multipart/content/ContentBody;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/http/client/multipart/FormBodyPart;);
a=0;//     invoke-virtual {p0, v0}, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity;->addPart(Lcom/lidroid/xutils/http/client/multipart/FormBodyPart;)V
a=0;// 
a=0;//     .line 175
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public consumeContent()V
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;,
a=0;//             Ljava/lang/UnsupportedOperationException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 213
a=0;//     invoke-virtual {p0}, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity;->isStreaming()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 214
a=0;//     new-instance v0, Ljava/lang/UnsupportedOperationException;
a=0;// 
a=0;//     .line 215
a=0;//     #v0=(UninitRef,Ljava/lang/UnsupportedOperationException;);
a=0;//     const-string v1, "Streaming entity does not implement #consumeContent()"
a=0;// 
a=0;//     .line 214
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/UnsupportedOperationException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 217
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected generateBoundary()Ljava/lang/String;
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 155
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     .line 156
a=0;//     .local v0, "buffer":Ljava/lang/StringBuilder;
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     new-instance v3, Ljava/util/Random;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/util/Random;);
a=0;//     invoke-direct {v3}, Ljava/util/Random;-><init>()V
a=0;// 
a=0;//     .line 157
a=0;//     .local v3, "rand":Ljava/util/Random;
a=0;//     #v3=(Reference,Ljava/util/Random;);
a=0;//     const/16 v4, 0xb
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-virtual {v3, v4}, Ljava/util/Random;->nextInt(I)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-int/lit8 v1, v4, 0x1e
a=0;// 
a=0;//     .line 158
a=0;//     .local v1, "count":I
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .local v2, "i":I
a=0;//     :goto_0
a=0;//     #v2=(Integer);v5=(Conflicted);
a=0;//     if-lt v2, v1, :cond_0
a=0;// 
a=0;//     .line 161
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     return-object v4
a=0;// 
a=0;//     .line 159
a=0;//     :cond_0
a=0;//     #v4=(Integer);
a=0;//     sget-object v4, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity;->MULTIPART_CHARS:[C
a=0;// 
a=0;//     #v4=(Reference,[C);
a=0;//     sget-object v5, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity;->MULTIPART_CHARS:[C
a=0;// 
a=0;//     #v5=(Reference,[C);
a=0;//     array-length v5, v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v3, v5}, Ljava/util/Random;->nextInt(I)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     aget-char v4, v4, v5
a=0;// 
a=0;//     #v4=(Char);
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 158
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected generateContentType(Ljava/lang/String;Ljava/nio/charset/Charset;)Ljava/lang/String;
a=0;//     .locals 3
a=0;//     .param p1, "boundary"    # Ljava/lang/String;
a=0;//     .param p2, "charset"    # Ljava/nio/charset/Charset;
a=0;// 
a=0;//     .prologue
a=0;//     .line 144
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     .line 145
a=0;//     .local v0, "buffer":Ljava/lang/StringBuilder;
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "multipart/"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v2, p0, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity;->multipartSubtype:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "; boundary="
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 146
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 151
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method public getContent()Ljava/io/InputStream;
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;,
a=0;//             Ljava/lang/UnsupportedOperationException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 220
a=0;//     new-instance v0, Ljava/lang/UnsupportedOperationException;
a=0;// 
a=0;//     .line 221
a=0;//     #v0=(UninitRef,Ljava/lang/UnsupportedOperationException;);
a=0;//     const-string v1, "Multipart form entity does not implement #getContent()"
a=0;// 
a=0;//     .line 220
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/UnsupportedOperationException;);
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public getContentEncoding()Lorg/apache/http/Header;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 208
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
a=0;//     .line 196
a=0;//     iget-boolean v0, p0, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity;->dirty:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 197
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity;->multipart:Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;);
a=0;//     invoke-virtual {v0}, Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;->getTotalLength()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iput-wide v0, p0, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity;->length:J
a=0;// 
a=0;//     .line 198
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity;->dirty:Z
a=0;// 
a=0;//     .line 200
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Conflicted);
a=0;//     iget-wide v0, p0, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity;->length:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public getContentType()Lorg/apache/http/Header;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 204
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity;->contentType:Lorg/apache/http/Header;
a=0;// 
a=0;//     #v0=(Reference,Lorg/apache/http/Header;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public isChunked()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 188
a=0;//     invoke-virtual {p0}, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity;->isRepeatable()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public isRepeatable()Z
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     .line 178
a=0;//     iget-object v2, p0, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity;->multipart:Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;
a=0;// 
a=0;//     #v2=(Reference,Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;);
a=0;//     invoke-virtual {v2}, Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;->getBodyParts()Ljava/util/List;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     .line 184
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Boolean);v3=(Byte);
a=0;//     return v2
a=0;// 
a=0;//     .line 178
a=0;//     :cond_1
a=0;//     #v2=(Reference,Ljava/util/Iterator;);v3=(Boolean);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Lcom/lidroid/xutils/http/client/multipart/FormBodyPart;
a=0;// 
a=0;//     .line 179
a=0;//     .local v1, "part":Lcom/lidroid/xutils/http/client/multipart/FormBodyPart;
a=0;//     invoke-virtual {v1}, Lcom/lidroid/xutils/http/client/multipart/FormBodyPart;->getBody()Lcom/lidroid/xutils/http/client/multipart/content/ContentBody;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 180
a=0;//     .local v0, "body":Lcom/lidroid/xutils/http/client/multipart/content/ContentBody;
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/http/client/multipart/content/ContentBody;);
a=0;//     invoke-interface {v0}, Lcom/lidroid/xutils/http/client/multipart/content/ContentBody;->getContentLength()J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     const-wide/16 v5, 0x0
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     cmp-long v3, v3, v5
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-gez v3, :cond_0
a=0;// 
a=0;//     .line 181
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public isStreaming()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 192
a=0;//     invoke-virtual {p0}, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity;->isRepeatable()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setCallBackHandler(Lcom/lidroid/xutils/http/callback/RequestCallBackHandler;)V
a=0;//     .locals 1
a=0;//     .param p1, "callBackHandler"    # Lcom/lidroid/xutils/http/callback/RequestCallBackHandler;
a=0;// 
a=0;//     .prologue
a=0;//     .line 43
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity;->callBackInfo:Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;);
a=0;//     iput-object p1, v0, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;->callBackHandler:Lcom/lidroid/xutils/http/callback/RequestCallBackHandler;
a=0;// 
a=0;//     .line 44
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setMultipartSubtype(Ljava/lang/String;)V
a=0;//     .locals 4
a=0;//     .param p1, "multipartSubtype"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 134
a=0;//     iput-object p1, p0, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity;->multipartSubtype:Ljava/lang/String;
a=0;// 
a=0;//     .line 135
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity;->multipart:Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;);
a=0;//     invoke-virtual {v0, p1}, Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;->setSubType(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 136
a=0;//     new-instance v0, Lorg/apache/http/message/BasicHeader;
a=0;// 
a=0;//     .line 137
a=0;//     #v0=(UninitRef,Lorg/apache/http/message/BasicHeader;);
a=0;//     const-string v1, "Content-Type"
a=0;// 
a=0;//     .line 138
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity;->boundary:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iget-object v3, p0, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity;->charset:Ljava/nio/charset/Charset;
a=0;// 
a=0;//     #v3=(Reference,Ljava/nio/charset/Charset;);
a=0;//     invoke-virtual {p0, v2, v3}, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity;->generateContentType(Ljava/lang/String;Ljava/nio/charset/Charset;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v0, v1, v2}, Lorg/apache/http/message/BasicHeader;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 136
a=0;//     #v0=(Reference,Lorg/apache/http/message/BasicHeader;);
a=0;//     iput-object v0, p0, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity;->contentType:Lorg/apache/http/Header;
a=0;// 
a=0;//     .line 139
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public writeTo(Ljava/io/OutputStream;)V
a=0;//     .locals 3
a=0;//     .param p1, "outStream"    # Ljava/io/OutputStream;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 225
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity;->callBackInfo:Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;);
a=0;//     invoke-virtual {p0}, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity;->getContentLength()J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     iput-wide v1, v0, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;->totalLength:J
a=0;// 
a=0;//     .line 226
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity;->multipart:Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity;->callBackInfo:Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;
a=0;// 
a=0;//     #v1=(Reference,Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;);
a=0;//     invoke-virtual {v0, p1, v1}, Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;->writeTo(Ljava/io/OutputStream;Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;)V
a=0;// 
a=0;//     .line 227
a=0;//     return-void
a=0;// .end method
}}
