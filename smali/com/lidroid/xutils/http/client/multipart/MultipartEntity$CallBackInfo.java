package com.lidroid.xutils.http.client.multipart; class MultipartEntity$CallBackInfo { void a() { int a;
a=0;// .class public Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;
a=0;// .super Ljava/lang/Object;
a=0;// .source "MultipartEntity.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/lidroid/xutils/http/client/multipart/MultipartEntity;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x9
a=0;//     name = "CallBackInfo"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final DEFAULT:Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field public callBackHandler:Lcom/lidroid/xutils/http/callback/RequestCallBackHandler;
a=0;// 
a=0;// .field public pos:J
a=0;// 
a=0;// .field public totalLength:J
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 48
a=0;//     new-instance v0, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;);
a=0;//     invoke-direct {v0}, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;);
a=0;//     sput-object v0, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;->DEFAULT:Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;
a=0;// 
a=0;//     .line 47
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const-wide/16 v1, 0x0
a=0;// 
a=0;//     .line 47
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 49
a=0;//     #p0=(Reference,Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;->callBackHandler:Lcom/lidroid/xutils/http/callback/RequestCallBackHandler;
a=0;// 
a=0;//     .line 50
a=0;//     iput-wide v1, p0, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;->totalLength:J
a=0;// 
a=0;//     .line 51
a=0;//     iput-wide v1, p0, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;->pos:J
a=0;// 
a=0;//     .line 47
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public doCallBack(Z)Z
a=0;//     .locals 6
a=0;//     .param p1, "forceUpdateUI"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 58
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;->callBackHandler:Lcom/lidroid/xutils/http/callback/RequestCallBackHandler;
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/http/callback/RequestCallBackHandler;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 59
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;->callBackHandler:Lcom/lidroid/xutils/http/callback/RequestCallBackHandler;
a=0;// 
a=0;//     iget-wide v1, p0, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;->totalLength:J
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     iget-wide v3, p0, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;->pos:J
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     move v5, p1
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     invoke-interface/range {v0 .. v5}, Lcom/lidroid/xutils/http/callback/RequestCallBackHandler;->updateProgress(JJZ)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 61
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/http/callback/RequestCallBackHandler;);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
}}
