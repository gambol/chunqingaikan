package com.twocloo.com.cn.fragment; class DragFragment$1 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/fragment/DragFragment$1;
a=0;// .super Ljava/lang/Object;
a=0;// .source "DragFragment.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/widget/AdapterView$OnItemClickListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/twocloo/com/cn/fragment/DragFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
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
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/fragment/DragFragment;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/fragment/DragFragment;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/fragment/DragFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/DragFragment;
a=0;// 
a=0;//     .line 39
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/fragment/DragFragment$1;);
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
a=0;//     .line 43
a=0;//     .local p1, "parent":Landroid/widget/AdapterView;, "Landroid/widget/AdapterView<*>;"
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/fragment/DragFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/DragFragment;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/fragment/DragFragment;);
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/fragment/DragFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-class v2, Lcom/twocloo/com/cn/activitys/FriendCenterActivity;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 44
a=0;//     .local v0, "intent":Landroid/content/Intent;
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/fragment/DragFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/DragFragment;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lcom/twocloo/com/cn/fragment/DragFragment;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 45
a=0;//     return-void
a=0;// .end method
}}
