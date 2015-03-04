package com.twocloo.com.cn.adapters; class ListViewNewAdapt$3 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$3;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ListViewNewAdapt.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnClickListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/twocloo/com/cn/adapters/ListViewNewAdapt;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/adapters/ListViewNewAdapt;
a=0;// 
a=0;// .field private final synthetic val$book:Lcom/twocloo/com/cn/beans/BFBook;
a=0;// 
a=0;// .field private final synthetic val$position:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/adapters/ListViewNewAdapt;Lcom/twocloo/com/cn/beans/BFBook;I)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$3;->this$0:Lcom/twocloo/com/cn/adapters/ListViewNewAdapt;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$3;->val$book:Lcom/twocloo/com/cn/beans/BFBook;
a=0;// 
a=0;//     iput p3, p0, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$3;->val$position:I
a=0;// 
a=0;//     .line 323
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$3;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onClick(Landroid/view/View;)V
a=0;//     .locals 6
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 330
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$3;->val$book:Lcom/twocloo/com/cn/beans/BFBook;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/beans/BFBook;);
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/beans/BFBook;->getBookFile()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     const-string v3, ""
a=0;// 
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$3;->val$book:Lcom/twocloo/com/cn/beans/BFBook;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/beans/BFBook;);
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/beans/BFBook;->getBookFile()Ljava/lang/String;
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
a=0;//     .line 332
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     sget-object v3, Lcom/twocloo/com/cn/common/HCData;->downOK:Ljava/util/HashMap;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/HashMap;);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$3;->val$book:Lcom/twocloo/com/cn/beans/BFBook;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/beans/BFBook;);
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/beans/BFBook;->getArticleid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_4
a=0;// 
a=0;//     .line 333
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$3;->val$book:Lcom/twocloo/com/cn/beans/BFBook;
a=0;// 
a=0;//     sget-object v3, Lcom/twocloo/com/cn/common/HCData;->downOK:Ljava/util/HashMap;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/HashMap;);
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$3;->val$book:Lcom/twocloo/com/cn/beans/BFBook;
a=0;// 
a=0;//     #v5=(Reference,Lcom/twocloo/com/cn/beans/BFBook;);
a=0;//     invoke-virtual {v5}, Lcom/twocloo/com/cn/beans/BFBook;->getArticleid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v3, v5}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     check-cast v3, Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v4, v3}, Lcom/twocloo/com/cn/beans/BFBook;->setBookFile(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 345
a=0;//     :cond_1
a=0;//     #v3=(Conflicted);v5=(Conflicted);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$3;->val$book:Lcom/twocloo/com/cn/beans/BFBook;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/beans/BFBook;);
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/beans/BFBook;->getArticleid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3}, Lcom/twocloo/com/cn/common/Util;->read(Ljava/lang/String;)Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 346
a=0;//     .local v2, "mulu":Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/beans/Shubenmulu;);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/Shubenmulu;->getMulist()Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/Shubenmulu;->getMulist()Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-gtz v3, :cond_5
a=0;// 
a=0;//     .line 348
a=0;//     :cond_2
a=0;//     #v3=(Conflicted);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$3;->this$0:Lcom/twocloo/com/cn/adapters/ListViewNewAdapt;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/adapters/ListViewNewAdapt;);
a=0;//     iget v4, p0, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$3;->val$position:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v3, v4}, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt;->access$2(Lcom/twocloo/com/cn/adapters/ListViewNewAdapt;I)V
a=0;// 
a=0;//     .line 374
a=0;//     .end local v2    # "mulu":Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;//     :cond_3
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 336
a=0;//     :cond_4
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Boolean);v4=(Reference,Ljava/lang/String;);v5=(Uninit);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$3;->this$0:Lcom/twocloo/com/cn/adapters/ListViewNewAdapt;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/adapters/ListViewNewAdapt;);
a=0;//     iget v4, p0, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$3;->val$position:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v3, v4}, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt;->access$2(Lcom/twocloo/com/cn/adapters/ListViewNewAdapt;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 352
a=0;//     .restart local v2    # "mulu":Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;//     :cond_5
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/beans/Shubenmulu;);v3=(Integer);v4=(Reference,Ujava/lang/Object;);v5=(Conflicted);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$3;->val$book:Lcom/twocloo/com/cn/beans/BFBook;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/beans/BFBook;);
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/beans/BFBook;->getArticleid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3}, Lcom/twocloo/com/cn/common/Util;->readBook(Ljava/lang/String;)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 353
a=0;//     .local v0, "bookFile":Ljava/io/File;
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     if-eqz v0, :cond_6
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_7
a=0;// 
a=0;//     .line 355
a=0;//     :cond_6
a=0;//     #v3=(Conflicted);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$3;->this$0:Lcom/twocloo/com/cn/adapters/ListViewNewAdapt;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/adapters/ListViewNewAdapt;);
a=0;//     iget v4, p0, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$3;->val$position:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v3, v4}, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt;->access$2(Lcom/twocloo/com/cn/adapters/ListViewNewAdapt;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 360
a=0;//     :cond_7
a=0;//     #v3=(Boolean);v4=(Reference,Ujava/lang/Object;);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$3;->val$book:Lcom/twocloo/com/cn/beans/BFBook;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/beans/BFBook;);
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/beans/BFBook;->getIsUp()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     if-ne v3, v4, :cond_8
a=0;// 
a=0;//     .line 361
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$3;->this$0:Lcom/twocloo/com/cn/adapters/ListViewNewAdapt;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/adapters/ListViewNewAdapt;);
a=0;//     iget-object v3, v3, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     const/16 v4, 0x14e
a=0;// 
a=0;//     #v4=(PosShort);
a=0;//     invoke-virtual {v3, v4}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 362
a=0;//     .local v1, "msg":Landroid/os/Message;
a=0;//     #v1=(Reference,Landroid/os/Message;);
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$3;->val$position:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iput v3, v1, Landroid/os/Message;->arg1:I
a=0;// 
a=0;//     .line 363
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$3;->this$0:Lcom/twocloo/com/cn/adapters/ListViewNewAdapt;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/adapters/ListViewNewAdapt;);
a=0;//     iget-object v3, v3, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     invoke-virtual {v3, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 368
a=0;//     .end local v1    # "msg":Landroid/os/Message;
a=0;//     :cond_8
a=0;//     #v1=(Uninit);v3=(Integer);v4=(One);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$3;->val$book:Lcom/twocloo/com/cn/beans/BFBook;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/beans/BFBook;);
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/beans/BFBook;->getIsdelete()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-eqz v3, :cond_3
a=0;// 
a=0;//     .line 369
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$3;->this$0:Lcom/twocloo/com/cn/adapters/ListViewNewAdapt;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/adapters/ListViewNewAdapt;);
a=0;//     iget-object v3, v3, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     const/16 v4, 0x14d
a=0;// 
a=0;//     #v4=(PosShort);
a=0;//     invoke-virtual {v3, v4}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 370
a=0;//     .restart local v1    # "msg":Landroid/os/Message;
a=0;//     #v1=(Reference,Landroid/os/Message;);
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$3;->val$position:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iput v3, v1, Landroid/os/Message;->arg1:I
a=0;// 
a=0;//     .line 371
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$3;->this$0:Lcom/twocloo/com/cn/adapters/ListViewNewAdapt;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/adapters/ListViewNewAdapt;);
a=0;//     iget-object v3, v3, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     invoke-virtual {v3, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
