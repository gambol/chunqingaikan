package com.tencent.open; class TaskGuide$d { void a() { int a;
a=0;// .class Lcom/tencent/open/TaskGuide$d;
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
a=0;//     name = "d"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field b:I
a=0;// 
a=0;// .field final synthetic c:Lcom/tencent/open/TaskGuide;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/tencent/open/TaskGuide;I)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 936
a=0;//     iput-object p1, p0, Lcom/tencent/open/TaskGuide$d;->c:Lcom/tencent/open/TaskGuide;
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, v0}, Lcom/tencent/open/TaskGuide$a;-><init>(Lcom/tencent/open/TaskGuide;Lcom/tencent/open/TaskGuide$1;)V
a=0;// 
a=0;//     .line 935
a=0;//     #p0=(Reference,Lcom/tencent/open/TaskGuide$d;);
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     iput v0, p0, Lcom/tencent/open/TaskGuide$d;->b:I
a=0;// 
a=0;//     .line 937
a=0;//     iput p2, p0, Lcom/tencent/open/TaskGuide$d;->b:I
a=0;// 
a=0;//     .line 938
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected a(Ljava/lang/Exception;)V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 984
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 985
a=0;//     invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     .line 988
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcom/tencent/open/TaskGuide$d;->c:Lcom/tencent/open/TaskGuide;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/open/TaskGuide;);
a=0;//     iget-object v0, v0, Lcom/tencent/open/TaskGuide;->c:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     new-instance v1, Lcom/tencent/tauth/UiError;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/tencent/tauth/UiError;);
a=0;//     const/16 v2, 0x65
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     const-string v3, "error "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "\u91d1\u5238\u9886\u53d6\u65f6\u51fa\u73b0\u5f02\u5e38"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2, v3, v4}, Lcom/tencent/tauth/UiError;-><init>(ILjava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/tauth/UiError;);
a=0;//     invoke-interface {v0, v1}, Lcom/tencent/tauth/IUiListener;->onError(Lcom/tencent/tauth/UiError;)V
a=0;// 
a=0;//     .line 990
a=0;//     iget-object v0, p0, Lcom/tencent/open/TaskGuide$d;->c:Lcom/tencent/open/TaskGuide;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/tencent/open/TaskGuide;->x(Lcom/tencent/open/TaskGuide;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 991
a=0;//     iget-object v0, p0, Lcom/tencent/open/TaskGuide$d;->c:Lcom/tencent/open/TaskGuide;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/tencent/open/TaskGuide;->x(Lcom/tencent/open/TaskGuide;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v1, Lcom/tencent/open/TaskGuide$d$1;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/tencent/open/TaskGuide$d$1;);
a=0;//     invoke-direct {v1, p0, p1}, Lcom/tencent/open/TaskGuide$d$1;-><init>(Lcom/tencent/open/TaskGuide$d;Ljava/lang/Exception;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/open/TaskGuide$d$1;);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     .line 1012
a=0;//     :cond_1
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onComplete(Lorg/json/JSONObject;)V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 942
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 944
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     const-string v0, "code"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 945
a=0;//     #v0=(Integer);
a=0;//     const-string v2, "message"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 946
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 947
a=0;//     iget-object v0, p0, Lcom/tencent/open/TaskGuide$d;->c:Lcom/tencent/open/TaskGuide;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/open/TaskGuide;);
a=0;//     iget v2, p0, Lcom/tencent/open/TaskGuide$d;->b:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     sget-object v3, Lcom/tencent/open/TaskGuide$k;->e:Lcom/tencent/open/TaskGuide$k;
a=0;// 
a=0;//     #v3=(Reference,Lcom/tencent/open/TaskGuide$k;);
a=0;//     invoke-static {v0, v2, v3}, Lcom/tencent/open/TaskGuide;->a(Lcom/tencent/open/TaskGuide;ILcom/tencent/open/TaskGuide$k;)V
a=0;// 
a=0;//     .line 949
a=0;//     new-instance v2, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v2=(UninitRef,Lorg/json/JSONObject;);
a=0;//     invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V
a=0;//     :try_end_0
a=0;//     .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     .line 951
a=0;//     :try_start_1
a=0;//     #v2=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v0, "result"
a=0;// 
a=0;//     const-string v3, "\u91d1\u5238\u9886\u53d6\u6210\u529f"
a=0;// 
a=0;//     invoke-virtual {v2, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;//     :try_end_1
a=0;//     .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     .line 956
a=0;//     :goto_0
a=0;//     :try_start_2
a=0;//     iget-object v0, p0, Lcom/tencent/open/TaskGuide$d;->c:Lcom/tencent/open/TaskGuide;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/tencent/open/TaskGuide;->c:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     invoke-interface {v0, v2}, Lcom/tencent/tauth/IUiListener;->onComplete(Ljava/lang/Object;)V
a=0;//     :try_end_2
a=0;//     .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_1
a=0;// 
a=0;//     .line 978
a=0;//     :goto_1
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/tencent/open/TaskGuide$d;->c:Lcom/tencent/open/TaskGuide;
a=0;// 
a=0;//     iget v1, p0, Lcom/tencent/open/TaskGuide$d;->b:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v0, v1}, Lcom/tencent/open/TaskGuide;->c(Lcom/tencent/open/TaskGuide;I)V
a=0;// 
a=0;//     .line 980
a=0;//     iget-object v0, p0, Lcom/tencent/open/TaskGuide$d;->c:Lcom/tencent/open/TaskGuide;
a=0;// 
a=0;//     const/16 v1, 0x7d0
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     invoke-static {v0, v1}, Lcom/tencent/open/TaskGuide;->e(Lcom/tencent/open/TaskGuide;I)V
a=0;// 
a=0;//     .line 981
a=0;//     return-void
a=0;// 
a=0;//     .line 952
a=0;//     :catch_0
a=0;//     #v1=(Reference,Ljava/lang/String;);v3=(Reference,Ujava/lang/Object;);v4=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 954
a=0;//     :try_start_3
a=0;//     invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V
a=0;//     :try_end_3
a=0;//     .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 973
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 974
a=0;//     #v0=(Reference,Lorg/json/JSONException;);
a=0;//     iget-object v2, p0, Lcom/tencent/open/TaskGuide$d;->c:Lcom/tencent/open/TaskGuide;
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/open/TaskGuide;);
a=0;//     iget v3, p0, Lcom/tencent/open/TaskGuide$d;->b:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     sget-object v4, Lcom/tencent/open/TaskGuide$k;->d:Lcom/tencent/open/TaskGuide$k;
a=0;// 
a=0;//     #v4=(Reference,Lcom/tencent/open/TaskGuide$k;);
a=0;//     invoke-static {v2, v3, v4}, Lcom/tencent/open/TaskGuide;->a(Lcom/tencent/open/TaskGuide;ILcom/tencent/open/TaskGuide$k;)V
a=0;// 
a=0;//     .line 975
a=0;//     iget-object v2, p0, Lcom/tencent/open/TaskGuide$d;->c:Lcom/tencent/open/TaskGuide;
a=0;// 
a=0;//     invoke-static {v2, v1}, Lcom/tencent/open/TaskGuide;->a(Lcom/tencent/open/TaskGuide;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 976
a=0;//     invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 960
a=0;//     :cond_0
a=0;//     :try_start_4
a=0;//     #v0=(Integer);v3=(Uninit);v4=(Uninit);
a=0;//     iget-object v0, p0, Lcom/tencent/open/TaskGuide$d;->c:Lcom/tencent/open/TaskGuide;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/open/TaskGuide;);
a=0;//     iget v2, p0, Lcom/tencent/open/TaskGuide$d;->b:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     sget-object v3, Lcom/tencent/open/TaskGuide$k;->d:Lcom/tencent/open/TaskGuide$k;
a=0;// 
a=0;//     #v3=(Reference,Lcom/tencent/open/TaskGuide$k;);
a=0;//     invoke-static {v0, v2, v3}, Lcom/tencent/open/TaskGuide;->a(Lcom/tencent/open/TaskGuide;ILcom/tencent/open/TaskGuide$k;)V
a=0;// 
a=0;//     .line 961
a=0;//     iget-object v0, p0, Lcom/tencent/open/TaskGuide$d;->c:Lcom/tencent/open/TaskGuide;
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/tencent/open/TaskGuide;->a(Lcom/tencent/open/TaskGuide;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 963
a=0;//     new-instance v2, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v2=(UninitRef,Lorg/json/JSONObject;);
a=0;//     invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V
a=0;//     :try_end_4
a=0;//     .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_4} :catch_1
a=0;// 
a=0;//     .line 965
a=0;//     :try_start_5
a=0;//     #v2=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v0, "result"
a=0;// 
a=0;//     const-string v3, "\u91d1\u5238\u9886\u53d6\u5931\u8d25"
a=0;// 
a=0;//     invoke-virtual {v2, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;//     :try_end_5
a=0;//     .catch Lorg/json/JSONException; {:try_start_5 .. :try_end_5} :catch_2
a=0;// 
a=0;//     .line 970
a=0;//     :goto_2
a=0;//     :try_start_6
a=0;//     iget-object v0, p0, Lcom/tencent/open/TaskGuide$d;->c:Lcom/tencent/open/TaskGuide;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/tencent/open/TaskGuide;->c:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     invoke-interface {v0, v2}, Lcom/tencent/tauth/IUiListener;->onComplete(Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 966
a=0;//     :catch_2
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 968
a=0;//     invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V
a=0;//     :try_end_6
a=0;//     .catch Lorg/json/JSONException; {:try_start_6 .. :try_end_6} :catch_1
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
}}
