package com.twocloo.com.cn.beans.orm; class SupportAuthorRecord { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/beans/orm/SupportAuthorRecord;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SupportAuthorRecord.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/twocloo/base/db/orm/TableAble;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation runtime Lcom/j256/ormlite/table/DatabaseTable;
a=0;//     tableName = "support_author_record"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final ADD_TIME:Ljava/lang/String; = "add_time"
a=0;// 
a=0;// .field public static final BOOK_ID:Ljava/lang/String; = "book_id"
a=0;// 
a=0;// .field public static final DATE_FORMAT:Ljava/lang/String; = "yyyy-MM-dd"
a=0;// 
a=0;// .field public static final ID:Ljava/lang/String; = "id"
a=0;// 
a=0;// .field public static final USER_ID:Ljava/lang/String; = "user_id"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private addTime:Ljava/util/Date;
a=0;//     .annotation runtime Lcom/j256/ormlite/field/DatabaseField;
a=0;//         columnName = "add_time"
a=0;//         dataType = .enum Lcom/j256/ormlite/field/DataType;->DATE_STRING:Lcom/j256/ormlite/field/DataType;
a=0;//         format = "yyyy-MM-dd"
a=0;//         useGetSet = true
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private bookId:Ljava/lang/String;
a=0;//     .annotation runtime Lcom/j256/ormlite/field/DatabaseField;
a=0;//         columnName = "book_id"
a=0;//         useGetSet = true
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private id:I
a=0;//     .annotation runtime Lcom/j256/ormlite/field/DatabaseField;
a=0;//         columnName = "id"
a=0;//         generatedId = true
a=0;//         useGetSet = true
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private userId:Ljava/lang/String;
a=0;//     .annotation runtime Lcom/j256/ormlite/field/DatabaseField;
a=0;//         columnName = "user_id"
a=0;//         useGetSet = true
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 14
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/beans/orm/SupportAuthorRecord;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getAddTime()Ljava/util/Date;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 80
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/beans/orm/SupportAuthorRecord;->addTime:Ljava/util/Date;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Date;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getBookId()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 65
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/beans/orm/SupportAuthorRecord;->bookId:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getId()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 35
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/beans/orm/SupportAuthorRecord;->id:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getUserId()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 50
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/beans/orm/SupportAuthorRecord;->userId:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public setAddTime(Ljava/util/Date;)V
a=0;//     .locals 0
a=0;//     .param p1, "addTime"    # Ljava/util/Date;
a=0;// 
a=0;//     .prologue
a=0;//     .line 88
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/beans/orm/SupportAuthorRecord;->addTime:Ljava/util/Date;
a=0;// 
a=0;//     .line 89
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setBookId(Ljava/lang/String;)V
a=0;//     .locals 0
a=0;//     .param p1, "bookId"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 73
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/beans/orm/SupportAuthorRecord;->bookId:Ljava/lang/String;
a=0;// 
a=0;//     .line 74
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setId(I)V
a=0;//     .locals 0
a=0;//     .param p1, "id"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 43
a=0;//     iput p1, p0, Lcom/twocloo/com/cn/beans/orm/SupportAuthorRecord;->id:I
a=0;// 
a=0;//     .line 44
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setUserId(Ljava/lang/String;)V
a=0;//     .locals 0
a=0;//     .param p1, "userId"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 58
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/beans/orm/SupportAuthorRecord;->userId:Ljava/lang/String;
a=0;// 
a=0;//     .line 59
a=0;//     return-void
a=0;// .end method
}}
