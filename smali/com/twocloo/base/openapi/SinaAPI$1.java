package com.twocloo.base.openapi; class SinaAPI$1 { void a() { int a;
a=0;// .class Lcom/twocloo/base/openapi/SinaAPI$1;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SinaAPI.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/weibo/sdk/android/WeiboAuthListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/twocloo/base/openapi/SinaAPI;->login(Lcom/twocloo/base/openapi/LoginListener;)V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/twocloo/base/openapi/SinaAPI;
a=0;// 
a=0;// .field private final synthetic val$loginListener:Lcom/twocloo/base/openapi/LoginListener;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/base/openapi/SinaAPI;Lcom/twocloo/base/openapi/LoginListener;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/base/openapi/SinaAPI$1;->this$0:Lcom/twocloo/base/openapi/SinaAPI;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/twocloo/base/openapi/SinaAPI$1;->val$loginListener:Lcom/twocloo/base/openapi/LoginListener;
a=0;// 
a=0;//     .line 43
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/base/openapi/SinaAPI$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onCancel()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 72
a=0;//     iget-object v0, p0, Lcom/twocloo/base/openapi/SinaAPI$1;->this$0:Lcom/twocloo/base/openapi/SinaAPI;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/base/openapi/SinaAPI;);
a=0;//     invoke-static {v0}, Lcom/twocloo/base/openapi/SinaAPI;->access$0(Lcom/twocloo/base/openapi/SinaAPI;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/base/openapi/SinaAPI$1;->this$0:Lcom/twocloo/base/openapi/SinaAPI;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/base/openapi/SinaAPI;);
a=0;//     invoke-static {v1}, Lcom/twocloo/base/openapi/SinaAPI;->access$0(Lcom/twocloo/base/openapi/SinaAPI;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     sget v2, Lcom/twocloo/base/R$string;->common_dialog_title:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "\u65b0\u6d6a\u5fae\u535a\u767b\u9646\u53d6\u6d88"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-static {v0, v1, v2, v3}, Lcom/twocloo/base/util/ViewUtils;->showDialog(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)V
a=0;// 
a=0;//     .line 73
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onComplete(Landroid/os/Bundle;)V
a=0;//     .locals 4
a=0;//     .param p1, "values"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 47
a=0;//     const-string v3, "access_token"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 48
a=0;//     .local v0, "accessToken":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "expires_in"
a=0;// 
a=0;//     invoke-virtual {p1, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 50
a=0;//     .local v1, "expiresIn":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Lcom/weibo/sdk/android/Oauth2AccessToken;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/weibo/sdk/android/Oauth2AccessToken;);
a=0;//     invoke-direct {v2, v0, v1}, Lcom/weibo/sdk/android/Oauth2AccessToken;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 52
a=0;//     .local v2, "token":Lcom/weibo/sdk/android/Oauth2AccessToken;
a=0;//     #v2=(Reference,Lcom/weibo/sdk/android/Oauth2AccessToken;);
a=0;//     iget-object v3, p0, Lcom/twocloo/base/openapi/SinaAPI$1;->this$0:Lcom/twocloo/base/openapi/SinaAPI;
a=0;// 
a=0;//     invoke-static {v3}, Lcom/twocloo/base/openapi/SinaAPI;->access$0(Lcom/twocloo/base/openapi/SinaAPI;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3, v2}, Lcom/weibo/sdk/android/keep/AccessTokenKeeper;->keepAccessToken(Landroid/content/Context;Lcom/weibo/sdk/android/Oauth2AccessToken;)V
a=0;// 
a=0;//     .line 55
a=0;//     iget-object v3, p0, Lcom/twocloo/base/openapi/SinaAPI$1;->val$loginListener:Lcom/twocloo/base/openapi/LoginListener;
a=0;// 
a=0;//     invoke-interface {v3, v0}, Lcom/twocloo/base/openapi/LoginListener;->onComplete(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 56
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onError(Lcom/weibo/sdk/android/WeiboDialogError;)V
a=0;//     .locals 4
a=0;//     .param p1, "e"    # Lcom/weibo/sdk/android/WeiboDialogError;
a=0;// 
a=0;//     .prologue
a=0;//     .line 66
a=0;//     iget-object v0, p0, Lcom/twocloo/base/openapi/SinaAPI$1;->this$0:Lcom/twocloo/base/openapi/SinaAPI;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/base/openapi/SinaAPI;);
a=0;//     invoke-static {v0}, Lcom/twocloo/base/openapi/SinaAPI;->access$0(Lcom/twocloo/base/openapi/SinaAPI;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/base/openapi/SinaAPI$1;->this$0:Lcom/twocloo/base/openapi/SinaAPI;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/base/openapi/SinaAPI;);
a=0;//     invoke-static {v1}, Lcom/twocloo/base/openapi/SinaAPI;->access$0(Lcom/twocloo/base/openapi/SinaAPI;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     sget v2, Lcom/twocloo/base/R$string;->common_dialog_title:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "\u65b0\u6d6a\u5fae\u535a\u767b\u9646\u5931\u8d25"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p1}, Lcom/weibo/sdk/android/WeiboDialogError;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-static {v0, v1, v2, v3}, Lcom/twocloo/base/util/ViewUtils;->showDialog(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)V
a=0;// 
a=0;//     .line 67
a=0;//     invoke-virtual {p1}, Lcom/weibo/sdk/android/WeiboDialogError;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0, p1}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     .line 68
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onWeiboException(Lcom/weibo/sdk/android/WeiboException;)V
a=0;//     .locals 4
a=0;//     .param p1, "e"    # Lcom/weibo/sdk/android/WeiboException;
a=0;// 
a=0;//     .prologue
a=0;//     .line 60
a=0;//     iget-object v0, p0, Lcom/twocloo/base/openapi/SinaAPI$1;->this$0:Lcom/twocloo/base/openapi/SinaAPI;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/base/openapi/SinaAPI;);
a=0;//     invoke-static {v0}, Lcom/twocloo/base/openapi/SinaAPI;->access$0(Lcom/twocloo/base/openapi/SinaAPI;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/base/openapi/SinaAPI$1;->this$0:Lcom/twocloo/base/openapi/SinaAPI;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/base/openapi/SinaAPI;);
a=0;//     invoke-static {v1}, Lcom/twocloo/base/openapi/SinaAPI;->access$0(Lcom/twocloo/base/openapi/SinaAPI;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     sget v2, Lcom/twocloo/base/R$string;->common_dialog_title:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "\u65b0\u6d6a\u5fae\u535a\u767b\u9646\u5931\u8d25"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p1}, Lcom/weibo/sdk/android/WeiboException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-static {v0, v1, v2, v3}, Lcom/twocloo/base/util/ViewUtils;->showDialog(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)V
a=0;// 
a=0;//     .line 61
a=0;//     invoke-virtual {p1}, Lcom/weibo/sdk/android/WeiboException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0, p1}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     .line 62
a=0;//     return-void
a=0;// .end method
}}
