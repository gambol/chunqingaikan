package com.twocloo.com.cn.activitys; class SelectBookActivity$1 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/activitys/SelectBookActivity$1;
a=0;// .super Landroid/os/Handler;
a=0;// .source "SelectBookActivity.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/twocloo/com/cn/activitys/SelectBookActivity;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/activitys/SelectBookActivity;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/activitys/SelectBookActivity;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/SelectBookActivity;
a=0;// 
a=0;//     .line 49
a=0;//     invoke-direct {p0}, Landroid/os/Handler;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/SelectBookActivity$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public handleMessage(Landroid/os/Message;)V
a=0;//     .locals 10
a=0;//     .param p1, "msg"    # Landroid/os/Message;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     .line 52
a=0;//     #v9=(Null);
a=0;//     iget v6, p1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     if-ne v6, v7, :cond_1
a=0;// 
a=0;//     .line 53
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/SelectBookActivity;
a=0;// 
a=0;//     #v6=(Reference,Lcom/twocloo/com/cn/activitys/SelectBookActivity;);
a=0;//     invoke-virtual {v6}, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Landroid/content/Context;);
a=0;//     iget-object v6, p1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v6, Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v7, v6, v9}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     .line 88
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 54
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Integer);v7=(One);v8=(Uninit);
a=0;//     iget v6, p1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     const/4 v7, 0x2
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     if-ne v6, v7, :cond_0
a=0;// 
a=0;//     .line 56
a=0;//     iget-object v5, p1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v5, Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 58
a=0;//     .local v5, "list":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/twocloo/com/cn/beans/NewBook;>;"
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .local v2, "i":I
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Integer);v3=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     invoke-virtual {v5}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-lt v2, v6, :cond_2
a=0;// 
a=0;//     .line 83
a=0;//     new-instance v4, Landroid/content/Intent;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/content/Intent;);
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/SelectBookActivity;
a=0;// 
a=0;//     #v6=(Reference,Lcom/twocloo/com/cn/activitys/SelectBookActivity;);
a=0;//     const-class v7, Lcom/twocloo/com/cn/activitys/MainActivity;
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v4, v6, v7}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 84
a=0;//     .local v4, "intent":Landroid/content/Intent;
a=0;//     #v4=(Reference,Landroid/content/Intent;);
a=0;//     const-string v6, "id"
a=0;// 
a=0;//     sget v7, Lcom/twocloo/com/cn/R$id;->main_bookshelf:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v4, v6, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 85
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/SelectBookActivity;
a=0;// 
a=0;//     invoke-virtual {v6, v4}, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 86
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/SelectBookActivity;
a=0;// 
a=0;//     invoke-virtual {v6}, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->finish()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 59
a=0;//     .end local v4    # "intent":Landroid/content/Intent;
a=0;//     :cond_2
a=0;//     #v4=(Uninit);v6=(Integer);v7=(Conflicted);
a=0;//     invoke-virtual {v5, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Lcom/twocloo/com/cn/beans/NewBook;
a=0;// 
a=0;//     .line 60
a=0;//     .local v1, "book1":Lcom/twocloo/com/cn/beans/NewBook;
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     if-eqz v6, :cond_3
a=0;// 
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     if-eqz v6, :cond_3
a=0;// 
a=0;//     .line 61
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/SelectBookActivity;
a=0;// 
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     invoke-virtual {v7}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-static {v6, v7}, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->access$0(Lcom/twocloo/com/cn/activitys/SelectBookActivity;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 63
a=0;//     :cond_3
a=0;//     #v7=(Conflicted);
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/SelectBookActivity;
a=0;// 
a=0;//     invoke-static {v6}, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->access$1(Lcom/twocloo/com/cn/activitys/SelectBookActivity;)Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/NewBook;->getArticleid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/SelectBookActivity;
a=0;// 
a=0;//     #v8=(Reference,Lcom/twocloo/com/cn/activitys/SelectBookActivity;);
a=0;//     invoke-static {v8}, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->access$2(Lcom/twocloo/com/cn/activitys/SelectBookActivity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v6, v7, v8}, Lcom/twocloo/com/cn/db/DBAdapter;->exitBookGx(Ljava/lang/String;Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_4
a=0;// 
a=0;//     .line 64
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/SelectBookActivity;
a=0;// 
a=0;//     #v6=(Reference,Lcom/twocloo/com/cn/activitys/SelectBookActivity;);
a=0;//     invoke-static {v6}, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->access$1(Lcom/twocloo/com/cn/activitys/SelectBookActivity;)Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/NewBook;->getArticleid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/SelectBookActivity;
a=0;// 
a=0;//     invoke-static {v8}, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->access$2(Lcom/twocloo/com/cn/activitys/SelectBookActivity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v6, v7, v8, v9}, Lcom/twocloo/com/cn/db/DBAdapter;->insertGx(Ljava/lang/String;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 66
a=0;//     :cond_4
a=0;//     #v6=(Conflicted);
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/SelectBookActivity;
a=0;// 
a=0;//     #v6=(Reference,Lcom/twocloo/com/cn/activitys/SelectBookActivity;);
a=0;//     invoke-static {v6}, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->access$1(Lcom/twocloo/com/cn/activitys/SelectBookActivity;)Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/NewBook;->getArticleid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/SelectBookActivity;
a=0;// 
a=0;//     invoke-static {v8}, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->access$2(Lcom/twocloo/com/cn/activitys/SelectBookActivity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v6, v7, v8}, Lcom/twocloo/com/cn/db/DBAdapter;->existBookBF(Ljava/lang/String;Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_6
a=0;// 
a=0;//     .line 67
a=0;//     new-instance v0, Lcom/twocloo/com/cn/beans/BFBook;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/beans/BFBook;);
a=0;//     invoke-direct {v0}, Lcom/twocloo/com/cn/beans/BFBook;-><init>()V
a=0;// 
a=0;//     .line 68
a=0;//     .local v0, "book":Lcom/twocloo/com/cn/beans/BFBook;
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/BFBook;);
a=0;//     if-eqz v1, :cond_6
a=0;// 
a=0;//     .line 69
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/NewBook;->getImgURL()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v6, :cond_5
a=0;// 
a=0;//     .line 70
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/NewBook;->getImgURL()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 71
a=0;//     .local v3, "imgurl":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v3}, Lcom/twocloo/com/cn/beans/BFBook;->setImgFile(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 73
a=0;//     .end local v3    # "imgurl":Ljava/lang/String;
a=0;//     :cond_5
a=0;//     #v3=(Conflicted);
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/NewBook;->getTitle()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v0, v6}, Lcom/twocloo/com/cn/beans/BFBook;->setTitle(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 74
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/NewBook;->getArticleid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v0, v6}, Lcom/twocloo/com/cn/beans/BFBook;->setArticleid(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 75
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/SelectBookActivity;
a=0;// 
a=0;//     invoke-static {v6}, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->access$2(Lcom/twocloo/com/cn/activitys/SelectBookActivity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v0, v6}, Lcom/twocloo/com/cn/beans/BFBook;->setUid(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 76
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/activitys/SelectBookActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/SelectBookActivity;
a=0;// 
a=0;//     invoke-static {v6}, Lcom/twocloo/com/cn/activitys/SelectBookActivity;->access$1(Lcom/twocloo/com/cn/activitys/SelectBookActivity;)Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6, v0}, Lcom/twocloo/com/cn/db/DBAdapter;->insertBook(Lcom/twocloo/com/cn/beans/BFBook;)Ljava/lang/String;
a=0;// 
a=0;//     .line 58
a=0;//     .end local v0    # "book":Lcom/twocloo/com/cn/beans/BFBook;
a=0;//     :cond_6
a=0;//     #v0=(Conflicted);v6=(Conflicted);
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// .end method
}}
