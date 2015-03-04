package com.twocloo.com.cn.activitys; class NovelDetailedActivity$2 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$2;
a=0;// .super Lcom/twocloo/com/cn/singlebook/DataCallBack;
a=0;// .source "NovelDetailedActivity.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "Lcom/twocloo/com/cn/singlebook/DataCallBack",
a=0;//         "<",
a=0;//         "Ljava/lang/Boolean;",
a=0;//         ">;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;
a=0;// 
a=0;//     .line 1109
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/singlebook/DataCallBack;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$2;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public callBack(Ljava/lang/Boolean;)V
a=0;//     .locals 9
a=0;//     .param p1, "t"    # Ljava/lang/Boolean;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     .line 1112
a=0;//     #v7=(One);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;);
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->access$58(Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;)Landroid/widget/EditText;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, ""
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 1113
a=0;//     invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 1114
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;);
a=0;//     iput v7, v0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->s:I
a=0;// 
a=0;//     .line 1115
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloo/base/util/ViewUtils;->progressLoading(Landroid/content/Context;)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->access$59(Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;Landroid/app/ProgressDialog;)V
a=0;// 
a=0;//     .line 1116
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;
a=0;// 
a=0;//     #v8=(Reference,Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;);
a=0;//     new-instance v0, Lcom/twocloo/com/cn/threads/ShupingThread;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/threads/ShupingThread;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;);
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->access$27(Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;);
a=0;//     invoke-static {v3}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->access$47(Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;);
a=0;//     iget v4, v4, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->s:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const/4 v5, 0x5
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;
a=0;// 
a=0;//     #v6=(Reference,Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;);
a=0;//     invoke-static {v6}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->access$60(Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;)Landroid/widget/TextView;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-direct/range {v0 .. v7}, Lcom/twocloo/com/cn/threads/ShupingThread;-><init>(Landroid/content/Context;Landroid/os/Handler;Ljava/lang/String;IILandroid/widget/TextView;I)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/threads/ShupingThread;);
a=0;//     invoke-static {v8, v0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->access$61(Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;Lcom/twocloo/com/cn/threads/ShupingThread;)V
a=0;// 
a=0;//     .line 1117
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->access$29(Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;)Lcom/twocloo/com/cn/threads/ShupingThread;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/threads/ShupingThread;->start()V
a=0;// 
a=0;//     .line 1119
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v8=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic callBack(Ljava/lang/Object;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     check-cast p1, Ljava/lang/Boolean;
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity$2;->callBack(Ljava/lang/Boolean;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
