package com.tencent.connect.common; class AssistActivity { void a() { int a;
a=0;// .class public Lcom/tencent/connect/common/AssistActivity;
a=0;// .super Landroid/app/Activity;
a=0;// .source "ProGuard"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static sApiObject:Lcom/tencent/connect/common/BaseApi;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mAPiObject:Lcom/tencent/connect/common/BaseApi;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 9
a=0;//     invoke-direct {p0}, Landroid/app/Activity;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/connect/common/AssistActivity;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static getAssistActivityIntent(Landroid/content/Context;)Landroid/content/Intent;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 13
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     const-class v1, Lcom/tencent/connect/common/AssistActivity;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 14
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static setApiObject(Lcom/tencent/connect/common/BaseApi;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 43
a=0;//     sput-object p0, Lcom/tencent/connect/common/AssistActivity;->sApiObject:Lcom/tencent/connect/common/BaseApi;
a=0;// 
a=0;//     .line 44
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected onActivityResult(IILandroid/content/Intent;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 34
a=0;//     invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onActivityResult(IILandroid/content/Intent;)V
a=0;// 
a=0;//     .line 35
a=0;//     iget-object v0, p0, Lcom/tencent/connect/common/AssistActivity;->mAPiObject:Lcom/tencent/connect/common/BaseApi;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/connect/common/BaseApi;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 36
a=0;//     iget-object v0, p0, Lcom/tencent/connect/common/AssistActivity;->mAPiObject:Lcom/tencent/connect/common/BaseApi;
a=0;// 
a=0;//     invoke-virtual {v0, p1, p2, p3}, Lcom/tencent/connect/common/BaseApi;->onActivityResult(IILandroid/content/Intent;)V
a=0;// 
a=0;//     .line 39
a=0;//     :cond_0
a=0;//     invoke-virtual {p0}, Lcom/tencent/connect/common/AssistActivity;->finish()V
a=0;// 
a=0;//     .line 40
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onCreate(Landroid/os/Bundle;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 19
a=0;//     invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 20
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-virtual {p0, v0}, Lcom/tencent/connect/common/AssistActivity;->requestWindowFeature(I)Z
a=0;// 
a=0;//     .line 22
a=0;//     sget-object v0, Lcom/tencent/connect/common/AssistActivity;->sApiObject:Lcom/tencent/connect/common/BaseApi;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/connect/common/BaseApi;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 23
a=0;//     invoke-virtual {p0}, Lcom/tencent/connect/common/AssistActivity;->finish()V
a=0;// 
a=0;//     .line 30
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 26
a=0;//     :cond_0
a=0;//     #v0=(Reference,Lcom/tencent/connect/common/BaseApi;);v1=(Uninit);v2=(Uninit);
a=0;//     sget-object v0, Lcom/tencent/connect/common/AssistActivity;->sApiObject:Lcom/tencent/connect/common/BaseApi;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/tencent/connect/common/AssistActivity;->mAPiObject:Lcom/tencent/connect/common/BaseApi;
a=0;// 
a=0;//     .line 27
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput-object v0, Lcom/tencent/connect/common/AssistActivity;->sApiObject:Lcom/tencent/connect/common/BaseApi;
a=0;// 
a=0;//     .line 28
a=0;//     iget-object v0, p0, Lcom/tencent/connect/common/AssistActivity;->mAPiObject:Lcom/tencent/connect/common/BaseApi;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/connect/common/BaseApi;);
a=0;//     invoke-virtual {v0}, Lcom/tencent/connect/common/BaseApi;->getActivityIntent()Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "key_request_code"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 29
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lcom/tencent/connect/common/AssistActivity;->mAPiObject:Lcom/tencent/connect/common/BaseApi;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/tencent/connect/common/BaseApi;->getActivityIntent()Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {p0, v1, v0}, Lcom/tencent/connect/common/AssistActivity;->startActivityForResult(Landroid/content/Intent;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
