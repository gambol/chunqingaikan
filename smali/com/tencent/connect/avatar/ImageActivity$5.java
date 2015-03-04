package com.tencent.connect.avatar; class ImageActivity$5 { void a() { int a;
a=0;// .class Lcom/tencent/connect/avatar/ImageActivity$5;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ProGuard"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/tencent/connect/avatar/ImageActivity;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Lcom/tencent/connect/avatar/ImageActivity;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/tencent/connect/avatar/ImageActivity;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 623
a=0;//     iput-object p1, p0, Lcom/tencent/connect/avatar/ImageActivity$5;->a:Lcom/tencent/connect/avatar/ImageActivity;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/connect/avatar/ImageActivity$5;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onCancel()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 678
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onComplete(Ljava/lang/Object;)V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     .line 642
a=0;//     #v1=(Byte);
a=0;//     iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity$5;->a:Lcom/tencent/connect/avatar/ImageActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/connect/avatar/ImageActivity;);
a=0;//     invoke-static {v0}, Lcom/tencent/connect/avatar/ImageActivity;->e(Lcom/tencent/connect/avatar/ImageActivity;)Landroid/widget/Button;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Landroid/widget/Button;->setEnabled(Z)V
a=0;// 
a=0;//     .line 643
a=0;//     iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity$5;->a:Lcom/tencent/connect/avatar/ImageActivity;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/tencent/connect/avatar/ImageActivity;->e(Lcom/tencent/connect/avatar/ImageActivity;)Landroid/widget/Button;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/Button;->setTextColor(I)V
a=0;// 
a=0;//     .line 644
a=0;//     iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity$5;->a:Lcom/tencent/connect/avatar/ImageActivity;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/tencent/connect/avatar/ImageActivity;->f(Lcom/tencent/connect/avatar/ImageActivity;)Landroid/widget/Button;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Landroid/widget/Button;->setEnabled(Z)V
a=0;// 
a=0;//     .line 645
a=0;//     iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity$5;->a:Lcom/tencent/connect/avatar/ImageActivity;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/tencent/connect/avatar/ImageActivity;->f(Lcom/tencent/connect/avatar/ImageActivity;)Landroid/widget/Button;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/Button;->setTextColor(I)V
a=0;// 
a=0;//     .line 646
a=0;//     iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity$5;->a:Lcom/tencent/connect/avatar/ImageActivity;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/tencent/connect/avatar/ImageActivity;->d(Lcom/tencent/connect/avatar/ImageActivity;)Landroid/widget/ProgressBar;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/16 v2, 0x8
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/ProgressBar;->setVisibility(I)V
a=0;// 
a=0;//     .line 647
a=0;//     check-cast p1, Lorg/json/JSONObject;
a=0;// 
a=0;//     .line 650
a=0;//     :try_start_0
a=0;//     const-string v0, "ret"
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;//     :try_end_0
a=0;//     .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 654
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 655
a=0;//     iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity$5;->a:Lcom/tencent/connect/avatar/ImageActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/connect/avatar/ImageActivity;);
a=0;//     const-string v1, "\u8bbe\u7f6e\u6210\u529f"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1, v4}, Lcom/tencent/connect/avatar/ImageActivity;->b(Lcom/tencent/connect/avatar/ImageActivity;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 656
a=0;//     iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity$5;->a:Lcom/tencent/connect/avatar/ImageActivity;
a=0;// 
a=0;//     const-string v1, "10658"
a=0;// 
a=0;//     const-wide/16 v2, 0x0
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-virtual {v0, v1, v2, v3}, Lcom/tencent/connect/avatar/ImageActivity;->a(Ljava/lang/String;J)V
a=0;// 
a=0;//     .line 657
a=0;//     iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity$5;->a:Lcom/tencent/connect/avatar/ImageActivity;
a=0;// 
a=0;//     .line 658
a=0;//     iget-object v1, p0, Lcom/tencent/connect/avatar/ImageActivity$5;->a:Lcom/tencent/connect/avatar/ImageActivity;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/tencent/connect/avatar/ImageActivity;->k(Lcom/tencent/connect/avatar/ImageActivity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     const-string v1, ""
a=0;// 
a=0;//     iget-object v2, p0, Lcom/tencent/connect/avatar/ImageActivity$5;->a:Lcom/tencent/connect/avatar/ImageActivity;
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/connect/avatar/ImageActivity;);
a=0;//     invoke-static {v2}, Lcom/tencent/connect/avatar/ImageActivity;->k(Lcom/tencent/connect/avatar/ImageActivity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 660
a=0;//     new-instance v1, Landroid/content/Intent;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-direct {v1}, Landroid/content/Intent;-><init>()V
a=0;// 
a=0;//     .line 661
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     iget-object v2, p0, Lcom/tencent/connect/avatar/ImageActivity$5;->a:Lcom/tencent/connect/avatar/ImageActivity;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/tencent/connect/avatar/ImageActivity;->k(Lcom/tencent/connect/avatar/ImageActivity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 662
a=0;//     invoke-virtual {v0}, Landroid/app/Activity;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v1, v4}, Landroid/content/pm/PackageManager;->resolveActivity(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 664
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 665
a=0;//     invoke-virtual {v0, v1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 668
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity$5;->a:Lcom/tencent/connect/avatar/ImageActivity;
a=0;// 
a=0;//     invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v4, v1, v5, v5}, Lcom/tencent/connect/avatar/ImageActivity;->a(Lcom/tencent/connect/avatar/ImageActivity;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 669
a=0;//     iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity$5;->a:Lcom/tencent/connect/avatar/ImageActivity;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/tencent/connect/avatar/ImageActivity;->j(Lcom/tencent/connect/avatar/ImageActivity;)V
a=0;// 
a=0;//     .line 674
a=0;//     :goto_1
a=0;//     #v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 651
a=0;//     :catch_0
a=0;//     #v1=(Byte);v2=(PosByte);v3=(One);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 652
a=0;//     invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 672
a=0;//     :cond_1
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity$5;->a:Lcom/tencent/connect/avatar/ImageActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/connect/avatar/ImageActivity;);
a=0;//     const-string v1, "\u8bbe\u7f6e\u51fa\u9519\u4e86\uff0c\u8bf7\u91cd\u65b0\u767b\u5f55\u518d\u5c1d\u8bd5\u4e0b\u5462\uff1a\uff09"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1, v3}, Lcom/tencent/connect/avatar/ImageActivity;->b(Lcom/tencent/connect/avatar/ImageActivity;Ljava/lang/String;I)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public onError(Lcom/tencent/tauth/UiError;)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 626
a=0;//     #v2=(One);
a=0;//     iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity$5;->a:Lcom/tencent/connect/avatar/ImageActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/connect/avatar/ImageActivity;);
a=0;//     invoke-static {v0}, Lcom/tencent/connect/avatar/ImageActivity;->e(Lcom/tencent/connect/avatar/ImageActivity;)Landroid/widget/Button;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/Button;->setEnabled(Z)V
a=0;// 
a=0;//     .line 627
a=0;//     iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity$5;->a:Lcom/tencent/connect/avatar/ImageActivity;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/tencent/connect/avatar/ImageActivity;->e(Lcom/tencent/connect/avatar/ImageActivity;)Landroid/widget/Button;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/Button;->setTextColor(I)V
a=0;// 
a=0;//     .line 628
a=0;//     iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity$5;->a:Lcom/tencent/connect/avatar/ImageActivity;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/tencent/connect/avatar/ImageActivity;->f(Lcom/tencent/connect/avatar/ImageActivity;)Landroid/widget/Button;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/Button;->setEnabled(Z)V
a=0;// 
a=0;//     .line 629
a=0;//     iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity$5;->a:Lcom/tencent/connect/avatar/ImageActivity;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/tencent/connect/avatar/ImageActivity;->f(Lcom/tencent/connect/avatar/ImageActivity;)Landroid/widget/Button;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/Button;->setTextColor(I)V
a=0;// 
a=0;//     .line 630
a=0;//     iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity$5;->a:Lcom/tencent/connect/avatar/ImageActivity;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/tencent/connect/avatar/ImageActivity;->f(Lcom/tencent/connect/avatar/ImageActivity;)Landroid/widget/Button;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "\u91cd\u8bd5"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 631
a=0;//     iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity$5;->a:Lcom/tencent/connect/avatar/ImageActivity;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/tencent/connect/avatar/ImageActivity;->d(Lcom/tencent/connect/avatar/ImageActivity;)Landroid/widget/ProgressBar;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V
a=0;// 
a=0;//     .line 632
a=0;//     iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity$5;->a:Lcom/tencent/connect/avatar/ImageActivity;
a=0;// 
a=0;//     invoke-static {v0, v2}, Lcom/tencent/connect/avatar/ImageActivity;->a(Lcom/tencent/connect/avatar/ImageActivity;Z)Z
a=0;// 
a=0;//     .line 636
a=0;//     iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity$5;->a:Lcom/tencent/connect/avatar/ImageActivity;
a=0;// 
a=0;//     iget-object v1, p1, Lcom/tencent/tauth/UiError;->errorMessage:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1, v2}, Lcom/tencent/connect/avatar/ImageActivity;->b(Lcom/tencent/connect/avatar/ImageActivity;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 637
a=0;//     iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity$5;->a:Lcom/tencent/connect/avatar/ImageActivity;
a=0;// 
a=0;//     const-string v1, "10660"
a=0;// 
a=0;//     const-wide/16 v2, 0x0
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-virtual {v0, v1, v2, v3}, Lcom/tencent/connect/avatar/ImageActivity;->a(Ljava/lang/String;J)V
a=0;// 
a=0;//     .line 638
a=0;//     return-void
a=0;// .end method
}}
