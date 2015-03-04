package com.lidroid.xutils.http.client.multipart.content; class AbstractContentBody { void a() { int a;
a=0;// .class public abstract Lcom/lidroid/xutils/http/client/multipart/content/AbstractContentBody;
a=0;// .super Ljava/lang/Object;
a=0;// .source "AbstractContentBody.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/lidroid/xutils/http/client/multipart/content/ContentBody;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field protected callBackInfo:Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;
a=0;// 
a=0;// .field private final mediaType:Ljava/lang/String;
a=0;// 
a=0;// .field private final mimeType:Ljava/lang/String;
a=0;// 
a=0;// .field private final subType:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Ljava/lang/String;)V
a=0;//     .locals 3
a=0;//     .param p1, "mimeType"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 30
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 57
a=0;//     #p0=(Reference,Lcom/lidroid/xutils/http/client/multipart/content/AbstractContentBody;);
a=0;//     sget-object v1, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;->DEFAULT:Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;
a=0;// 
a=0;//     #v1=(Reference,Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;);
a=0;//     iput-object v1, p0, Lcom/lidroid/xutils/http/client/multipart/content/AbstractContentBody;->callBackInfo:Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;
a=0;// 
a=0;//     .line 31
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 32
a=0;//     new-instance v1, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v2, "MIME type may not be null"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 34
a=0;//     :cond_0
a=0;//     #v2=(Uninit);
a=0;//     iput-object p1, p0, Lcom/lidroid/xutils/http/client/multipart/content/AbstractContentBody;->mimeType:Ljava/lang/String;
a=0;// 
a=0;//     .line 35
a=0;//     const/16 v1, 0x2f
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {p1, v1}, Ljava/lang/String;->indexOf(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 36
a=0;//     .local v0, "i":I
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-eq v0, v1, :cond_1
a=0;// 
a=0;//     .line 37
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p1, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iput-object v1, p0, Lcom/lidroid/xutils/http/client/multipart/content/AbstractContentBody;->mediaType:Ljava/lang/String;
a=0;// 
a=0;//     .line 38
a=0;//     add-int/lit8 v1, v0, 0x1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iput-object v1, p0, Lcom/lidroid/xutils/http/client/multipart/content/AbstractContentBody;->subType:Ljava/lang/String;
a=0;// 
a=0;//     .line 43
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 40
a=0;//     :cond_1
a=0;//     #v1=(Byte);
a=0;//     iput-object p1, p0, Lcom/lidroid/xutils/http/client/multipart/content/AbstractContentBody;->mediaType:Ljava/lang/String;
a=0;// 
a=0;//     .line 41
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput-object v1, p0, Lcom/lidroid/xutils/http/client/multipart/content/AbstractContentBody;->subType:Ljava/lang/String;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getMediaType()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 50
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/client/multipart/content/AbstractContentBody;->mediaType:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getMimeType()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 46
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/client/multipart/content/AbstractContentBody;->mimeType:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getSubType()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 54
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/client/multipart/content/AbstractContentBody;->subType:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public setCallBackInfo(Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;)V
a=0;//     .locals 0
a=0;//     .param p1, "callBackInfo"    # Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;
a=0;// 
a=0;//     .prologue
a=0;//     .line 61
a=0;//     iput-object p1, p0, Lcom/lidroid/xutils/http/client/multipart/content/AbstractContentBody;->callBackInfo:Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;
a=0;// 
a=0;//     .line 62
a=0;//     return-void
a=0;// .end method
}}
