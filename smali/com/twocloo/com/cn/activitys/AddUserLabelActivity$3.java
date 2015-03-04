package com.twocloo.com.cn.activitys; class AddUserLabelActivity$3 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/activitys/AddUserLabelActivity$3;
a=0;// .super Ljava/lang/Object;
a=0;// .source "AddUserLabelActivity.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/widget/AdapterView$OnItemClickListener;
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
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "Ljava/lang/Object;",
a=0;//         "Landroid/widget/AdapterView$OnItemClickListener;"
a=0;//     }
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
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity$3;->this$0:Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;
a=0;// 
a=0;//     .line 118
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/AddUserLabelActivity$3;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
a=0;//     .locals 4
a=0;//     .param p2, "view"    # Landroid/view/View;
a=0;//     .param p3, "position"    # I
a=0;//     .param p4, "id"    # J
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
a=0;//     .local p1, "parent":Landroid/widget/AdapterView;, "Landroid/widget/AdapterView<*>;"
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 122
a=0;//     #v3=(Null);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity$3;->this$0:Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;);
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;->access$5(Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x4
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-ge v1, v2, :cond_1
a=0;// 
a=0;//     .line 124
a=0;//     sget v1, Lcom/twocloo/com/cn/R$id;->label:I
a=0;// 
a=0;//     invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     .line 125
a=0;//     .local v0, "button":Landroid/widget/TextView;
a=0;//     sget v1, Lcom/twocloo/com/cn/R$drawable;->changfaxing_gray:I
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 126
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity$3;->this$0:Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;);
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;->access$5(Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity$3;->this$0:Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;);
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;->access$0(Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 127
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity$3;->this$0:Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;);
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;->access$5(Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity$3;->this$0:Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;->access$0(Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 128
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity$3;->this$0:Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;->access$6(Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;)Lcom/twocloo/com/cn/adapters/MyLabelAdapter;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/adapters/MyLabelAdapter;->notifyDataSetChanged()V
a=0;// 
a=0;//     .line 136
a=0;//     .end local v0    # "button":Landroid/widget/TextView;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 130
a=0;//     .restart local v0    # "button":Landroid/widget/TextView;
a=0;//     :cond_0
a=0;//     #v0=(Reference,Landroid/widget/TextView;);v1=(Boolean);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity$3;->this$0:Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;);
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "\u8fd9\u4e2a\u6807\u7b7e\u5df2\u7ecf\u9009\u62e9\u8fc7"
a=0;// 
a=0;//     invoke-static {v1, v2, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 134
a=0;//     .end local v0    # "button":Landroid/widget/TextView;
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Integer);v2=(PosByte);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity$3;->this$0:Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;);
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "\u6700\u591a\u53ef\u6dfb\u52a0\u56db\u4e2a\u6807\u7b7e\u5406"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
