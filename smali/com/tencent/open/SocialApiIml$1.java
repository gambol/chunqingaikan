package com.tencent.open; class SocialApiIml$1 { void a() { int a;
a=0;// .class Lcom/tencent/open/SocialApiIml$1;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ProGuard"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/tencent/open/c$a;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/tencent/open/SocialApiIml;->voice(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Landroid/os/Bundle;
a=0;// 
a=0;// .field final synthetic b:Landroid/app/Activity;
a=0;// 
a=0;// .field final synthetic c:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;// .field final synthetic d:Lcom/tencent/open/SocialApiIml;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/tencent/open/SocialApiIml;Landroid/os/Bundle;Landroid/app/Activity;Lcom/tencent/tauth/IUiListener;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 388
a=0;//     iput-object p1, p0, Lcom/tencent/open/SocialApiIml$1;->d:Lcom/tencent/open/SocialApiIml;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/tencent/open/SocialApiIml$1;->a:Landroid/os/Bundle;
a=0;// 
a=0;//     iput-object p3, p0, Lcom/tencent/open/SocialApiIml$1;->b:Landroid/app/Activity;
a=0;// 
a=0;//     iput-object p4, p0, Lcom/tencent/open/SocialApiIml$1;->c:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/open/SocialApiIml$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a(Ljava/lang/String;)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 392
a=0;//     iget-object v0, p0, Lcom/tencent/open/SocialApiIml$1;->a:Landroid/os/Bundle;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     const-string v1, "image_date"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 394
a=0;//     invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 395
a=0;//     iget-object v0, p0, Lcom/tencent/open/SocialApiIml$1;->a:Landroid/os/Bundle;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     const-string v1, "image_date"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 397
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/tencent/open/SocialApiIml$1;->d:Lcom/tencent/open/SocialApiIml;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/open/SocialApiIml;);
a=0;//     iget-object v1, p0, Lcom/tencent/open/SocialApiIml$1;->b:Landroid/app/Activity;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/tencent/open/SocialApiIml$1;->a:Landroid/os/Bundle;
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/Bundle;);
a=0;//     iget-object v3, p0, Lcom/tencent/open/SocialApiIml$1;->c:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     #v3=(Reference,Lcom/tencent/tauth/IUiListener;);
a=0;//     invoke-static {v0, v1, v2, v3}, Lcom/tencent/open/SocialApiIml;->a(Lcom/tencent/open/SocialApiIml;Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V
a=0;// 
a=0;//     .line 398
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public b(Ljava/lang/String;)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 402
a=0;//     iget-object v0, p0, Lcom/tencent/open/SocialApiIml$1;->a:Landroid/os/Bundle;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     const-string v1, "image_date"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 403
a=0;//     new-instance v0, Lcom/tencent/tauth/UiError;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/tauth/UiError;);
a=0;//     const/4 v1, -0x5
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     const-string v2, "\u56fe\u7247\u8bfb\u53d6\u5931\u8d25\uff0c\u8bf7\u68c0\u67e5\u8be5\u56fe\u7247\u662f\u5426\u6709\u6548"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "\u56fe\u7247\u8bfb\u53d6\u5931\u8d25\uff0c\u8bf7\u68c0\u67e5\u8be5\u56fe\u7247\u662f\u5426\u6709\u6548"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1, v2, v3}, Lcom/tencent/tauth/UiError;-><init>(ILjava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 404
a=0;//     #v0=(Reference,Lcom/tencent/tauth/UiError;);
a=0;//     iget-object v1, p0, Lcom/tencent/open/SocialApiIml$1;->c:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/tauth/IUiListener;);
a=0;//     invoke-interface {v1, v0}, Lcom/tencent/tauth/IUiListener;->onError(Lcom/tencent/tauth/UiError;)V
a=0;// 
a=0;//     .line 405
a=0;//     iget-object v0, p0, Lcom/tencent/open/SocialApiIml$1;->d:Lcom/tencent/open/SocialApiIml;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/tencent/open/SocialApiIml;->a(Lcom/tencent/open/SocialApiIml;)V
a=0;// 
a=0;//     .line 406
a=0;//     return-void
a=0;// .end method
}}
