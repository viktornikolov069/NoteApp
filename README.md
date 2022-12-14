# NoteApp

## *Viktor Nikolov*

**NoteApp** is a simple app for creating and saving personal notes. Some personal changes were made that differ from the original app made by Android Geek. There is some Bulgarian text added and also there are some changes to the buttons.


## Functionality

The following **functionality** is completed:

* [x] User can add a new note by pressing the green add button.
* [x] User can modify existing rows by clicking on them.

**TO DO**
* [ ] Fix the Recycler View DiffUtil bug.

## Video Of RecyclerView Bug

Here's a video of the bug. 

<img src='https://github.com/viktornikolov069/NoteApp/blob/master/note_app_recycle_bug.gif' />

GIF created with [LiceCap](http://www.cockos.com/licecap/).

## Notes

The main challenge is to fix the RecycleView bug. Users can't add more than 12 items without them beginning to repeat and change order. Some items are even lost. I think it has something to do with DiffUtil.


## License

    Copyright [2022] [Viktor Nikolov]

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
