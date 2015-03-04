package com.twocloo.com.cn.activitys; class ShupingReplyActivity$4 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/activitys/ShupingReplyActivity$4;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ShupingReplyActivity.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnClickListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->onClick(Landroid/view/View;)V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity$4;->this$0:Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;
a=0;// 
a=0;//     .line 275
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/ShupingReplyActivity$4;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onClick(Landroid/view/View;)V
a=0;//     .locals 8
a=0;//     .param p1, "arg0"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 279
a=0;//     #v7=(Null);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity$4;->this$0:Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;);
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->access$22(Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;)Landroid/app/Dialog;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/app/Dialog;->cancel()V
a=0;// 
a=0;//     .line 280
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity$4;->this$0:Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/utils/MySharedPreferences;->getMySharedPreferences(Landroid/content/Context;)Lcom/twocloo/com/cn/utils/MySharedPreferences;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 281
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "jubao"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity$4;->this$0:Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->access$23(Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;)Lcom/twocloo/com/cn/beans/Shuping_maininfo;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/Shuping_maininfo;->getTid()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity$4;->this$0:Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;);
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->access$16(Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity$4;->this$0:Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->access$6(Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "0"
a=0;// 
a=0;//     .line 280
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/twocloo/com/cn/utils/MySharedPreferences;->getValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 282
a=0;//     .local v6, "myJubaoString":Ljava/lang/String;
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     const-string v0, "1"
a=0;// 
a=0;//     invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 283
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity$4;->this$0:Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;);
a=0;//     const-string v1, "\u4eb2\uff0c\u4f60\u5df2\u7ecf\u4e3e\u62a5\u8fc7\u6b64\u6761\u8bc4\u8bba\u3002"
a=0;// 
a=0;//     invoke-static {v0, v1, v7}, Lcom/twocloo/base/util/ViewUtils;->toastOnUI(Landroid/app/Activity;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 293
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 286
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 287
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity$4;->this$0:Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/utils/MySharedPreferences;->getMySharedPreferences(Landroid/content/Context;)Lcom/twocloo/com/cn/utils/MySharedPreferences;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 288
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "jubao"
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity$4;->this$0:Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->access$23(Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;)Lcom/twocloo/com/cn/beans/Shuping_maininfo;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/Shuping_maininfo;->getTid()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity$4;->this$0:Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;);
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->access$16(Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity$4;->this$0:Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->access$6(Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "1"
a=0;// 
a=0;//     .line 287
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/twocloo/com/cn/utils/MySharedPreferences;->setValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     .line 289
a=0;//     new-instance v0, Lcom/twocloo/com/cn/task/JubaoTask;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/task/JubaoTask;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity$4;->this$0:Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;
a=0;// 
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity$4;->this$0:Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;);
a=0;//     invoke-static {v3}, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->access$17(Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity$4;->this$0:Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;);
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->access$23(Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;)Lcom/twocloo/com/cn/beans/Shuping_maininfo;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/beans/Shuping_maininfo;->getTid()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity$4;->this$0:Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;
a=0;// 
a=0;//     #v5=(Reference,Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;);
a=0;//     invoke-static {v5}, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->access$23(Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;)Lcom/twocloo/com/cn/beans/Shuping_maininfo;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 290
a=0;//     invoke-virtual {v5}, Lcom/twocloo/com/cn/beans/Shuping_maininfo;->getPid()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 289
a=0;//     #v5=(Integer);
a=0;//     invoke-direct/range {v0 .. v5}, Lcom/twocloo/com/cn/task/JubaoTask;-><init>(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;II)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/task/JubaoTask;);
a=0;//     new-array v1, v7, [Ljava/lang/Void;
a=0;// 
a=0;//     .line 290
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/com/cn/task/JubaoTask;->execute([Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
