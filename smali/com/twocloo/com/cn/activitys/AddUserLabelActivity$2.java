package com.twocloo.com.cn.activitys; class AddUserLabelActivity$2 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/activitys/AddUserLabelActivity$2;
a=0;// .super Ljava/lang/Object;
a=0;// .source "AddUserLabelActivity.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;->onCreate(Landroid/os/Bundle;)V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;
a=0;// 
a=0;//     .line 85
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/AddUserLabelActivity$2;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     .line 89
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "http://app.2cloo.com/user-marks?"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;
a=0;// 
a=0;//     invoke-static {v7}, Lcom/twocloo/com/cn/utils/CommonUtils;->getPublicArgs(Landroid/app/Activity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     const-string v7, "gb2312"
a=0;// 
a=0;//     invoke-static {v6, v7}, Lcom/twocloo/com/cn/http/HttpImpl;->ParseJsonArray(Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONArray;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 91
a=0;//     .local v3, "json":Lorg/json/JSONArray;
a=0;//     #v3=(Reference,Lorg/json/JSONArray;);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 92
a=0;//     new-instance v4, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 93
a=0;//     .local v4, "list":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
a=0;//     #v4=(Reference,Ljava/util/ArrayList;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .local v2, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Integer);v6=(Conflicted);
a=0;//     invoke-virtual {v3}, Lorg/json/JSONArray;->length()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-lt v2, v6, :cond_0
a=0;// 
a=0;//     .line 103
a=0;//     invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 104
a=0;//     .local v5, "msg":Landroid/os/Message;
a=0;//     #v5=(Reference,Landroid/os/Message;);
a=0;//     iput-object v4, v5, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     .line 105
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     iput v6, v5, Landroid/os/Message;->what:I
a=0;// 
a=0;//     .line 106
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;
a=0;// 
a=0;//     #v6=(Reference,Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;);
a=0;//     invoke-static {v6}, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;->access$4(Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6, v5}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     .line 113
a=0;//     .end local v2    # "i":I
a=0;//     .end local v4    # "list":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 96
a=0;//     .end local v5    # "msg":Landroid/os/Message;
a=0;//     .restart local v2    # "i":I
a=0;//     .restart local v4    # "list":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
a=0;//     :cond_0
a=0;//     :try_start_0
a=0;//     #v2=(Integer);v4=(Reference,Ljava/util/ArrayList;);v5=(Uninit);v6=(Integer);
a=0;//     invoke-virtual {v3, v2}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 97
a=0;//     .local v1, "ele":Lorg/json/JSONObject;
a=0;//     #v1=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v6, "mark"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;//     :try_end_0
a=0;//     .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 93
a=0;//     .end local v1    # "ele":Lorg/json/JSONObject;
a=0;//     :goto_2
a=0;//     #v1=(Conflicted);v6=(Conflicted);
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 98
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 99
a=0;//     .local v0, "e":Lorg/json/JSONException;
a=0;//     #v0=(Reference,Lorg/json/JSONException;);
a=0;//     invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 108
a=0;//     .end local v0    # "e":Lorg/json/JSONException;
a=0;//     .end local v2    # "i":I
a=0;//     .end local v4    # "list":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v4=(Uninit);v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 109
a=0;//     .restart local v5    # "msg":Landroid/os/Message;
a=0;//     #v5=(Reference,Landroid/os/Message;);
a=0;//     const-string v6, "\u7f51\u7edc\u5f02\u5e38\uff0c\u8bf7\u68c0\u67e5\u540e\u91cd\u8bd5\uff01"
a=0;// 
a=0;//     iput-object v6, v5, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     .line 110
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     iput v6, v5, Landroid/os/Message;->what:I
a=0;// 
a=0;//     .line 111
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;
a=0;// 
a=0;//     #v6=(Reference,Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;);
a=0;//     invoke-static {v6}, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;->access$4(Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6, v5}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
}}
