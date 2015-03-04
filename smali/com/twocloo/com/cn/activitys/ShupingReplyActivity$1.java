package com.twocloo.com.cn.activitys; class ShupingReplyActivity$1 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/activitys/ShupingReplyActivity$1;
a=0;// .super Lcom/twocloo/com/cn/singlebook/DataCallBack;
a=0;// .source "ShupingReplyActivity.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;
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
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;
a=0;// 
a=0;//     .line 331
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/singlebook/DataCallBack;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/ShupingReplyActivity$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public callBack(Ljava/lang/Boolean;)V
a=0;//     .locals 11
a=0;//     .param p1, "t"    # Ljava/lang/Boolean;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .line 334
a=0;//     #v8=(Null);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;);
a=0;//     const-string v1, "\u56de\u590d\u6210\u529f"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1, v8}, Lcom/twocloo/base/util/ViewUtils;->toastOnUI(Landroid/app/Activity;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 335
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->access$0(Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;)Landroid/widget/TextView;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;);
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->access$1(Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 336
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->access$2(Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;)Landroid/widget/EditText;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, ""
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 337
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-static {v0, v1}, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->access$3(Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;I)V
a=0;// 
a=0;//     .line 338
a=0;//     iget-object v10, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;
a=0;// 
a=0;//     #v10=(Reference,Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;);
a=0;//     new-instance v0, Lcom/twocloo/com/cn/task/ReplyTask;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/task/ReplyTask;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;);
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->access$4(Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;);
a=0;//     invoke-static {v3}, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->access$5(Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;);
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->access$6(Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;
a=0;// 
a=0;//     #v5=(Reference,Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;);
a=0;//     invoke-static {v5}, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->access$7(Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     const/16 v6, 0xa
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;
a=0;// 
a=0;//     #v7=(Reference,Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;);
a=0;//     invoke-static {v7}, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->access$8(Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;)Landroid/widget/TextView;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     iget-object v9, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;
a=0;// 
a=0;//     #v9=(Reference,Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;);
a=0;//     iget-object v9, v9, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->queryCallBack:Lcom/twocloo/com/cn/singlebook/DataCallBack;
a=0;// 
a=0;//     invoke-direct/range {v0 .. v9}, Lcom/twocloo/com/cn/task/ReplyTask;-><init>(Landroid/app/Activity;IILjava/lang/String;IILandroid/widget/TextView;ZLcom/twocloo/com/cn/singlebook/DataCallBack;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/task/ReplyTask;);
a=0;//     invoke-static {v10, v0}, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->access$9(Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;Lcom/twocloo/com/cn/task/ReplyTask;)V
a=0;// 
a=0;//     .line 339
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;->access$10(Lcom/twocloo/com/cn/activitys/ShupingReplyActivity;)Lcom/twocloo/com/cn/task/ReplyTask;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-array v1, v8, [Ljava/lang/Void;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/com/cn/task/ReplyTask;->execute([Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 340
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
a=0;//     invoke-virtual {p0, p1}, Lcom/twocloo/com/cn/activitys/ShupingReplyActivity$1;->callBack(Ljava/lang/Boolean;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
