package com.twocloo.com.cn.view; class AutoCompleteTextView$1 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/view/AutoCompleteTextView$1;
a=0;// .super Ljava/lang/Object;
a=0;// .source "AutoCompleteTextView.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/text/TextWatcher;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/twocloo/com/cn/view/AutoCompleteTextView;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
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
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView$1;->this$0:Lcom/twocloo/com/cn/view/AutoCompleteTextView;
a=0;// 
a=0;//     .line 105
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/view/AutoCompleteTextView$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public afterTextChanged(Landroid/text/Editable;)V
a=0;//     .locals 1
a=0;//     .param p1, "s"    # Landroid/text/Editable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 152
a=0;//     invoke-interface {p1}, Landroid/text/Editable;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 153
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView$1;->this$0:Lcom/twocloo/com/cn/view/AutoCompleteTextView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/AutoCompleteTextView;);
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->removeTheShowView()V
a=0;// 
a=0;//     .line 155
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView$1;->this$0:Lcom/twocloo/com/cn/view/AutoCompleteTextView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/AutoCompleteTextView;);
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->myTextWatcher:Lcom/twocloo/com/cn/view/AutoCompleteTextView$MyTextWatcher;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 156
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView$1;->this$0:Lcom/twocloo/com/cn/view/AutoCompleteTextView;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->myTextWatcher:Lcom/twocloo/com/cn/view/AutoCompleteTextView$MyTextWatcher;
a=0;// 
a=0;//     invoke-interface {v0, p1}, Lcom/twocloo/com/cn/view/AutoCompleteTextView$MyTextWatcher;->afterTextChanged(Landroid/text/Editable;)V
a=0;// 
a=0;//     .line 158
a=0;//     :cond_1
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public beforeTextChanged(Ljava/lang/CharSequence;III)V
a=0;//     .locals 1
a=0;//     .param p1, "s"    # Ljava/lang/CharSequence;
a=0;//     .param p2, "start"    # I
a=0;//     .param p3, "count"    # I
a=0;//     .param p4, "after"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 145
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView$1;->this$0:Lcom/twocloo/com/cn/view/AutoCompleteTextView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/AutoCompleteTextView;);
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->myTextWatcher:Lcom/twocloo/com/cn/view/AutoCompleteTextView$MyTextWatcher;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 146
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView$1;->this$0:Lcom/twocloo/com/cn/view/AutoCompleteTextView;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->myTextWatcher:Lcom/twocloo/com/cn/view/AutoCompleteTextView$MyTextWatcher;
a=0;// 
a=0;//     invoke-interface {v0, p1, p2, p3, p4}, Lcom/twocloo/com/cn/view/AutoCompleteTextView$MyTextWatcher;->beforeTextChanged(Ljava/lang/CharSequence;III)V
a=0;// 
a=0;//     .line 148
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onTextChanged(Ljava/lang/CharSequence;III)V
a=0;//     .locals 6
a=0;//     .param p1, "s"    # Ljava/lang/CharSequence;
a=0;//     .param p2, "start"    # I
a=0;//     .param p3, "before"    # I
a=0;//     .param p4, "count"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 109
a=0;//     #v5=(Null);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView$1;->this$0:Lcom/twocloo/com/cn/view/AutoCompleteTextView;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/view/AutoCompleteTextView;);
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->access$0(Lcom/twocloo/com/cn/view/AutoCompleteTextView;)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V
a=0;// 
a=0;//     .line 110
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView$1;->this$0:Lcom/twocloo/com/cn/view/AutoCompleteTextView;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->access$0(Lcom/twocloo/com/cn/view/AutoCompleteTextView;)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView$1;->this$0:Lcom/twocloo/com/cn/view/AutoCompleteTextView;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/view/AutoCompleteTextView;);
a=0;//     invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView$1;->this$0:Lcom/twocloo/com/cn/view/AutoCompleteTextView;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/view/AutoCompleteTextView;);
a=0;//     iget-object v4, v4, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->memoryData:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-static {v2, v3, v4}, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->access$1(Lcom/twocloo/com/cn/view/AutoCompleteTextView;Ljava/lang/String;Ljava/util/ArrayList;)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z
a=0;// 
a=0;//     .line 111
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView$1;->this$0:Lcom/twocloo/com/cn/view/AutoCompleteTextView;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->access$0(Lcom/twocloo/com/cn/view/AutoCompleteTextView;)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_3
a=0;// 
a=0;//     .line 112
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView$1;->this$0:Lcom/twocloo/com/cn/view/AutoCompleteTextView;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/view/AutoCompleteTextView;);
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->access$2(Lcom/twocloo/com/cn/view/AutoCompleteTextView;)Lcom/twocloo/com/cn/adapters/SearchAdapter;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/adapters/SearchAdapter;->notifyDataSetInvalidated()V
a=0;// 
a=0;//     .line 113
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView$1;->this$0:Lcom/twocloo/com/cn/view/AutoCompleteTextView;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->access$3(Lcom/twocloo/com/cn/view/AutoCompleteTextView;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/view/View;->isShown()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 117
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView$1;->this$0:Lcom/twocloo/com/cn/view/AutoCompleteTextView;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/view/AutoCompleteTextView;);
a=0;//     iget-object v1, v1, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->context:Landroid/content/Context;
a=0;// 
a=0;//     check-cast v1, Landroid/app/Activity;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/utils/DisplayUtil;->getScreenW(Landroid/app/Activity;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 119
a=0;//     .local v0, "width":I
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView$1;->this$0:Lcom/twocloo/com/cn/view/AutoCompleteTextView;
a=0;// 
a=0;//     iget-object v1, v1, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->layoutParams:Landroid/widget/RelativeLayout$LayoutParams;
a=0;// 
a=0;//     const/4 v2, 0x3
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     sget-object v3, Lcom/twocloo/com/cn/activitys/SearchActivity;->layout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/widget/LinearLayout;->getId()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V
a=0;// 
a=0;//     .line 122
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView$1;->this$0:Lcom/twocloo/com/cn/view/AutoCompleteTextView;
a=0;// 
a=0;//     iget-object v1, v1, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->layoutParams:Landroid/widget/RelativeLayout$LayoutParams;
a=0;// 
a=0;//     mul-int/lit8 v2, v0, 0x46
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     div-int/lit16 v2, v2, 0x1e0
a=0;// 
a=0;//     mul-int/lit8 v3, v0, 0x46
a=0;// 
a=0;//     div-int/lit16 v3, v3, 0x1e0
a=0;// 
a=0;//     invoke-virtual {v1, v2, v5, v3, v5}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V
a=0;// 
a=0;//     .line 123
a=0;//     sput-boolean v5, Lcom/twocloo/com/cn/activitys/SearchActivity;->isBackFromNovel:Z
a=0;// 
a=0;//     .line 124
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView$1;->this$0:Lcom/twocloo/com/cn/view/AutoCompleteTextView;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->access$4(Lcom/twocloo/com/cn/view/AutoCompleteTextView;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 125
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView$1;->this$0:Lcom/twocloo/com/cn/view/AutoCompleteTextView;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/view/AutoCompleteTextView;);
a=0;//     iget-object v1, v1, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->relativeLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView$1;->this$0:Lcom/twocloo/com/cn/view/AutoCompleteTextView;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/view/AutoCompleteTextView;);
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->access$3(Lcom/twocloo/com/cn/view/AutoCompleteTextView;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView$1;->this$0:Lcom/twocloo/com/cn/view/AutoCompleteTextView;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/view/AutoCompleteTextView;);
a=0;//     iget-object v3, v3, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->layoutParams:Landroid/widget/RelativeLayout$LayoutParams;
a=0;// 
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 129
a=0;//     :goto_0
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView$1;->this$0:Lcom/twocloo/com/cn/view/AutoCompleteTextView;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->access$3(Lcom/twocloo/com/cn/view/AutoCompleteTextView;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v1, v2}, Landroid/view/View;->setFocusable(Z)V
a=0;// 
a=0;//     .line 138
a=0;//     .end local v0    # "width":I
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView$1;->this$0:Lcom/twocloo/com/cn/view/AutoCompleteTextView;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/view/AutoCompleteTextView;);
a=0;//     iget-object v1, v1, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->myTextWatcher:Lcom/twocloo/com/cn/view/AutoCompleteTextView$MyTextWatcher;
a=0;// 
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 139
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView$1;->this$0:Lcom/twocloo/com/cn/view/AutoCompleteTextView;
a=0;// 
a=0;//     iget-object v1, v1, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->myTextWatcher:Lcom/twocloo/com/cn/view/AutoCompleteTextView$MyTextWatcher;
a=0;// 
a=0;//     invoke-interface {v1, p1, p2, p3, p4}, Lcom/twocloo/com/cn/view/AutoCompleteTextView$MyTextWatcher;->onTextChanged(Ljava/lang/CharSequence;III)V
a=0;// 
a=0;//     .line 141
a=0;//     :cond_1
a=0;//     return-void
a=0;// 
a=0;//     .line 127
a=0;//     .restart local v0    # "width":I
a=0;//     :cond_2
a=0;//     #v0=(Integer);v1=(Boolean);v2=(Integer);v3=(Integer);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView$1;->this$0:Lcom/twocloo/com/cn/view/AutoCompleteTextView;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/view/AutoCompleteTextView;);
a=0;//     iget-object v1, v1, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->linearLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView$1;->this$0:Lcom/twocloo/com/cn/view/AutoCompleteTextView;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/view/AutoCompleteTextView;);
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->access$3(Lcom/twocloo/com/cn/view/AutoCompleteTextView;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView$1;->this$0:Lcom/twocloo/com/cn/view/AutoCompleteTextView;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/view/AutoCompleteTextView;);
a=0;//     iget-object v3, v3, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->layoutParams:Landroid/widget/RelativeLayout$LayoutParams;
a=0;// 
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 132
a=0;//     .end local v0    # "width":I
a=0;//     :cond_3
a=0;//     #v0=(Uninit);v1=(Integer);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView$1;->this$0:Lcom/twocloo/com/cn/view/AutoCompleteTextView;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/view/AutoCompleteTextView;);
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->access$4(Lcom/twocloo/com/cn/view/AutoCompleteTextView;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     .line 133
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView$1;->this$0:Lcom/twocloo/com/cn/view/AutoCompleteTextView;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/view/AutoCompleteTextView;);
a=0;//     iget-object v1, v1, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->relativeLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView$1;->this$0:Lcom/twocloo/com/cn/view/AutoCompleteTextView;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->access$3(Lcom/twocloo/com/cn/view/AutoCompleteTextView;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout;->removeView(Landroid/view/View;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 135
a=0;//     :cond_4
a=0;//     #v1=(Boolean);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView$1;->this$0:Lcom/twocloo/com/cn/view/AutoCompleteTextView;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/view/AutoCompleteTextView;);
a=0;//     iget-object v1, v1, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->linearLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView$1;->this$0:Lcom/twocloo/com/cn/view/AutoCompleteTextView;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->access$3(Lcom/twocloo/com/cn/view/AutoCompleteTextView;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->removeView(Landroid/view/View;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
}}
