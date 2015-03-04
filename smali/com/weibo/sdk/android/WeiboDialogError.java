package com.weibo.sdk.android; class WeiboDialogError { void a() { int a;
a=0;// .class public Lcom/weibo/sdk/android/WeiboDialogError;
a=0;// .super Ljava/lang/Throwable;
a=0;// .source "WeiboDialogError.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final serialVersionUID:J = 0x1L
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mErrorCode:I
a=0;// 
a=0;// .field private mFailingUrl:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
a=0;//     .locals 0
a=0;//     .param p1, "message"    # Ljava/lang/String;
a=0;//     .param p2, "errorCode"    # I
a=0;//     .param p3, "failingUrl"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 13
a=0;//     invoke-direct {p0, p1}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 14
a=0;//     #p0=(Reference,Lcom/weibo/sdk/android/WeiboDialogError;);
a=0;//     iput p2, p0, Lcom/weibo/sdk/android/WeiboDialogError;->mErrorCode:I
a=0;// 
a=0;//     .line 15
a=0;//     iput-object p3, p0, Lcom/weibo/sdk/android/WeiboDialogError;->mFailingUrl:Ljava/lang/String;
a=0;// 
a=0;//     .line 16
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method getErrorCode()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 22
a=0;//     iget v0, p0, Lcom/weibo/sdk/android/WeiboDialogError;->mErrorCode:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method getFailingUrl()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 29
a=0;//     iget-object v0, p0, Lcom/weibo/sdk/android/WeiboDialogError;->mFailingUrl:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
}}
