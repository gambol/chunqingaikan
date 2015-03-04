package com.tencent.connect.avatar; class ImageActivity$6 { void a() { int a;
a=0;// .class Lcom/tencent/connect/avatar/ImageActivity$6;
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
a=0;//     .line 681
a=0;//     iput-object p1, p0, Lcom/tencent/connect/avatar/ImageActivity$6;->a:Lcom/tencent/connect/avatar/ImageActivity;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/connect/avatar/ImageActivity$6;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(I)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 718
a=0;//     iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity$6;->a:Lcom/tencent/connect/avatar/ImageActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/connect/avatar/ImageActivity;);
a=0;//     invoke-static {v0}, Lcom/tencent/connect/avatar/ImageActivity;->m(Lcom/tencent/connect/avatar/ImageActivity;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ge v0, v1, :cond_0
a=0;// 
a=0;//     .line 719
a=0;//     iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity$6;->a:Lcom/tencent/connect/avatar/ImageActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/connect/avatar/ImageActivity;);
a=0;//     invoke-static {v0}, Lcom/tencent/connect/avatar/ImageActivity;->n(Lcom/tencent/connect/avatar/ImageActivity;)V
a=0;// 
a=0;//     .line 723
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onCancel()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 715
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onComplete(Ljava/lang/Object;)V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 689
a=0;//     check-cast p1, Lorg/json/JSONObject;
a=0;// 
a=0;//     .line 690
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     .line 692
a=0;//     :try_start_0
a=0;//     #v1=(Byte);
a=0;//     const-string v0, "ret"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 693
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 694
a=0;//     const-string v0, "nickname"
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 695
a=0;//     iget-object v2, p0, Lcom/tencent/connect/avatar/ImageActivity$6;->a:Lcom/tencent/connect/avatar/ImageActivity;
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/connect/avatar/ImageActivity;);
a=0;//     invoke-static {v2}, Lcom/tencent/connect/avatar/ImageActivity;->l(Lcom/tencent/connect/avatar/ImageActivity;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     new-instance v3, Lcom/tencent/connect/avatar/ImageActivity$6$1;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/tencent/connect/avatar/ImageActivity$6$1;);
a=0;//     invoke-direct {v3, p0, v0}, Lcom/tencent/connect/avatar/ImageActivity$6$1;-><init>(Lcom/tencent/connect/avatar/ImageActivity$6;Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/tencent/connect/avatar/ImageActivity$6$1;);
a=0;//     invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     .line 701
a=0;//     iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity$6;->a:Lcom/tencent/connect/avatar/ImageActivity;
a=0;// 
a=0;//     const-string v2, "10659"
a=0;// 
a=0;//     const-wide/16 v3, 0x0
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-virtual {v0, v2, v3, v4}, Lcom/tencent/connect/avatar/ImageActivity;->a(Ljava/lang/String;J)V
a=0;//     :try_end_0
a=0;//     .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 708
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 709
a=0;//     invoke-direct {p0, v1}, Lcom/tencent/connect/avatar/ImageActivity$6;->a(I)V
a=0;// 
a=0;//     .line 711
a=0;//     :cond_0
a=0;//     return-void
a=0;// 
a=0;//     .line 703
a=0;//     :cond_1
a=0;//     :try_start_1
a=0;//     #v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity$6;->a:Lcom/tencent/connect/avatar/ImageActivity;
a=0;// 
a=0;//     const-string v2, "10661"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-wide/16 v3, 0x0
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-virtual {v0, v2, v3, v4}, Lcom/tencent/connect/avatar/ImageActivity;->a(Ljava/lang/String;J)V
a=0;//     :try_end_1
a=0;//     .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 705
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 706
a=0;//     #v0=(Reference,Lorg/json/JSONException;);
a=0;//     invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onError(Lcom/tencent/tauth/UiError;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 684
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, v0}, Lcom/tencent/connect/avatar/ImageActivity$6;->a(I)V
a=0;// 
a=0;//     .line 685
a=0;//     return-void
a=0;// .end method
}}
