package com.twocloo.com.cn.activitys; class FriendCenterActivity { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/activitys/FriendCenterActivity;
a=0;// .super Landroid/app/Activity;
a=0;// .source "FriendCenterActivity.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnClickListener;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private add1:Landroid/widget/TextView;
a=0;// 
a=0;// .field private address:Landroid/widget/TextView;
a=0;// 
a=0;// .field private age:Landroid/widget/TextView;
a=0;// 
a=0;// .field private biaoqian1:Landroid/widget/Button;
a=0;// 
a=0;// .field private biaoqian2:Landroid/widget/Button;
a=0;// 
a=0;// .field private biaoqian3:Landroid/widget/Button;
a=0;// 
a=0;// .field private biaoqian4:Landroid/widget/Button;
a=0;// 
a=0;// .field private btn_back:Landroid/widget/ImageView;
a=0;// 
a=0;// .field private drag:Landroid/widget/Button;
a=0;// 
a=0;// .field private gridView:Landroid/widget/GridView;
a=0;// 
a=0;// .field private guanzhu:Landroid/widget/Button;
a=0;// 
a=0;// .field private isDrag:Z
a=0;// 
a=0;// .field private jubao:Landroid/widget/Button;
a=0;// 
a=0;// .field private photoGridviewAdapter:Lcom/twocloo/com/cn/adapters/FriendPhotoGridviewAdapter;
a=0;// 
a=0;// .field private photo_List:Ljava/util/ArrayList;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private user_qianming:Landroid/widget/TextView;
a=0;// 
a=0;// .field private username:Landroid/widget/TextView;
a=0;// 
a=0;// .field private usersex:Landroid/widget/ImageView;
a=0;// 
a=0;// .field private xiaozhitiao:Landroid/widget/Button;
a=0;// 
a=0;// .field private yuedu1:Landroid/widget/Button;
a=0;// 
a=0;// .field private yuedu2:Landroid/widget/Button;
a=0;// 
a=0;// .field private yuedu3:Landroid/widget/Button;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 40
a=0;//     invoke-direct {p0}, Landroid/app/Activity;-><init>()V
a=0;// 
a=0;//     .line 106
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/FriendCenterActivity;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/twocloo/com/cn/activitys/FriendCenterActivity;->isDrag:Z
a=0;// 
a=0;//     .line 109
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/FriendCenterActivity;->photo_List:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 40
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/twocloo/com/cn/activitys/FriendCenterActivity;)Landroid/widget/TextView;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 108
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/FriendCenterActivity;->add1:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private initView()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 138
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->phpto_gridview:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/FriendCenterActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/GridView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/FriendCenterActivity;->gridView:Landroid/widget/GridView;
a=0;// 
a=0;//     .line 139
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->btn_back:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/FriendCenterActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ImageView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/FriendCenterActivity;->btn_back:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 140
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->user_name:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/FriendCenterActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/FriendCenterActivity;->username:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 141
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->user_qianming:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/FriendCenterActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/FriendCenterActivity;->user_qianming:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 142
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->user_age:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/FriendCenterActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/FriendCenterActivity;->age:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 143
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->user_address:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/FriendCenterActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/FriendCenterActivity;->address:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 144
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->user_sex:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/FriendCenterActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ImageView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/FriendCenterActivity;->usersex:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 145
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->support_count:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/FriendCenterActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/FriendCenterActivity;->drag:Landroid/widget/Button;
a=0;// 
a=0;//     .line 146
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->btn_xiaozhitiao:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/FriendCenterActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/FriendCenterActivity;->xiaozhitiao:Landroid/widget/Button;
a=0;// 
a=0;//     .line 147
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->btn_guanzhu:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/FriendCenterActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/FriendCenterActivity;->guanzhu:Landroid/widget/Button;
a=0;// 
a=0;//     .line 148
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->btn_jubao:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/FriendCenterActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/FriendCenterActivity;->jubao:Landroid/widget/Button;
a=0;// 
a=0;//     .line 149
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->biaotian1:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/FriendCenterActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/FriendCenterActivity;->biaoqian1:Landroid/widget/Button;
a=0;// 
a=0;//     .line 150
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->biaotian2:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/FriendCenterActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/FriendCenterActivity;->biaoqian2:Landroid/widget/Button;
a=0;// 
a=0;//     .line 151
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->biaotian3:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/FriendCenterActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/FriendCenterActivity;->biaoqian3:Landroid/widget/Button;
a=0;// 
a=0;//     .line 152
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->biaotian4:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/FriendCenterActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/FriendCenterActivity;->biaoqian4:Landroid/widget/Button;
a=0;// 
a=0;//     .line 153
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->yuedu1:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/FriendCenterActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/FriendCenterActivity;->yuedu1:Landroid/widget/Button;
a=0;// 
a=0;//     .line 154
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->yuedu2:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/FriendCenterActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/FriendCenterActivity;->yuedu2:Landroid/widget/Button;
a=0;// 
a=0;//     .line 155
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->yuedu3:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/FriendCenterActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/FriendCenterActivity;->yuedu3:Landroid/widget/Button;
a=0;// 
a=0;//     .line 156
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->add1:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/FriendCenterActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/FriendCenterActivity;->add1:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 157
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/FriendCenterActivity;->btn_back:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 158
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/FriendCenterActivity;->drag:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 159
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/FriendCenterActivity;->xiaozhitiao:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 160
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/FriendCenterActivity;->guanzhu:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 161
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/FriendCenterActivity;->jubao:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 162
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onClick(Landroid/view/View;)V
a=0;//     .locals 14
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     const/high16 v1, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const/4 v13, 0x0
a=0;// 
a=0;//     #v13=(Null);
a=0;//     const/4 v12, 0x1
a=0;// 
a=0;//     #v12=(One);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 166
a=0;//     #v6=(Null);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/FriendCenterActivity;->xiaozhitiao:Landroid/widget/Button;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/Button;);
a=0;//     if-ne p1, v2, :cond_1
a=0;// 
a=0;//     .line 167
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/FriendCenterActivity;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     const-string v2, "\u6b64\u529f\u80fd\u8fd8\u672a\u4e0a\u7ebf\uff0c\u656c\u8bf7\u671f\u5f85\uff01"
a=0;// 
a=0;//     invoke-static {v1, v2, v12}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     .line 219
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Integer);v5=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 168
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Integer);v2=(Reference,Landroid/widget/Button;);v3=(Uninit);v4=(Null);v5=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/FriendCenterActivity;->guanzhu:Landroid/widget/Button;
a=0;// 
a=0;//     if-ne p1, v2, :cond_2
a=0;// 
a=0;//     .line 169
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/FriendCenterActivity;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     const-string v2, "\u6b64\u529f\u80fd\u8fd8\u672a\u4e0a\u7ebf\uff0c\u656c\u8bf7\u671f\u5f85\uff01"
a=0;// 
a=0;//     invoke-static {v1, v2, v12}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 170
a=0;//     :cond_2
a=0;//     #v1=(Integer);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/FriendCenterActivity;->jubao:Landroid/widget/Button;
a=0;// 
a=0;//     if-ne p1, v2, :cond_3
a=0;// 
a=0;//     .line 171
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/FriendCenterActivity;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     const-string v2, "\u6b64\u529f\u80fd\u8fd8\u672a\u4e0a\u7ebf\uff0c\u656c\u8bf7\u671f\u5f85\uff01"
a=0;// 
a=0;//     invoke-static {v1, v2, v12}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 173
a=0;//     :cond_3
a=0;//     #v1=(Integer);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/FriendCenterActivity;->drag:Landroid/widget/Button;
a=0;// 
a=0;//     if-ne p1, v2, :cond_0
a=0;// 
a=0;//     .line 174
a=0;//     iget-boolean v2, p0, Lcom/twocloo/com/cn/activitys/FriendCenterActivity;->isDrag:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 175
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/FriendCenterActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v3, Lcom/twocloo/com/cn/R$drawable;->zan_press:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     .line 177
a=0;//     .local v10, "drawable":Landroid/graphics/drawable/Drawable;
a=0;//     #v10=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     invoke-virtual {v10}, Landroid/graphics/drawable/Drawable;->getMinimumWidth()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v10}, Landroid/graphics/drawable/Drawable;->getMinimumHeight()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     invoke-virtual {v10, v13, v13, v2, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V
a=0;// 
a=0;//     .line 178
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/FriendCenterActivity;->drag:Landroid/widget/Button;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/Button;);
a=0;//     invoke-virtual {v2, v10, v4, v4, v4}, Landroid/widget/Button;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 179
a=0;//     new-instance v0, Landroid/view/animation/ScaleAnimation;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/view/animation/ScaleAnimation;);
a=0;//     const/high16 v2, 0x40400000    # 3.0f
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/high16 v4, 0x40400000    # 3.0f
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const/4 v5, 0x2
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     const/4 v7, 0x2
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     move v3, v1
a=0;// 
a=0;//     move v8, v6
a=0;// 
a=0;//     #v8=(Null);
a=0;//     invoke-direct/range {v0 .. v8}, Landroid/view/animation/ScaleAnimation;-><init>(FFFFIFIF)V
a=0;// 
a=0;//     .line 180
a=0;//     .local v0, "scaleAnimation":Landroid/view/animation/ScaleAnimation;
a=0;//     #v0=(Reference,Landroid/view/animation/ScaleAnimation;);
a=0;//     invoke-virtual {v0, v13}, Landroid/view/animation/ScaleAnimation;->setRepeatCount(I)V
a=0;// 
a=0;//     .line 181
a=0;//     const-wide/16 v1, 0x3e8
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/view/animation/ScaleAnimation;->setDuration(J)V
a=0;// 
a=0;//     .line 182
a=0;//     new-instance v11, Landroid/view/animation/TranslateAnimation;
a=0;// 
a=0;//     #v11=(UninitRef,Landroid/view/animation/TranslateAnimation;);
a=0;//     const/high16 v1, -0x3d380000    # -100.0f
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-direct {v11, v6, v6, v6, v1}, Landroid/view/animation/TranslateAnimation;-><init>(FFFF)V
a=0;// 
a=0;//     .line 183
a=0;//     .local v11, "translateAnimation":Landroid/view/animation/TranslateAnimation;
a=0;//     #v11=(Reference,Landroid/view/animation/TranslateAnimation;);
a=0;//     invoke-virtual {v11, v13}, Landroid/view/animation/TranslateAnimation;->setRepeatCount(I)V
a=0;// 
a=0;//     .line 184
a=0;//     const-wide/16 v1, 0x3e8
a=0;// 
a=0;//     #v1=(LongLo);
a=0;//     invoke-virtual {v11, v1, v2}, Landroid/view/animation/TranslateAnimation;->setDuration(J)V
a=0;// 
a=0;//     .line 185
a=0;//     new-instance v9, Landroid/view/animation/AnimationSet;
a=0;// 
a=0;//     #v9=(UninitRef,Landroid/view/animation/AnimationSet;);
a=0;//     invoke-direct {v9, v12}, Landroid/view/animation/AnimationSet;-><init>(Z)V
a=0;// 
a=0;//     .line 186
a=0;//     .local v9, "animationSet":Landroid/view/animation/AnimationSet;
a=0;//     #v9=(Reference,Landroid/view/animation/AnimationSet;);
a=0;//     invoke-virtual {v9, v0}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V
a=0;// 
a=0;//     .line 187
a=0;//     invoke-virtual {v9, v11}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V
a=0;// 
a=0;//     .line 188
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/FriendCenterActivity;->add1:Landroid/widget/TextView;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {v1, v9}, Landroid/widget/TextView;->startAnimation(Landroid/view/animation/Animation;)V
a=0;// 
a=0;//     .line 189
a=0;//     new-instance v1, Lcom/twocloo/com/cn/activitys/FriendCenterActivity$2;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/activitys/FriendCenterActivity$2;);
a=0;//     invoke-direct {v1, p0}, Lcom/twocloo/com/cn/activitys/FriendCenterActivity$2;-><init>(Lcom/twocloo/com/cn/activitys/FriendCenterActivity;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/FriendCenterActivity$2;);
a=0;//     invoke-virtual {v9, v1}, Landroid/view/animation/AnimationSet;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V
a=0;// 
a=0;//     .line 208
a=0;//     iput-boolean v12, p0, Lcom/twocloo/com/cn/activitys/FriendCenterActivity;->isDrag:Z
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected onCreate(Landroid/os/Bundle;)V
a=0;//     .locals 3
a=0;//     .param p1, "savedInstanceState"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 113
a=0;//     invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 114
a=0;//     sget v0, Lcom/twocloo/com/cn/R$layout;->friend_center_new:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/FriendCenterActivity;->setContentView(I)V
a=0;// 
a=0;//     .line 115
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/FriendCenterActivity;->initView()V
a=0;// 
a=0;//     .line 116
a=0;//     sget v0, Lcom/twocloo/com/cn/R$anim;->push_left_in:I
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$anim;->push_left_out:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/twocloo/com/cn/activitys/FriendCenterActivity;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 117
a=0;//     new-instance v0, Lcom/twocloo/com/cn/adapters/FriendPhotoGridviewAdapter;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/adapters/FriendPhotoGridviewAdapter;);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/FriendCenterActivity;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/FriendCenterActivity;->photo_List:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0, v1, v2}, Lcom/twocloo/com/cn/adapters/FriendPhotoGridviewAdapter;-><init>(Landroid/content/Context;Ljava/util/ArrayList;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/adapters/FriendPhotoGridviewAdapter;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/FriendCenterActivity;->photoGridviewAdapter:Lcom/twocloo/com/cn/adapters/FriendPhotoGridviewAdapter;
a=0;// 
a=0;//     .line 118
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/FriendCenterActivity;->gridView:Landroid/widget/GridView;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/FriendCenterActivity;->photoGridviewAdapter:Lcom/twocloo/com/cn/adapters/FriendPhotoGridviewAdapter;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/GridView;->setAdapter(Landroid/widget/ListAdapter;)V
a=0;// 
a=0;//     .line 119
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/FriendCenterActivity;->photo_List:Ljava/util/ArrayList;
a=0;// 
a=0;//     const-string v1, ""
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 120
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/FriendCenterActivity;->photo_List:Ljava/util/ArrayList;
a=0;// 
a=0;//     const-string v1, ""
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 121
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/FriendCenterActivity;->photo_List:Ljava/util/ArrayList;
a=0;// 
a=0;//     const-string v1, ""
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 122
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/FriendCenterActivity;->photo_List:Ljava/util/ArrayList;
a=0;// 
a=0;//     const-string v1, ""
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 123
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/FriendCenterActivity;->photo_List:Ljava/util/ArrayList;
a=0;// 
a=0;//     const-string v1, ""
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 124
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/FriendCenterActivity;->photo_List:Ljava/util/ArrayList;
a=0;// 
a=0;//     const-string v1, ""
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 125
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/FriendCenterActivity;->gridView:Landroid/widget/GridView;
a=0;// 
a=0;//     new-instance v1, Lcom/twocloo/com/cn/activitys/FriendCenterActivity$1;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/activitys/FriendCenterActivity$1;);
a=0;//     invoke-direct {v1, p0}, Lcom/twocloo/com/cn/activitys/FriendCenterActivity$1;-><init>(Lcom/twocloo/com/cn/activitys/FriendCenterActivity;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/FriendCenterActivity$1;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/GridView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V
a=0;// 
a=0;//     .line 135
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onDestroy()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 224
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onDestroy()V
a=0;// 
a=0;//     .line 225
a=0;//     sget v0, Lcom/twocloo/com/cn/R$anim;->push_right_in:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$anim;->push_right_out:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/twocloo/com/cn/activitys/FriendCenterActivity;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 226
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onPause()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 231
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onPause()V
a=0;// 
a=0;//     .line 232
a=0;//     sget v0, Lcom/twocloo/com/cn/R$anim;->push_right_in:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$anim;->push_right_out:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/twocloo/com/cn/activitys/FriendCenterActivity;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 233
a=0;//     return-void
a=0;// .end method
}}
