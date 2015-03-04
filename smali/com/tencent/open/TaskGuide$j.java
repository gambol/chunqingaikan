package com.tencent.open; class TaskGuide$j { void a() { int a;
a=0;// .class Lcom/tencent/open/TaskGuide$j;
a=0;// .super Lcom/tencent/open/TaskGuide$a;
a=0;// .source "ProGuard"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/tencent/open/TaskGuide;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x2
a=0;//     name = "j"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic b:Lcom/tencent/open/TaskGuide;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>(Lcom/tencent/open/TaskGuide;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 813
a=0;//     iput-object p1, p0, Lcom/tencent/open/TaskGuide$j;->b:Lcom/tencent/open/TaskGuide;
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, v0}, Lcom/tencent/open/TaskGuide$a;-><init>(Lcom/tencent/open/TaskGuide;Lcom/tencent/open/TaskGuide$1;)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/open/TaskGuide$j;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method synthetic constructor <init>(Lcom/tencent/open/TaskGuide;Lcom/tencent/open/TaskGuide$1;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 813
a=0;//     invoke-direct {p0, p1}, Lcom/tencent/open/TaskGuide$j;-><init>(Lcom/tencent/open/TaskGuide;)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/open/TaskGuide$j;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected a(Ljava/lang/Exception;)V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 844
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 845
a=0;//     invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     .line 848
a=0;//     :cond_0
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     .line 849
a=0;//     new-instance v1, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v1=(UninitRef,Lorg/json/JSONObject;);
a=0;//     invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V
a=0;// 
a=0;//     .line 851
a=0;//     :try_start_0
a=0;//     #v1=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v0, "result"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "\u6682\u65e0\u4efb\u52a1"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;//     :try_end_0
a=0;//     .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 856
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/tencent/open/TaskGuide$j;->b:Lcom/tencent/open/TaskGuide;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/tencent/open/TaskGuide;->c:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     invoke-interface {v0, v1}, Lcom/tencent/tauth/IUiListener;->onComplete(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 860
a=0;//     :goto_1
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/tencent/open/TaskGuide$j;->b:Lcom/tencent/open/TaskGuide;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/tencent/open/TaskGuide;->x(Lcom/tencent/open/TaskGuide;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v1, Lcom/tencent/open/TaskGuide$j$1;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/tencent/open/TaskGuide$j$1;);
a=0;//     invoke-direct {v1, p0}, Lcom/tencent/open/TaskGuide$j$1;-><init>(Lcom/tencent/open/TaskGuide$j;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/open/TaskGuide$j$1;);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     .line 871
a=0;//     return-void
a=0;// 
a=0;//     .line 852
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v3=(Uninit);v4=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 854
a=0;//     #v0=(Reference,Lorg/json/JSONException;);
a=0;//     invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 858
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);
a=0;//     iget-object v0, p0, Lcom/tencent/open/TaskGuide$j;->b:Lcom/tencent/open/TaskGuide;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/open/TaskGuide;);
a=0;//     iget-object v0, v0, Lcom/tencent/open/TaskGuide;->c:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     new-instance v1, Lcom/tencent/tauth/UiError;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/tencent/tauth/UiError;);
a=0;//     const/16 v2, 0x64
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     const-string v3, "error "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "\u83b7\u53d6\u4efb\u52a1\u5931\u8d25"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2, v3, v4}, Lcom/tencent/tauth/UiError;-><init>(ILjava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/tauth/UiError;);
a=0;//     invoke-interface {v0, v1}, Lcom/tencent/tauth/IUiListener;->onError(Lcom/tencent/tauth/UiError;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public onComplete(Lorg/json/JSONObject;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 819
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/tencent/open/TaskGuide$j;->b:Lcom/tencent/open/TaskGuide;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/open/TaskGuide;);
a=0;//     invoke-static {p1}, Lcom/tencent/open/TaskGuide$h;->a(Lorg/json/JSONObject;)Lcom/tencent/open/TaskGuide$h;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/open/TaskGuide$h;);
a=0;//     invoke-static {v0, v1}, Lcom/tencent/open/TaskGuide;->a(Lcom/tencent/open/TaskGuide;Lcom/tencent/open/TaskGuide$h;)Lcom/tencent/open/TaskGuide$h;
a=0;//     :try_end_0
a=0;//     .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 826
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/tencent/open/TaskGuide$j;->b:Lcom/tencent/open/TaskGuide;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/tencent/open/TaskGuide;->y(Lcom/tencent/open/TaskGuide;)Lcom/tencent/open/TaskGuide$h;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/open/TaskGuide$j;->b:Lcom/tencent/open/TaskGuide;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/tencent/open/TaskGuide;->y(Lcom/tencent/open/TaskGuide;)Lcom/tencent/open/TaskGuide$h;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/open/TaskGuide$h;->a()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 827
a=0;//     iget-object v0, p0, Lcom/tencent/open/TaskGuide$j;->b:Lcom/tencent/open/TaskGuide;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/open/TaskGuide;);
a=0;//     invoke-virtual {v0}, Lcom/tencent/open/TaskGuide;->showWindow()V
a=0;// 
a=0;//     .line 828
a=0;//     iget-object v0, p0, Lcom/tencent/open/TaskGuide$j;->b:Lcom/tencent/open/TaskGuide;
a=0;// 
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     sget-object v2, Lcom/tencent/open/TaskGuide$k;->d:Lcom/tencent/open/TaskGuide$k;
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/open/TaskGuide$k;);
a=0;//     invoke-static {v0, v1, v2}, Lcom/tencent/open/TaskGuide;->a(Lcom/tencent/open/TaskGuide;ILcom/tencent/open/TaskGuide$k;)V
a=0;// 
a=0;//     .line 829
a=0;//     new-instance v1, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v1=(UninitRef,Lorg/json/JSONObject;);
a=0;//     invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V
a=0;// 
a=0;//     .line 831
a=0;//     :try_start_1
a=0;//     #v1=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v0, "result"
a=0;// 
a=0;//     const-string v2, "\u83b7\u53d6\u6210\u529f"
a=0;// 
a=0;//     invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;//     :try_end_1
a=0;//     .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     .line 836
a=0;//     :goto_1
a=0;//     iget-object v0, p0, Lcom/tencent/open/TaskGuide$j;->b:Lcom/tencent/open/TaskGuide;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/tencent/open/TaskGuide;->c:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     invoke-interface {v0, v1}, Lcom/tencent/tauth/IUiListener;->onComplete(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 840
a=0;//     :goto_2
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 820
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 822
a=0;//     #v0=(Reference,Lorg/json/JSONException;);
a=0;//     invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 832
a=0;//     :catch_1
a=0;//     #v1=(Reference,Lorg/json/JSONObject;);v2=(Reference,Ujava/lang/Object;);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 834
a=0;//     invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 838
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, v0}, Lcom/tencent/open/TaskGuide$j;->a(Ljava/lang/Exception;)V
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
}}
