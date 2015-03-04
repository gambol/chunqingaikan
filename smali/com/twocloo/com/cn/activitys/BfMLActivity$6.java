package com.twocloo.com.cn.activitys; class BfMLActivity$6 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/activitys/BfMLActivity$6;
a=0;// .super Ljava/lang/Object;
a=0;// .source "BfMLActivity.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/widget/AdapterView$OnItemClickListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/twocloo/com/cn/activitys/BfMLActivity;->setListViewLs()V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "Ljava/lang/Object;",
a=0;//         "Landroid/widget/AdapterView$OnItemClickListener;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/activitys/BfMLActivity;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$6;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     .line 290
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/BfMLActivity$6;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
a=0;//     .locals 9
a=0;//     .param p2, "arg1"    # Landroid/view/View;
a=0;//     .param p3, "position"    # I
a=0;//     .param p4, "arg3"    # J
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Landroid/widget/AdapterView",
a=0;//             "<*>;",
a=0;//             "Landroid/view/View;",
a=0;//             "IJ)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .local p1, "arg0":Landroid/widget/AdapterView;, "Landroid/widget/AdapterView<*>;"
a=0;//     const/high16 v3, 0x4000000
a=0;// 
a=0;//     .line 292
a=0;//     #v3=(Integer);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 293
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$6;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/BfMLActivity;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, v0, Lcom/twocloo/com/cn/activitys/BfMLActivity;->uid:Ljava/lang/String;
a=0;// 
a=0;//     .line 295
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$6;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/BfMLActivity;);
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->access$6(Lcom/twocloo/com/cn/activitys/BfMLActivity;)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v7, Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;// 
a=0;//     .line 297
a=0;//     .local v7, "cp":Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;//     invoke-virtual {v7}, Lcom/twocloo/com/cn/beans/Chapterinfo;->getIs_vip()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-ne v0, v1, :cond_2
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$6;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/BfMLActivity;);
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->access$1(Lcom/twocloo/com/cn/activitys/BfMLActivity;)Lcom/twocloo/com/cn/threads/SubedchaptersinfoThread;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/threads/SubedchaptersinfoThread;->scif:Lcom/twocloo/com/cn/beans/Subed_chapters_info;
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$6;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->access$1(Lcom/twocloo/com/cn/activitys/BfMLActivity;)Lcom/twocloo/com/cn/threads/SubedchaptersinfoThread;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/threads/SubedchaptersinfoThread;->scif:Lcom/twocloo/com/cn/beans/Subed_chapters_info;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/beans/Subed_chapters_info;->getSubed_textid_list()Ljava/util/HashSet;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v7}, Lcom/twocloo/com/cn/beans/Chapterinfo;->getId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 298
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 300
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$6;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$6;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->access$23(Lcom/twocloo/com/cn/activitys/BfMLActivity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/twocloo/com/cn/utils/CommonUtils;->goToLogin(Landroid/app/Activity;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 336
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v8=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 303
a=0;//     :cond_1
a=0;//     #v2=(Uninit);v3=(Integer);v4=(Uninit);v5=(Uninit);v6=(Uninit);v8=(Uninit);
a=0;//     new-instance v0, Lcom/twocloo/com/cn/view/VipChapterOrder;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/view/VipChapterOrder;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$6;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     iget-object v1, v1, Lcom/twocloo/com/cn/activitys/BfMLActivity;->uid:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$6;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/activitys/BfMLActivity;);
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->access$8(Lcom/twocloo/com/cn/activitys/BfMLActivity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v7}, Lcom/twocloo/com/cn/beans/Chapterinfo;->getId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v7}, Lcom/twocloo/com/cn/beans/Chapterinfo;->getIs_vip()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$6;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     #v5=(Reference,Lcom/twocloo/com/cn/activitys/BfMLActivity;);
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$6;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     #v6=(Reference,Lcom/twocloo/com/cn/activitys/BfMLActivity;);
a=0;//     iget-object v6, v6, Lcom/twocloo/com/cn/activitys/BfMLActivity;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     invoke-direct/range {v0 .. v6}, Lcom/twocloo/com/cn/view/VipChapterOrder;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILandroid/app/Activity;Landroid/os/Handler;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/VipChapterOrder;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 307
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Uninit);v3=(Integer);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     const-string v0, "single"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$6;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/BfMLActivity;);
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$string;->apptype:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     invoke-virtual {v7}, Lcom/twocloo/com/cn/beans/Chapterinfo;->getIs_vip()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     invoke-virtual {v7}, Lcom/twocloo/com/cn/beans/Chapterinfo;->getLen()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-nez v0, :cond_4
a=0;// 
a=0;//     .line 308
a=0;//     :cond_3
a=0;//     const-string v0, "client"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$6;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$string;->apptype:I
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     invoke-virtual {v7}, Lcom/twocloo/com/cn/beans/Chapterinfo;->getIs_vip()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_5
a=0;// 
a=0;//     invoke-virtual {v7}, Lcom/twocloo/com/cn/beans/Chapterinfo;->getLen()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     .line 311
a=0;//     :cond_4
a=0;//     new-instance v8, Landroid/content/Intent;
a=0;// 
a=0;//     #v8=(UninitRef,Landroid/content/Intent;);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$6;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/BfMLActivity;);
a=0;//     const-class v1, Lcom/twocloo/com/cn/activitys/ReadbookDown;
a=0;// 
a=0;//     invoke-direct {v8, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 312
a=0;//     .local v8, "intent":Landroid/content/Intent;
a=0;//     #v8=(Reference,Landroid/content/Intent;);
a=0;//     const-string v0, "bookFile"
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "/2cloo/downBook/"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$6;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->access$8(Lcom/twocloo/com/cn/activitys/BfMLActivity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "/"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 313
a=0;//     const-string v2, "book_text_"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$6;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->access$8(Lcom/twocloo/com/cn/activitys/BfMLActivity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, ".txt"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 312
a=0;//     invoke-virtual {v8, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 314
a=0;//     const-string v0, "finishFlag"
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v8, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 315
a=0;//     const-string v0, "aid"
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$6;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/BfMLActivity;);
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->access$8(Lcom/twocloo/com/cn/activitys/BfMLActivity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v8, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 316
a=0;//     const-string v0, "textid"
a=0;// 
a=0;//     invoke-virtual {v7}, Lcom/twocloo/com/cn/beans/Chapterinfo;->getId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v8, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 318
a=0;//     const-string v0, "imgFile"
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 319
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "/2cloo/imgCache/bddc497cedd9bff878e0713624be988b"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 318
a=0;//     invoke-virtual {v8, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 320
a=0;//     invoke-virtual {v8, v3}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 321
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/common/CloseActivity;->closeRd()V
a=0;// 
a=0;//     .line 322
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$6;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     invoke-virtual {v0, v8}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 323
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$6;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->finish()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 325
a=0;//     .end local v8    # "intent":Landroid/content/Intent;
a=0;//     :cond_5
a=0;//     #v0=(Integer);v2=(Integer);v8=(Uninit);
a=0;//     new-instance v8, Landroid/content/Intent;
a=0;// 
a=0;//     #v8=(UninitRef,Landroid/content/Intent;);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$6;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/BfMLActivity;);
a=0;//     const-class v1, Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     invoke-direct {v8, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 326
a=0;//     .restart local v8    # "intent":Landroid/content/Intent;
a=0;//     #v8=(Reference,Landroid/content/Intent;);
a=0;//     const-string v0, "textid"
a=0;// 
a=0;//     invoke-virtual {v7}, Lcom/twocloo/com/cn/beans/Chapterinfo;->getId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v8, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 327
a=0;//     const-string v0, "aid"
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$6;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->access$8(Lcom/twocloo/com/cn/activitys/BfMLActivity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v8, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 328
a=0;//     const-string v0, "isVip"
a=0;// 
a=0;//     invoke-virtual {v7}, Lcom/twocloo/com/cn/beans/Chapterinfo;->getIs_vip()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v8, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 329
a=0;//     const-string v0, "WEB"
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$6;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/BfMLActivity;);
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->access$24(Lcom/twocloo/com/cn/activitys/BfMLActivity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v8, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 330
a=0;//     invoke-virtual {v8, v3}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 331
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/common/CloseActivity;->closeReadBookDown()V
a=0;// 
a=0;//     .line 332
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$6;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     invoke-virtual {v0, v8}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 333
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$6;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->finish()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
}}
