package com.twocloo.com.cn.beans; class WheelMain { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/beans/WheelMain;
a=0;// .super Ljava/lang/Object;
a=0;// .source "WheelMain.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static END_YEAR:I
a=0;// 
a=0;// .field private static START_YEAR:I
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private hasSelectTime:Z
a=0;// 
a=0;// .field public screenheight:I
a=0;// 
a=0;// .field private view:Landroid/view/View;
a=0;// 
a=0;// .field private wv_day:Lcom/twocloo/com/cn/beans/WheelView;
a=0;// 
a=0;// .field private wv_hours:Lcom/twocloo/com/cn/beans/WheelView;
a=0;// 
a=0;// .field private wv_mins:Lcom/twocloo/com/cn/beans/WheelView;
a=0;// 
a=0;// .field private wv_month:Lcom/twocloo/com/cn/beans/WheelView;
a=0;// 
a=0;// .field private wv_year:Lcom/twocloo/com/cn/beans/WheelView;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 25
a=0;//     const/16 v0, 0x708
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     sput v0, Lcom/twocloo/com/cn/beans/WheelMain;->START_YEAR:I
a=0;// 
a=0;//     const/16 v0, 0x834
a=0;// 
a=0;//     sput v0, Lcom/twocloo/com/cn/beans/WheelMain;->END_YEAR:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/view/View;)V
a=0;//     .locals 1
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 52
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 53
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/beans/WheelMain;);
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/beans/WheelMain;->view:Landroid/view/View;
a=0;// 
a=0;//     .line 54
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/twocloo/com/cn/beans/WheelMain;->hasSelectTime:Z
a=0;// 
a=0;//     .line 55
a=0;//     invoke-virtual {p0, p1}, Lcom/twocloo/com/cn/beans/WheelMain;->setView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 56
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/view/View;Z)V
a=0;//     .locals 0
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;//     .param p2, "hasSelectTime"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 59
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 60
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/beans/WheelMain;);
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/beans/WheelMain;->view:Landroid/view/View;
a=0;// 
a=0;//     .line 61
a=0;//     iput-boolean p2, p0, Lcom/twocloo/com/cn/beans/WheelMain;->hasSelectTime:Z
a=0;// 
a=0;//     .line 62
a=0;//     invoke-virtual {p0, p1}, Lcom/twocloo/com/cn/beans/WheelMain;->setView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 63
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 25
a=0;//     sget v0, Lcom/twocloo/com/cn/beans/WheelMain;->START_YEAR:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1(Lcom/twocloo/com/cn/beans/WheelMain;)Lcom/twocloo/com/cn/beans/WheelView;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 19
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/beans/WheelMain;->wv_month:Lcom/twocloo/com/cn/beans/WheelView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/WheelView;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$2(Lcom/twocloo/com/cn/beans/WheelMain;)Lcom/twocloo/com/cn/beans/WheelView;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 20
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/beans/WheelMain;->wv_day:Lcom/twocloo/com/cn/beans/WheelView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/WheelView;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$3(Lcom/twocloo/com/cn/beans/WheelMain;)Lcom/twocloo/com/cn/beans/WheelView;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 18
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/beans/WheelMain;->wv_year:Lcom/twocloo/com/cn/beans/WheelView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/WheelView;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static getEND_YEAR()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 44
a=0;//     sget v0, Lcom/twocloo/com/cn/beans/WheelMain;->END_YEAR:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static getSTART_YEAR()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 36
a=0;//     sget v0, Lcom/twocloo/com/cn/beans/WheelMain;->START_YEAR:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static setEND_YEAR(I)V
a=0;//     .locals 0
a=0;//     .param p0, "eND_YEAR"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 48
a=0;//     sput p0, Lcom/twocloo/com/cn/beans/WheelMain;->END_YEAR:I
a=0;// 
a=0;//     .line 49
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static setSTART_YEAR(I)V
a=0;//     .locals 0
a=0;//     .param p0, "sTART_YEAR"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 40
a=0;//     sput p0, Lcom/twocloo/com/cn/beans/WheelMain;->START_YEAR:I
a=0;// 
a=0;//     .line 41
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getTime()Ljava/lang/String;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 188
a=0;//     new-instance v0, Ljava/lang/StringBuffer;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuffer;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V
a=0;// 
a=0;//     .line 189
a=0;//     .local v0, "sb":Ljava/lang/StringBuffer;
a=0;//     #v0=(Reference,Ljava/lang/StringBuffer;);
a=0;//     iget-boolean v1, p0, Lcom/twocloo/com/cn/beans/WheelMain;->hasSelectTime:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 190
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/beans/WheelMain;->wv_year:Lcom/twocloo/com/cn/beans/WheelView;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/beans/WheelView;);
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/WheelView;->getCurrentItem()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     sget v2, Lcom/twocloo/com/cn/beans/WheelMain;->START_YEAR:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/2addr v1, v2
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuffer;);
a=0;//     const-string v2, "-"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/beans/WheelMain;->wv_month:Lcom/twocloo/com/cn/beans/WheelView;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/WheelView;->getCurrentItem()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "-"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 191
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/beans/WheelMain;->wv_day:Lcom/twocloo/com/cn/beans/WheelView;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/WheelView;->getCurrentItem()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 195
a=0;//     :goto_0
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     return-object v1
a=0;// 
a=0;//     .line 193
a=0;//     :cond_0
a=0;//     #v1=(Boolean);v2=(Uninit);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/beans/WheelMain;->wv_year:Lcom/twocloo/com/cn/beans/WheelView;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/beans/WheelView;);
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/WheelView;->getCurrentItem()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     sget v2, Lcom/twocloo/com/cn/beans/WheelMain;->START_YEAR:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/2addr v1, v2
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuffer;);
a=0;//     const-string v2, "-"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/beans/WheelMain;->wv_month:Lcom/twocloo/com/cn/beans/WheelView;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/WheelView;->getCurrentItem()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "-"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 194
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/beans/WheelMain;->wv_day:Lcom/twocloo/com/cn/beans/WheelView;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/WheelView;->getCurrentItem()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/beans/WheelMain;->wv_hours:Lcom/twocloo/com/cn/beans/WheelView;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/WheelView;->getCurrentItem()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, ":"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/beans/WheelMain;->wv_mins:Lcom/twocloo/com/cn/beans/WheelView;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/WheelView;->getCurrentItem()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getView()Landroid/view/View;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 28
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/beans/WheelMain;->view:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public initDateTimePicker(III)V
a=0;//     .locals 6
a=0;//     .param p1, "year"    # I
a=0;//     .param p2, "month"    # I
a=0;//     .param p3, "day"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 66
a=0;//     #v4=(Null);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/WheelMain;);
a=0;//     move v1, p1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move v2, p2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move v3, p3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     move v5, v4
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual/range {v0 .. v5}, Lcom/twocloo/com/cn/beans/WheelMain;->initDateTimePicker(IIIII)V
a=0;// 
a=0;//     .line 67
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public initDateTimePicker(IIIII)V
a=0;//     .locals 12
a=0;//     .param p1, "year"    # I
a=0;//     .param p2, "month"    # I
a=0;//     .param p3, "day"    # I
a=0;//     .param p4, "h"    # I
a=0;//     .param p5, "m"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 77
a=0;//     const/4 v8, 0x7
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     new-array v3, v8, [Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     const-string v9, "1"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     aput-object v9, v3, v8
a=0;// 
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     #v8=(One);
a=0;//     const-string v9, "3"
a=0;// 
a=0;//     aput-object v9, v3, v8
a=0;// 
a=0;//     const/4 v8, 0x2
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     const-string v9, "5"
a=0;// 
a=0;//     aput-object v9, v3, v8
a=0;// 
a=0;//     const/4 v8, 0x3
a=0;// 
a=0;//     const-string v9, "7"
a=0;// 
a=0;//     aput-object v9, v3, v8
a=0;// 
a=0;//     const/4 v8, 0x4
a=0;// 
a=0;//     const-string v9, "8"
a=0;// 
a=0;//     aput-object v9, v3, v8
a=0;// 
a=0;//     const/4 v8, 0x5
a=0;// 
a=0;//     const-string v9, "10"
a=0;// 
a=0;//     aput-object v9, v3, v8
a=0;// 
a=0;//     const/4 v8, 0x6
a=0;// 
a=0;//     const-string v9, "12"
a=0;// 
a=0;//     aput-object v9, v3, v8
a=0;// 
a=0;//     .line 78
a=0;//     .local v3, "months_big":[Ljava/lang/String;
a=0;//     const/4 v8, 0x4
a=0;// 
a=0;//     new-array v4, v8, [Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     const-string v9, "4"
a=0;// 
a=0;//     aput-object v9, v4, v8
a=0;// 
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     #v8=(One);
a=0;//     const-string v9, "6"
a=0;// 
a=0;//     aput-object v9, v4, v8
a=0;// 
a=0;//     const/4 v8, 0x2
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     const-string v9, "9"
a=0;// 
a=0;//     aput-object v9, v4, v8
a=0;// 
a=0;//     const/4 v8, 0x3
a=0;// 
a=0;//     const-string v9, "11"
a=0;// 
a=0;//     aput-object v9, v4, v8
a=0;// 
a=0;//     .line 80
a=0;//     .local v4, "months_little":[Ljava/lang/String;
a=0;//     invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 81
a=0;//     .local v1, "list_big":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
a=0;//     #v1=(Reference,Ljava/util/List;);
a=0;//     invoke-static {v4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 84
a=0;//     .local v2, "list_little":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
a=0;//     #v2=(Reference,Ljava/util/List;);
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/beans/WheelMain;->view:Landroid/view/View;
a=0;// 
a=0;//     #v8=(Reference,Landroid/view/View;);
a=0;//     sget v9, Lcom/twocloo/com/cn/R$id;->year:I
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     invoke-virtual {v8, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     check-cast v8, Lcom/twocloo/com/cn/beans/WheelView;
a=0;// 
a=0;//     iput-object v8, p0, Lcom/twocloo/com/cn/beans/WheelMain;->wv_year:Lcom/twocloo/com/cn/beans/WheelView;
a=0;// 
a=0;//     .line 85
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/beans/WheelMain;->wv_year:Lcom/twocloo/com/cn/beans/WheelView;
a=0;// 
a=0;//     new-instance v9, Lcom/twocloo/com/cn/adapters/NumericWheelAdapter;
a=0;// 
a=0;//     #v9=(UninitRef,Lcom/twocloo/com/cn/adapters/NumericWheelAdapter;);
a=0;//     sget v10, Lcom/twocloo/com/cn/beans/WheelMain;->START_YEAR:I
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     sget v11, Lcom/twocloo/com/cn/beans/WheelMain;->END_YEAR:I
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     invoke-direct {v9, v10, v11}, Lcom/twocloo/com/cn/adapters/NumericWheelAdapter;-><init>(II)V
a=0;// 
a=0;//     #v9=(Reference,Lcom/twocloo/com/cn/adapters/NumericWheelAdapter;);
a=0;//     invoke-virtual {v8, v9}, Lcom/twocloo/com/cn/beans/WheelView;->setAdapter(Lcom/twocloo/com/cn/adapters/WheelAdapter;)V
a=0;// 
a=0;//     .line 86
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/beans/WheelMain;->wv_year:Lcom/twocloo/com/cn/beans/WheelView;
a=0;// 
a=0;//     const/4 v9, 0x1
a=0;// 
a=0;//     #v9=(One);
a=0;//     invoke-virtual {v8, v9}, Lcom/twocloo/com/cn/beans/WheelView;->setCyclic(Z)V
a=0;// 
a=0;//     .line 87
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/beans/WheelMain;->wv_year:Lcom/twocloo/com/cn/beans/WheelView;
a=0;// 
a=0;//     const-string v9, "\u5e74"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v9}, Lcom/twocloo/com/cn/beans/WheelView;->setLabel(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 88
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/beans/WheelMain;->wv_year:Lcom/twocloo/com/cn/beans/WheelView;
a=0;// 
a=0;//     sget v9, Lcom/twocloo/com/cn/beans/WheelMain;->START_YEAR:I
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     sub-int v9, p1, v9
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Lcom/twocloo/com/cn/beans/WheelView;->setCurrentItem(I)V
a=0;// 
a=0;//     .line 91
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/beans/WheelMain;->view:Landroid/view/View;
a=0;// 
a=0;//     sget v9, Lcom/twocloo/com/cn/R$id;->month:I
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     check-cast v8, Lcom/twocloo/com/cn/beans/WheelView;
a=0;// 
a=0;//     iput-object v8, p0, Lcom/twocloo/com/cn/beans/WheelMain;->wv_month:Lcom/twocloo/com/cn/beans/WheelView;
a=0;// 
a=0;//     .line 92
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/beans/WheelMain;->wv_month:Lcom/twocloo/com/cn/beans/WheelView;
a=0;// 
a=0;//     new-instance v9, Lcom/twocloo/com/cn/adapters/NumericWheelAdapter;
a=0;// 
a=0;//     #v9=(UninitRef,Lcom/twocloo/com/cn/adapters/NumericWheelAdapter;);
a=0;//     const/4 v10, 0x1
a=0;// 
a=0;//     #v10=(One);
a=0;//     const/16 v11, 0xc
a=0;// 
a=0;//     #v11=(PosByte);
a=0;//     invoke-direct {v9, v10, v11}, Lcom/twocloo/com/cn/adapters/NumericWheelAdapter;-><init>(II)V
a=0;// 
a=0;//     #v9=(Reference,Lcom/twocloo/com/cn/adapters/NumericWheelAdapter;);
a=0;//     invoke-virtual {v8, v9}, Lcom/twocloo/com/cn/beans/WheelView;->setAdapter(Lcom/twocloo/com/cn/adapters/WheelAdapter;)V
a=0;// 
a=0;//     .line 93
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/beans/WheelMain;->wv_month:Lcom/twocloo/com/cn/beans/WheelView;
a=0;// 
a=0;//     const/4 v9, 0x1
a=0;// 
a=0;//     #v9=(One);
a=0;//     invoke-virtual {v8, v9}, Lcom/twocloo/com/cn/beans/WheelView;->setCyclic(Z)V
a=0;// 
a=0;//     .line 94
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/beans/WheelMain;->wv_month:Lcom/twocloo/com/cn/beans/WheelView;
a=0;// 
a=0;//     const-string v9, "\u6708"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v9}, Lcom/twocloo/com/cn/beans/WheelView;->setLabel(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 95
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/beans/WheelMain;->wv_month:Lcom/twocloo/com/cn/beans/WheelView;
a=0;// 
a=0;//     invoke-virtual {v8, p2}, Lcom/twocloo/com/cn/beans/WheelView;->setCurrentItem(I)V
a=0;// 
a=0;//     .line 98
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/beans/WheelMain;->view:Landroid/view/View;
a=0;// 
a=0;//     sget v9, Lcom/twocloo/com/cn/R$id;->day:I
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     invoke-virtual {v8, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     check-cast v8, Lcom/twocloo/com/cn/beans/WheelView;
a=0;// 
a=0;//     iput-object v8, p0, Lcom/twocloo/com/cn/beans/WheelMain;->wv_day:Lcom/twocloo/com/cn/beans/WheelView;
a=0;// 
a=0;//     .line 99
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/beans/WheelMain;->wv_day:Lcom/twocloo/com/cn/beans/WheelView;
a=0;// 
a=0;//     const/4 v9, 0x1
a=0;// 
a=0;//     #v9=(One);
a=0;//     invoke-virtual {v8, v9}, Lcom/twocloo/com/cn/beans/WheelView;->setCyclic(Z)V
a=0;// 
a=0;//     .line 101
a=0;//     add-int/lit8 v8, p2, 0x1
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v1, v8}, Ljava/util/List;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_0
a=0;// 
a=0;//     .line 102
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/beans/WheelMain;->wv_day:Lcom/twocloo/com/cn/beans/WheelView;
a=0;// 
a=0;//     #v8=(Reference,Lcom/twocloo/com/cn/beans/WheelView;);
a=0;//     new-instance v9, Lcom/twocloo/com/cn/adapters/NumericWheelAdapter;
a=0;// 
a=0;//     #v9=(UninitRef,Lcom/twocloo/com/cn/adapters/NumericWheelAdapter;);
a=0;//     const/4 v10, 0x1
a=0;// 
a=0;//     const/16 v11, 0x1f
a=0;// 
a=0;//     invoke-direct {v9, v10, v11}, Lcom/twocloo/com/cn/adapters/NumericWheelAdapter;-><init>(II)V
a=0;// 
a=0;//     #v9=(Reference,Lcom/twocloo/com/cn/adapters/NumericWheelAdapter;);
a=0;//     invoke-virtual {v8, v9}, Lcom/twocloo/com/cn/beans/WheelView;->setAdapter(Lcom/twocloo/com/cn/adapters/WheelAdapter;)V
a=0;// 
a=0;//     .line 112
a=0;//     :goto_0
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/beans/WheelMain;->wv_day:Lcom/twocloo/com/cn/beans/WheelView;
a=0;// 
a=0;//     const-string v9, "\u65e5"
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Lcom/twocloo/com/cn/beans/WheelView;->setLabel(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 113
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/beans/WheelMain;->wv_day:Lcom/twocloo/com/cn/beans/WheelView;
a=0;// 
a=0;//     add-int/lit8 v9, p3, -0x1
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     invoke-virtual {v8, v9}, Lcom/twocloo/com/cn/beans/WheelView;->setCurrentItem(I)V
a=0;// 
a=0;//     .line 115
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/beans/WheelMain;->view:Landroid/view/View;
a=0;// 
a=0;//     sget v9, Lcom/twocloo/com/cn/R$id;->hour:I
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     check-cast v8, Lcom/twocloo/com/cn/beans/WheelView;
a=0;// 
a=0;//     iput-object v8, p0, Lcom/twocloo/com/cn/beans/WheelMain;->wv_hours:Lcom/twocloo/com/cn/beans/WheelView;
a=0;// 
a=0;//     .line 116
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/beans/WheelMain;->view:Landroid/view/View;
a=0;// 
a=0;//     sget v9, Lcom/twocloo/com/cn/R$id;->min:I
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     check-cast v8, Lcom/twocloo/com/cn/beans/WheelView;
a=0;// 
a=0;//     iput-object v8, p0, Lcom/twocloo/com/cn/beans/WheelMain;->wv_mins:Lcom/twocloo/com/cn/beans/WheelView;
a=0;// 
a=0;//     .line 117
a=0;//     iget-boolean v8, p0, Lcom/twocloo/com/cn/beans/WheelMain;->hasSelectTime:Z
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_5
a=0;// 
a=0;//     .line 118
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/beans/WheelMain;->wv_hours:Lcom/twocloo/com/cn/beans/WheelView;
a=0;// 
a=0;//     #v8=(Reference,Lcom/twocloo/com/cn/beans/WheelView;);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     invoke-virtual {v8, v9}, Lcom/twocloo/com/cn/beans/WheelView;->setVisibility(I)V
a=0;// 
a=0;//     .line 119
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/beans/WheelMain;->wv_mins:Lcom/twocloo/com/cn/beans/WheelView;
a=0;// 
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Lcom/twocloo/com/cn/beans/WheelView;->setVisibility(I)V
a=0;// 
a=0;//     .line 121
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/beans/WheelMain;->wv_hours:Lcom/twocloo/com/cn/beans/WheelView;
a=0;// 
a=0;//     new-instance v9, Lcom/twocloo/com/cn/adapters/NumericWheelAdapter;
a=0;// 
a=0;//     #v9=(UninitRef,Lcom/twocloo/com/cn/adapters/NumericWheelAdapter;);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     const/16 v11, 0x17
a=0;// 
a=0;//     invoke-direct {v9, v10, v11}, Lcom/twocloo/com/cn/adapters/NumericWheelAdapter;-><init>(II)V
a=0;// 
a=0;//     #v9=(Reference,Lcom/twocloo/com/cn/adapters/NumericWheelAdapter;);
a=0;//     invoke-virtual {v8, v9}, Lcom/twocloo/com/cn/beans/WheelView;->setAdapter(Lcom/twocloo/com/cn/adapters/WheelAdapter;)V
a=0;// 
a=0;//     .line 122
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/beans/WheelMain;->wv_hours:Lcom/twocloo/com/cn/beans/WheelView;
a=0;// 
a=0;//     const/4 v9, 0x1
a=0;// 
a=0;//     #v9=(One);
a=0;//     invoke-virtual {v8, v9}, Lcom/twocloo/com/cn/beans/WheelView;->setCyclic(Z)V
a=0;// 
a=0;//     .line 123
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/beans/WheelMain;->wv_hours:Lcom/twocloo/com/cn/beans/WheelView;
a=0;// 
a=0;//     const-string v9, "\u65f6"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v9}, Lcom/twocloo/com/cn/beans/WheelView;->setLabel(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 124
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/beans/WheelMain;->wv_hours:Lcom/twocloo/com/cn/beans/WheelView;
a=0;// 
a=0;//     move/from16 v0, p4
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v8, v0}, Lcom/twocloo/com/cn/beans/WheelView;->setCurrentItem(I)V
a=0;// 
a=0;//     .line 126
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/beans/WheelMain;->wv_mins:Lcom/twocloo/com/cn/beans/WheelView;
a=0;// 
a=0;//     new-instance v9, Lcom/twocloo/com/cn/adapters/NumericWheelAdapter;
a=0;// 
a=0;//     #v9=(UninitRef,Lcom/twocloo/com/cn/adapters/NumericWheelAdapter;);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     const/16 v11, 0x3b
a=0;// 
a=0;//     invoke-direct {v9, v10, v11}, Lcom/twocloo/com/cn/adapters/NumericWheelAdapter;-><init>(II)V
a=0;// 
a=0;//     #v9=(Reference,Lcom/twocloo/com/cn/adapters/NumericWheelAdapter;);
a=0;//     invoke-virtual {v8, v9}, Lcom/twocloo/com/cn/beans/WheelView;->setAdapter(Lcom/twocloo/com/cn/adapters/WheelAdapter;)V
a=0;// 
a=0;//     .line 127
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/beans/WheelMain;->wv_mins:Lcom/twocloo/com/cn/beans/WheelView;
a=0;// 
a=0;//     const/4 v9, 0x1
a=0;// 
a=0;//     #v9=(One);
a=0;//     invoke-virtual {v8, v9}, Lcom/twocloo/com/cn/beans/WheelView;->setCyclic(Z)V
a=0;// 
a=0;//     .line 128
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/beans/WheelMain;->wv_mins:Lcom/twocloo/com/cn/beans/WheelView;
a=0;// 
a=0;//     const-string v9, "\u5206"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v9}, Lcom/twocloo/com/cn/beans/WheelView;->setLabel(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 129
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/beans/WheelMain;->wv_mins:Lcom/twocloo/com/cn/beans/WheelView;
a=0;// 
a=0;//     move/from16 v0, p5
a=0;// 
a=0;//     invoke-virtual {v8, v0}, Lcom/twocloo/com/cn/beans/WheelView;->setCurrentItem(I)V
a=0;// 
a=0;//     .line 136
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v9=(Conflicted);v10=(Boolean);
a=0;//     new-instance v7, Lcom/twocloo/com/cn/beans/WheelMain$1;
a=0;// 
a=0;//     #v7=(UninitRef,Lcom/twocloo/com/cn/beans/WheelMain$1;);
a=0;//     invoke-direct {v7, p0, v1, v2}, Lcom/twocloo/com/cn/beans/WheelMain$1;-><init>(Lcom/twocloo/com/cn/beans/WheelMain;Ljava/util/List;Ljava/util/List;)V
a=0;// 
a=0;//     .line 153
a=0;//     .local v7, "wheelListener_year":Lcom/twocloo/com/cn/beans/OnWheelChangedListener;
a=0;//     #v7=(Reference,Lcom/twocloo/com/cn/beans/WheelMain$1;);
a=0;//     new-instance v6, Lcom/twocloo/com/cn/beans/WheelMain$2;
a=0;// 
a=0;//     #v6=(UninitRef,Lcom/twocloo/com/cn/beans/WheelMain$2;);
a=0;//     invoke-direct {v6, p0, v1, v2}, Lcom/twocloo/com/cn/beans/WheelMain$2;-><init>(Lcom/twocloo/com/cn/beans/WheelMain;Ljava/util/List;Ljava/util/List;)V
a=0;// 
a=0;//     .line 170
a=0;//     .local v6, "wheelListener_month":Lcom/twocloo/com/cn/beans/OnWheelChangedListener;
a=0;//     #v6=(Reference,Lcom/twocloo/com/cn/beans/WheelMain$2;);
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/beans/WheelMain;->wv_year:Lcom/twocloo/com/cn/beans/WheelView;
a=0;// 
a=0;//     invoke-virtual {v8, v7}, Lcom/twocloo/com/cn/beans/WheelView;->addChangingListener(Lcom/twocloo/com/cn/beans/OnWheelChangedListener;)V
a=0;// 
a=0;//     .line 171
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/beans/WheelMain;->wv_month:Lcom/twocloo/com/cn/beans/WheelView;
a=0;// 
a=0;//     invoke-virtual {v8, v6}, Lcom/twocloo/com/cn/beans/WheelView;->addChangingListener(Lcom/twocloo/com/cn/beans/OnWheelChangedListener;)V
a=0;// 
a=0;//     .line 174
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 175
a=0;//     .local v5, "textSize":I
a=0;//     #v5=(Null);
a=0;//     iget-boolean v8, p0, Lcom/twocloo/com/cn/beans/WheelMain;->hasSelectTime:Z
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_6
a=0;// 
a=0;//     .line 176
a=0;//     iget v8, p0, Lcom/twocloo/com/cn/beans/WheelMain;->screenheight:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     div-int/lit8 v8, v8, 0x64
a=0;// 
a=0;//     mul-int/lit8 v5, v8, 0x3
a=0;// 
a=0;//     .line 179
a=0;//     :goto_2
a=0;//     #v5=(Integer);
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/beans/WheelMain;->wv_day:Lcom/twocloo/com/cn/beans/WheelView;
a=0;// 
a=0;//     #v8=(Reference,Lcom/twocloo/com/cn/beans/WheelView;);
a=0;//     iput v5, v8, Lcom/twocloo/com/cn/beans/WheelView;->TEXT_SIZE:I
a=0;// 
a=0;//     .line 180
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/beans/WheelMain;->wv_month:Lcom/twocloo/com/cn/beans/WheelView;
a=0;// 
a=0;//     iput v5, v8, Lcom/twocloo/com/cn/beans/WheelView;->TEXT_SIZE:I
a=0;// 
a=0;//     .line 181
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/beans/WheelMain;->wv_year:Lcom/twocloo/com/cn/beans/WheelView;
a=0;// 
a=0;//     iput v5, v8, Lcom/twocloo/com/cn/beans/WheelView;->TEXT_SIZE:I
a=0;// 
a=0;//     .line 182
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/beans/WheelMain;->wv_hours:Lcom/twocloo/com/cn/beans/WheelView;
a=0;// 
a=0;//     iput v5, v8, Lcom/twocloo/com/cn/beans/WheelView;->TEXT_SIZE:I
a=0;// 
a=0;//     .line 183
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/beans/WheelMain;->wv_mins:Lcom/twocloo/com/cn/beans/WheelView;
a=0;// 
a=0;//     iput v5, v8, Lcom/twocloo/com/cn/beans/WheelView;->TEXT_SIZE:I
a=0;// 
a=0;//     .line 185
a=0;//     return-void
a=0;// 
a=0;//     .line 103
a=0;//     .end local v5    # "textSize":I
a=0;//     .end local v6    # "wheelListener_month":Lcom/twocloo/com/cn/beans/OnWheelChangedListener;
a=0;//     .end local v7    # "wheelListener_year":Lcom/twocloo/com/cn/beans/OnWheelChangedListener;
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Boolean);v9=(One);v10=(One);
a=0;//     add-int/lit8 v8, p2, 0x1
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v2, v8}, Ljava/util/List;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_1
a=0;// 
a=0;//     .line 104
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/beans/WheelMain;->wv_day:Lcom/twocloo/com/cn/beans/WheelView;
a=0;// 
a=0;//     #v8=(Reference,Lcom/twocloo/com/cn/beans/WheelView;);
a=0;//     new-instance v9, Lcom/twocloo/com/cn/adapters/NumericWheelAdapter;
a=0;// 
a=0;//     #v9=(UninitRef,Lcom/twocloo/com/cn/adapters/NumericWheelAdapter;);
a=0;//     const/4 v10, 0x1
a=0;// 
a=0;//     const/16 v11, 0x1e
a=0;// 
a=0;//     invoke-direct {v9, v10, v11}, Lcom/twocloo/com/cn/adapters/NumericWheelAdapter;-><init>(II)V
a=0;// 
a=0;//     #v9=(Reference,Lcom/twocloo/com/cn/adapters/NumericWheelAdapter;);
a=0;//     invoke-virtual {v8, v9}, Lcom/twocloo/com/cn/beans/WheelView;->setAdapter(Lcom/twocloo/com/cn/adapters/WheelAdapter;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 107
a=0;//     :cond_1
a=0;//     #v8=(Boolean);v9=(One);
a=0;//     rem-int/lit8 v8, p1, 0x4
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     if-nez v8, :cond_2
a=0;// 
a=0;//     rem-int/lit8 v8, p1, 0x64
a=0;// 
a=0;//     if-nez v8, :cond_3
a=0;// 
a=0;//     :cond_2
a=0;//     rem-int/lit16 v8, p1, 0x190
a=0;// 
a=0;//     if-nez v8, :cond_4
a=0;// 
a=0;//     .line 108
a=0;//     :cond_3
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/beans/WheelMain;->wv_day:Lcom/twocloo/com/cn/beans/WheelView;
a=0;// 
a=0;//     #v8=(Reference,Lcom/twocloo/com/cn/beans/WheelView;);
a=0;//     new-instance v9, Lcom/twocloo/com/cn/adapters/NumericWheelAdapter;
a=0;// 
a=0;//     #v9=(UninitRef,Lcom/twocloo/com/cn/adapters/NumericWheelAdapter;);
a=0;//     const/4 v10, 0x1
a=0;// 
a=0;//     const/16 v11, 0x1d
a=0;// 
a=0;//     invoke-direct {v9, v10, v11}, Lcom/twocloo/com/cn/adapters/NumericWheelAdapter;-><init>(II)V
a=0;// 
a=0;//     #v9=(Reference,Lcom/twocloo/com/cn/adapters/NumericWheelAdapter;);
a=0;//     invoke-virtual {v8, v9}, Lcom/twocloo/com/cn/beans/WheelView;->setAdapter(Lcom/twocloo/com/cn/adapters/WheelAdapter;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 110
a=0;//     :cond_4
a=0;//     #v8=(Integer);v9=(One);
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/beans/WheelMain;->wv_day:Lcom/twocloo/com/cn/beans/WheelView;
a=0;// 
a=0;//     #v8=(Reference,Lcom/twocloo/com/cn/beans/WheelView;);
a=0;//     new-instance v9, Lcom/twocloo/com/cn/adapters/NumericWheelAdapter;
a=0;// 
a=0;//     #v9=(UninitRef,Lcom/twocloo/com/cn/adapters/NumericWheelAdapter;);
a=0;//     const/4 v10, 0x1
a=0;// 
a=0;//     const/16 v11, 0x1c
a=0;// 
a=0;//     invoke-direct {v9, v10, v11}, Lcom/twocloo/com/cn/adapters/NumericWheelAdapter;-><init>(II)V
a=0;// 
a=0;//     #v9=(Reference,Lcom/twocloo/com/cn/adapters/NumericWheelAdapter;);
a=0;//     invoke-virtual {v8, v9}, Lcom/twocloo/com/cn/beans/WheelView;->setAdapter(Lcom/twocloo/com/cn/adapters/WheelAdapter;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 131
a=0;//     :cond_5
a=0;//     #v8=(Boolean);v9=(Integer);
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/beans/WheelMain;->wv_hours:Lcom/twocloo/com/cn/beans/WheelView;
a=0;// 
a=0;//     #v8=(Reference,Lcom/twocloo/com/cn/beans/WheelView;);
a=0;//     const/16 v9, 0x8
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     invoke-virtual {v8, v9}, Lcom/twocloo/com/cn/beans/WheelView;->setVisibility(I)V
a=0;// 
a=0;//     .line 132
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/beans/WheelMain;->wv_mins:Lcom/twocloo/com/cn/beans/WheelView;
a=0;// 
a=0;//     const/16 v9, 0x8
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Lcom/twocloo/com/cn/beans/WheelView;->setVisibility(I)V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 178
a=0;//     .restart local v5    # "textSize":I
a=0;//     .restart local v6    # "wheelListener_month":Lcom/twocloo/com/cn/beans/OnWheelChangedListener;
a=0;//     .restart local v7    # "wheelListener_year":Lcom/twocloo/com/cn/beans/OnWheelChangedListener;
a=0;//     :cond_6
a=0;//     #v0=(Conflicted);v5=(Null);v6=(Reference,Lcom/twocloo/com/cn/beans/WheelMain$2;);v7=(Reference,Lcom/twocloo/com/cn/beans/WheelMain$1;);v8=(Boolean);v9=(Conflicted);v10=(Boolean);
a=0;//     iget v8, p0, Lcom/twocloo/com/cn/beans/WheelMain;->screenheight:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     div-int/lit8 v8, v8, 0x64
a=0;// 
a=0;//     mul-int/lit8 v5, v8, 0x4
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public setView(Landroid/view/View;)V
a=0;//     .locals 0
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 32
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/beans/WheelMain;->view:Landroid/view/View;
a=0;// 
a=0;//     .line 33
a=0;//     return-void
a=0;// .end method
}}
