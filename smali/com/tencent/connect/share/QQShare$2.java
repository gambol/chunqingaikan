package com.tencent.connect.share; class QQShare$2 { void a() { int a;
a=0;// .class Lcom/tencent/connect/share/QQShare$2;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ProGuard"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/tencent/utils/AsynLoadImgBack;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/tencent/connect/share/QQShare;->a(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V
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
a=0;// .field final synthetic b:Ljava/lang/String;
a=0;// 
a=0;// .field final synthetic c:Ljava/lang/String;
a=0;// 
a=0;// .field final synthetic d:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;// .field final synthetic e:Landroid/app/Activity;
a=0;// 
a=0;// .field final synthetic f:Lcom/tencent/connect/share/QQShare;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/tencent/connect/share/QQShare;Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;Landroid/app/Activity;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 216
a=0;//     iput-object p1, p0, Lcom/tencent/connect/share/QQShare$2;->f:Lcom/tencent/connect/share/QQShare;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/tencent/connect/share/QQShare$2;->a:Landroid/os/Bundle;
a=0;// 
a=0;//     iput-object p3, p0, Lcom/tencent/connect/share/QQShare$2;->b:Ljava/lang/String;
a=0;// 
a=0;//     iput-object p4, p0, Lcom/tencent/connect/share/QQShare$2;->c:Ljava/lang/String;
a=0;// 
a=0;//     iput-object p5, p0, Lcom/tencent/connect/share/QQShare$2;->d:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     iput-object p6, p0, Lcom/tencent/connect/share/QQShare$2;->e:Landroid/app/Activity;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/connect/share/QQShare$2;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public batchSaved(ILjava/util/ArrayList;)V
a=0;//     .locals 0
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(I",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 238
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public saved(ILjava/lang/String;)V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 219
a=0;//     if-nez p1, :cond_2
a=0;// 
a=0;//     .line 220
a=0;//     iget-object v0, p0, Lcom/tencent/connect/share/QQShare$2;->a:Landroid/os/Bundle;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     const-string v1, "imageLocalUrl"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 231
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/tencent/connect/share/QQShare$2;->f:Lcom/tencent/connect/share/QQShare;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/connect/share/QQShare;);
a=0;//     iget-object v1, p0, Lcom/tencent/connect/share/QQShare$2;->e:Landroid/app/Activity;
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/Activity;);
a=0;//     iget-object v2, p0, Lcom/tencent/connect/share/QQShare$2;->a:Landroid/os/Bundle;
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/Bundle;);
a=0;//     iget-object v3, p0, Lcom/tencent/connect/share/QQShare$2;->d:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     #v3=(Reference,Lcom/tencent/tauth/IUiListener;);
a=0;//     invoke-static {v0, v1, v2, v3}, Lcom/tencent/connect/share/QQShare;->a(Lcom/tencent/connect/share/QQShare;Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V
a=0;// 
a=0;//     .line 232
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 222
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     iget-object v0, p0, Lcom/tencent/connect/share/QQShare$2;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/connect/share/QQShare$2;->c:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 223
a=0;//     iget-object v0, p0, Lcom/tencent/connect/share/QQShare$2;->d:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/tauth/IUiListener;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 224
a=0;//     iget-object v0, p0, Lcom/tencent/connect/share/QQShare$2;->d:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     new-instance v1, Lcom/tencent/tauth/UiError;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/tencent/tauth/UiError;);
a=0;//     const/4 v2, -0x6
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     const-string v3, "\u83b7\u53d6\u5206\u4eab\u56fe\u7247\u5931\u8d25!"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-direct {v1, v2, v3, v4}, Lcom/tencent/tauth/UiError;-><init>(ILjava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/tauth/UiError;);
a=0;//     invoke-interface {v0, v1}, Lcom/tencent/tauth/IUiListener;->onError(Lcom/tencent/tauth/UiError;)V
a=0;// 
a=0;//     .line 226
a=0;//     const-string v0, "shareToQQ"
a=0;// 
a=0;//     const-string v1, "\u83b7\u53d6\u5206\u4eab\u56fe\u7247\u5931\u8d25!"
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/tencent/b/a/g;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
