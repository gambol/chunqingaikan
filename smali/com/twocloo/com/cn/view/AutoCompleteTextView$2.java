package com.twocloo.com.cn.view; class AutoCompleteTextView$2 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/view/AutoCompleteTextView$2;
a=0;// .super Ljava/lang/Object;
a=0;// .source "AutoCompleteTextView.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/widget/AdapterView$OnItemClickListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/twocloo/com/cn/view/AutoCompleteTextView;->setPopw()V
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
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/view/AutoCompleteTextView;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/view/AutoCompleteTextView;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView$2;->this$0:Lcom/twocloo/com/cn/view/AutoCompleteTextView;
a=0;// 
a=0;//     .line 180
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/view/AutoCompleteTextView$2;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
a=0;//     .locals 3
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
a=0;//     .line 184
a=0;//     .local p1, "parent":Landroid/widget/AdapterView;, "Landroid/widget/AdapterView<*>;"
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView$2;->this$0:Lcom/twocloo/com/cn/view/AutoCompleteTextView;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/view/AutoCompleteTextView;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView$2;->this$0:Lcom/twocloo/com/cn/view/AutoCompleteTextView;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/view/AutoCompleteTextView;);
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->access$0(Lcom/twocloo/com/cn/view/AutoCompleteTextView;)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Ljava/lang/CharSequence;
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 185
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView$2;->this$0:Lcom/twocloo/com/cn/view/AutoCompleteTextView;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->access$4(Lcom/twocloo/com/cn/view/AutoCompleteTextView;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 186
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView$2;->this$0:Lcom/twocloo/com/cn/view/AutoCompleteTextView;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/view/AutoCompleteTextView;);
a=0;//     iget-object v1, v1, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->relativeLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView$2;->this$0:Lcom/twocloo/com/cn/view/AutoCompleteTextView;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->access$3(Lcom/twocloo/com/cn/view/AutoCompleteTextView;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout;->removeView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 193
a=0;//     :goto_0
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView$2;->this$0:Lcom/twocloo/com/cn/view/AutoCompleteTextView;
a=0;// 
a=0;//     iget-object v1, v1, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->context:Landroid/content/Context;
a=0;// 
a=0;//     const-class v2, Lcom/twocloo/com/cn/activitys/SearchActivity;
a=0;// 
a=0;//     invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 194
a=0;//     .local v0, "intent":Landroid/content/Intent;
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView$2;->this$0:Lcom/twocloo/com/cn/view/AutoCompleteTextView;
a=0;// 
a=0;//     iget-object v1, v1, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->context:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 195
a=0;//     return-void
a=0;// 
a=0;//     .line 188
a=0;//     .end local v0    # "intent":Landroid/content/Intent;
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Boolean);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView$2;->this$0:Lcom/twocloo/com/cn/view/AutoCompleteTextView;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/view/AutoCompleteTextView;);
a=0;//     iget-object v1, v1, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->linearLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView$2;->this$0:Lcom/twocloo/com/cn/view/AutoCompleteTextView;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->access$3(Lcom/twocloo/com/cn/view/AutoCompleteTextView;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->removeView(Landroid/view/View;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
