package com.twocloo.com.cn.task; class DelBookTask { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/task/DelBookTask;
a=0;// .super Lcom/twocloo/base/sync/EasyTask;
a=0;// .source "DelBookTask.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "Lcom/twocloo/base/sync/EasyTask",
a=0;//         "<",
a=0;//         "Lcom/twocloo/com/cn/fragment/BookShelfFragment;",
a=0;//         "Ljava/lang/Void;",
a=0;//         "Ljava/lang/Void;",
a=0;//         "Ljava/lang/Boolean;",
a=0;//         ">;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private bfBook:Lcom/twocloo/com/cn/beans/BFBook;
a=0;// 
a=0;// .field private pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/twocloo/com/cn/fragment/BookShelfFragment;Lcom/twocloo/com/cn/beans/BFBook;)V
a=0;//     .locals 0
a=0;//     .param p1, "caller"    # Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;//     .param p2, "bfBook"    # Lcom/twocloo/com/cn/beans/BFBook;
a=0;// 
a=0;//     .prologue
a=0;//     .line 33
a=0;//     invoke-direct {p0, p1}, Lcom/twocloo/base/sync/EasyTask;-><init>(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 35
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/task/DelBookTask;);
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/task/DelBookTask;->bfBook:Lcom/twocloo/com/cn/beans/BFBook;
a=0;// 
a=0;//     .line 36
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$2(Lcom/twocloo/com/cn/task/DelBookTask;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 27
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/task/DelBookTask;->caller:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private notifyDataSetChanged()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 114
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/task/DelBookTask;->caller:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getCurpop()Landroid/widget/PopupWindow;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/task/DelBookTask;->caller:Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getCurpop()Landroid/widget/PopupWindow;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 115
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/task/DelBookTask;->caller:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getCurpop()Landroid/widget/PopupWindow;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V
a=0;// 
a=0;//     .line 116
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/task/DelBookTask;->caller:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getAdapt()Landroid/widget/BaseAdapter;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     instance-of v0, v0, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 117
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/task/DelBookTask;->caller:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getAdapt()Landroid/widget/BaseAdapter;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt;
a=0;// 
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     iput v1, v0, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt;->lastIndex:I
a=0;// 
a=0;//     .line 119
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/task/DelBookTask;->caller:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getAdapt()Landroid/widget/BaseAdapter;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V
a=0;// 
a=0;//     .line 120
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public varargs doInBackground([Ljava/lang/Void;)Ljava/lang/Boolean;
a=0;//     .locals 9
a=0;//     .param p1, "params"    # [Ljava/lang/Void;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .line 67
a=0;//     :try_start_0
a=0;//     #v8=(Null);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     .line 68
a=0;//     invoke-static {}, Lcom/twocloo/base/util/NetUtils;->checkNet()Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     sget-object v4, Lcom/twocloo/base/common/NetType;->TYPE_NONE:Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     invoke-virtual {v3, v4}, Lcom/twocloo/base/common/NetType;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 69
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/task/DelBookTask;->caller:Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v3, Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/task/DelBookTask;->bfBook:Lcom/twocloo/com/cn/beans/BFBook;
a=0;// 
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/beans/BFBook;->getArticleid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-static {v3, v4, v5}, Lcom/twocloo/com/cn/common/FileUtils;->delLocal(Landroid/content/Context;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 71
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/task/DelBookTask;->caller:Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v3, Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/task/DelBookTask;->bfBook:Lcom/twocloo/com/cn/beans/BFBook;
a=0;// 
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/beans/BFBook;->getArticleid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v3, v4}, Lcom/twocloo/com/cn/common/LocalStore;->setUnSychronizedBooks(Landroid/content/Context;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 73
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 106
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Reference,Ljava/lang/Boolean;);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-object v3
a=0;// 
a=0;//     .line 76
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Boolean);v4=(Reference,Lcom/twocloo/base/common/NetType;);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/task/DelBookTask;->caller:Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v3, Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     invoke-virtual {v5}, Lcom/twocloo/com/cn/beans/User;->getToken()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const-string v6, ""
a=0;// 
a=0;//     .line 77
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/task/DelBookTask;->bfBook:Lcom/twocloo/com/cn/beans/BFBook;
a=0;// 
a=0;//     #v7=(Reference,Lcom/twocloo/com/cn/beans/BFBook;);
a=0;//     invoke-virtual {v7}, Lcom/twocloo/com/cn/beans/BFBook;->getArticleid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 76
a=0;//     invoke-static {v3, v4, v5, v6, v7}, Lcom/twocloo/com/cn/http/HttpImpl;->synMyfavor(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 78
a=0;//     .local v1, "jo":Lorg/json/JSONObject;
a=0;//     #v1=(Reference,Lorg/json/JSONObject;);
a=0;//     invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-class v4, Lcom/twocloo/com/cn/beans/SynMyfavorResultBean;
a=0;// 
a=0;//     invoke-static {v3, v4}, Lcom/twocloo/base/util/JsonUtils;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Lcom/twocloo/com/cn/beans/SynMyfavorResultBean;
a=0;// 
a=0;//     .line 80
a=0;//     .local v2, "smfResultBean":Lcom/twocloo/com/cn/beans/SynMyfavorResultBean;
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     const-string v3, "1"
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/SynMyfavorResultBean;->getDel()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 82
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/task/DelBookTask;->caller:Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v3, Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/task/DelBookTask;->bfBook:Lcom/twocloo/com/cn/beans/BFBook;
a=0;// 
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/beans/BFBook;->getArticleid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-static {v3, v4, v5}, Lcom/twocloo/com/cn/common/FileUtils;->delLocal(Landroid/content/Context;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 84
a=0;//     :cond_1
a=0;//     #v3=(Conflicted);v5=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Boolean;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 89
a=0;//     .end local v1    # "jo":Lorg/json/JSONObject;
a=0;//     .end local v2    # "smfResultBean":Lcom/twocloo/com/cn/beans/SynMyfavorResultBean;
a=0;//     :cond_2
a=0;//     #v1=(Uninit);v2=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/task/DelBookTask;->caller:Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v3, Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/task/DelBookTask;->bfBook:Lcom/twocloo/com/cn/beans/BFBook;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/beans/BFBook;);
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/beans/BFBook;->getArticleid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-static {v3, v4, v5}, Lcom/twocloo/com/cn/common/FileUtils;->delLocal(Landroid/content/Context;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 91
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/task/DelBookTask;->caller:Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v3, Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     new-instance v4, Lcom/twocloo/com/cn/task/DelBookTask$1;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/twocloo/com/cn/task/DelBookTask$1;);
a=0;//     invoke-direct {v4, p0}, Lcom/twocloo/com/cn/task/DelBookTask$1;-><init>(Lcom/twocloo/com/cn/task/DelBookTask;)V
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/task/DelBookTask$1;);
a=0;//     invoke-virtual {v3, v4}, Landroid/support/v4/app/FragmentActivity;->runOnUiThread(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     .line 100
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Boolean;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 103
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 104
a=0;//     .local v0, "e":Ljava/lang/Throwable;
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
a=0;// 
a=0;//     .line 106
a=0;//     invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Boolean;);
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public bridge varargs synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     check-cast p1, [Ljava/lang/Void;
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Lcom/twocloo/com/cn/task/DelBookTask;->doInBackground([Ljava/lang/Void;)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Boolean;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public onPostExecute(Ljava/lang/Boolean;)V
a=0;//     .locals 4
a=0;//     .param p1, "result"    # Ljava/lang/Boolean;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 47
a=0;//     #v3=(Null);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/task/DelBookTask;->pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/ProgressDialog;);
a=0;//     invoke-virtual {v0}, Landroid/app/ProgressDialog;->cancel()V
a=0;// 
a=0;//     .line 48
a=0;//     invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 50
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/task/DelBookTask;->notifyDataSetChanged()V
a=0;// 
a=0;//     .line 53
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/task/DelBookTask;->caller:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/app/FragmentActivity;);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/task/DelBookTask;->caller:Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$string;->arrange_bookshelf_delete_success:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v2}, Landroid/support/v4/app/FragmentActivity;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v1, v0, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 54
a=0;//     invoke-virtual {v0}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     .line 61
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 57
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/task/DelBookTask;->notifyDataSetChanged()V
a=0;// 
a=0;//     .line 58
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/task/DelBookTask;->caller:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/app/FragmentActivity;);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/task/DelBookTask;->caller:Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$string;->arrange_bookshelf_delete_failed:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v2}, Landroid/support/v4/app/FragmentActivity;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v1, v0, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 59
a=0;//     invoke-virtual {v0}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic onPostExecute(Ljava/lang/Object;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     check-cast p1, Ljava/lang/Boolean;
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Lcom/twocloo/com/cn/task/DelBookTask;->onPostExecute(Ljava/lang/Boolean;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onPreExecute()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 41
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/task/DelBookTask;->caller:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "\u5220\u9664\u4e2d,\u8bf7\u7a0d\u540e..."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lcom/twocloo/base/util/ViewUtils;->progressLoading(Landroid/content/Context;Ljava/lang/String;)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/task/DelBookTask;->pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     .line 42
a=0;//     return-void
a=0;// .end method
}}
